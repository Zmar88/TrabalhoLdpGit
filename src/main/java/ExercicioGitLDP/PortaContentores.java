/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioGitLDP;

/**
 * <p>Porta Contentores</p>
 * A classe Porta Contentores permite definir os a atributos de um navio porta contentores.
 * <p>
 * Um porta contentores é um tipo de navio.</p>
 *
 * @author João Miranda
 * @version 1.0
 * @since 2021-03-08
 */
public class PortaContentores extends Navio {

    //Um petroleiro contem o atributo do número máximo de contentores em adicional a um navio normal.
    private int maxContentores;

    /**
     * Construtor do Porta Contentores.
     * <p>
     * É necessário uma matricula, um nome, um comprimento e o número máximo de contentores para criar um porta contentores.</p>
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param maxContentores
     */
    public PortaContentores(String matricula, String nome, float comprimento, int maxContentores) {
        super(matricula, nome, comprimento);
        this.maxContentores = maxContentores;
    }

    /**
     * Setter a capacidade de carga do petroleiro
     *
     * @param maxContentores
     */
    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

    /**
     * Getter do número máximo de contentores.
     *
     * @return
     */
    public float getMaxContentores() {
        return maxContentores;
    }

}
