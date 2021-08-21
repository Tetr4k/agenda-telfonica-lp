public class Contato
{

    /*Atributos da classe Contato*/
    private String nome, endereco, relacao;
    private int numero;

    /*Construtor da classe Contato(Caso base)*/
    public Contato(String nome, int numero, String endereco, String relacao)
    {
        this.nome       = nome;
        this.numero     = numero;
        this.endereco   = endereco;
        this.relacao    = relacao;
    }

    /*Getters*/
    public String getNome()
    {
        return this.nome;
    }
    
    public int getNumero()
    {
        return this.numero;
    }

    public String getEndereco()
    {
        return this.endereco;
    }
    
    public String getRelacao()
    {
        return this.relacao;
    }

    /*Setters*/
    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setRelacao(String relacao)
    {
        this.relacao = relacao;
    }

    /*Funções auxiliares*/
    public String toString()
    {
        return "Nome: "+this.nome+
               ", Telefone: "+this.numero+
               ", Endereco: "+this.endereco+
               ", Relacao: "+this.relacao+"\n";
    }
}