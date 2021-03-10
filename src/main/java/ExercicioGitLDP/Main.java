/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioGitLDP;

/**
 * <h1>Main</h1>
 * Classe Main do programa.
 *
 * @author João Miranda
 * @version 1.0
 * @since 2021-03-08
 */
public class Main {

    /**
     * Este metodo cria um porto, insere nele um petroleiro e um porta contentores.
     * <p>
     * Além disso verifica se é possivel inserir um navio com matricula igual a uma já existente.</p>
     *
     * @param args
     */
    public static void main(String[] args) {
        Porto porto = new Porto(10);
        Petroleiro petroleiro = new Petroleiro("AA-55-ZT", "Navio1", 300, 10);
        PortaContentores portaContentores1 = new PortaContentores("AA-35-SS", "Navio2", 400, 20);
        Petroleiro petroleiro2 = new Petroleiro("AA-55-ZT", "Navio4", 300, 10);
        porto.adicionaNavio(petroleiro);
        porto.adicionaNavio(portaContentores1);
        System.out.println("A capacidade total de carga dos navios no porto é de: " + porto.capacidadeTotal());
        System.out.println();
        System.out.println("**********Agora vamos inserir um petroleiro com matricula igual ao já existente**********");
        System.out.println();
        porto.adicionaNavio(petroleiro2);
        System.out.println("A capacidade total de carga dos navios no porto é de: " + porto.capacidadeTotal());
        System.out.println();
        System.out.println("**********Logo o petroleiro com matricula igual não foi adicionado**********");
    }

}
