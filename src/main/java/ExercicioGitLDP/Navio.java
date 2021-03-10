/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioGitLDP;

/**
 * <h1>Navio</h1>
 * A classe Navio permite definir os atributos de um navio.
 *
 * @author João Miranda
 * @version 1.0
 * @since 2021-03-08
 */
public class Navio {

    protected String matricula, nome;//Matricula do Navio (String), nome (String) e comprimento (float)
    protected float comprimento;

    /**
     * Construtor do Navio.
     * <p>
     * É necessário uma matricula, um nome e um comprimento para criar um navio.</p>
     *
     * @param matricula
     * @param nome
     * @param comprimento
     */
    public Navio(String matricula, String nome, float comprimento) {
        this.matricula = matricula;
        this.comprimento = comprimento;
        this.nome = nome;
    }

    /**
     * Getter da matricula do navio.
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Getter do comprimento do navio.
     *
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * Setter do comprimento do navio.
     *
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Getter do nome do navio.
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome do navio.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;

    }

}
