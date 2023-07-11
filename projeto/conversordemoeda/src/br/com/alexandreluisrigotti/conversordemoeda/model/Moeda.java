
package br.com.alexandreluisrigotti.conversordemoeda.model;

/**
 *
 * @author alexandreluis
 */
public class Moeda 
{
    private int id;
    private String nome;
    private float valor;

    
    public Moeda(){}

    public Moeda(int id, String nome, float valor)
    {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() 
    {
        return this.id + "Nome: " + this.nome + ", valor: " + this.valor;
    }
}