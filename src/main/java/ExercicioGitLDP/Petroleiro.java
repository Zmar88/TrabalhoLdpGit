/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioGitLDP;

/**
 *<h1>Petroleiro</h1>
 * A classe Petroleiro permite definir os a atributos de um navio petroleiro.
 * <p>Um petroleiro é um tipo de navio.</p>
 * 
 * @author João Miranda
 * @version 1.0
 * @since 2021-03-08
 */
public class Petroleiro extends Navio {

    //Um petroleiro contem o atributo da capacidade de carga em adicional a um navio normal.
    private float capacidadeCarga;

    /**
     * Construtor do Petroleiro.
     * <p>
     * É necessário uma matricula, um nome, um comprimento e a capacidade de carga para criar um petroleiro.</p>
     *
     * @param matricula
     * @param nome
     * @param comprimento
     * @param capacidadeCarga
     */
    public Petroleiro(String matricula, String nome, float comprimento, float capacidadeCarga) {
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Setter a capacidade de carga do petroleiro
     *
     * @param capacidadeCarga
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    /**
     * Getter da capacidade de carga do petroleiro.
     *
     * @return
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

}