import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Contato> contatos;

    public Agenda()
    {
        this.contatos = new ArrayList<Contato>();
    }

    public Contato busca(String nome)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().equals(nome))
                return contato;
        return null;
    }

    public void inserir(String nome, int numero, String endereco, String relacao)
    {
        if(this.busca(nome) != null)
        {
            //this.altera(nome, numero, endereco, relacao);
        }
        else
        {
            Contato novoContato = new Contato(nome, numero, endereco, relacao);
            this.contatos.add(novoContato);
        }
    }

    public String toString()
    {
        String texto = "AGENDA\n\n";
        for(Contato contato : this.contatos)
        {
            texto = texto.concat(contato.toString());
        }
        return texto;
    }
}