public class Contato
{
	private String nome, endereco, relacao;
    private int numero;

    public Contato(String nome, int numero, String endereco, String relacao)
    {
        this.nome       = nome;
        this.numero     = numero;
        this.endereco   = endereco;
        this.relacao    = relacao;
    }

    public String getNome()
    {
        return this.nome;
    }

    public String toString()
    {
        return "Nome: "+this.nome+
               ", Telefone: "+this.numero+
               ", Endereco: "+this.endereco+
               ", Relacao: "+this.relacao+"\n";
    }
}