/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioGitLDP;

/**
 * <h1>Porto</h1>
 * A classe Porto permite definir os a atributos de um porto.
 * <p>
 * Um porto armazena navios.</p>
 *
 * @author João Miranda
 * @version 1.0
 * @since 2021-03-08
 */
public class Porto {

    private int maxNavios; //construtor deve receber como parâmetro a capacidade do porto (número máximo de navios).
    private Navio[] navios; //array para guardar os navios de 0 até maxNavios
    private int numNavios;

    /**
     * Construtor do Porto.
     * <p>
     * É necessário o número maximo de navios que o porto suporta para criar um porto.</p>
     *
     * @param maxNavios
     */
    public Porto(int maxNavios) {
        this.maxNavios = maxNavios;
        this.navios = new Navio[maxNavios];
        this.numNavios = 0;
    }

    /**
     * O adicionaNavio permite adicionar navios ao porto.
     *
     * @param navio
     */
    public void adicionaNavio(Navio navio) {
        //procurar no array para ver se já existe algum com a mesma matricula
        boolean procura = false;
        for (int i = 0; i < numNavios; i++) {
            if (navios[i].matricula.equals(navio.matricula)) {
                procura = true;
            }
        }
        if (procura == false) {
            navios[numNavios] = navio;  //guarda o navio no array na posição numNavios
            numNavios++;

        }

    }

    /**
     * O capacidadeTotal retorna a capacidade Total do porto.
     *
     * @return
     */
    public float capacidadeTotal() {
        float toneladas = 0;

        for (int i = 0; i < numNavios; i++) {
            if (navios[i] instanceof Petroleiro) {
                Petroleiro petroleiro = (Petroleiro) navios[i];
                toneladas = toneladas + petroleiro.getCapacidadeCarga();
                //toneladas = toneladas + ((Petroleiro)navios[i]).getCapacidadeCarga(); //forma alternativa de resolver
            } else if (navios[i] instanceof PortaContentores) {
                PortaContentores portaContentores = (PortaContentores) navios[i];
                toneladas = toneladas + portaContentores.getMaxContentores() * 10;
            }
        }
        return toneladas;
    }
}
