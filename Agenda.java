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
            if(contato.getNome().contains(nome))
                return contato;
        return null;
    }

    public boolean alterar(String nome, int numero, String endereco, String relacao)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().equals(nome))
            {
                contato.setNumero(numero);
                contato.setEndereco(endereco);
                contato.setRelacao(relacao);
                return true;
            }
        return false;
    }

    public boolean inserir(String nome, int numero, String endereco, String relacao)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().equals(nome))
            {
                contato.setNumero(numero);
                contato.setEndereco(endereco);
                contato.setRelacao(relacao);
                return false;
            }
        this.contatos.add(new Contato(nome, numero, endereco, relacao));
        return true;
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