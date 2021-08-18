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

    public boolean remover(String nome)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().equals(nome))
            {
                this.contatos.remove(contato);
                return true;
            }
        return false;
    }

    public String toString()
    {
        if(this.contatos.isEmpty()) 
            return "Agenda vazia";
        String texto = "Agenda\n";
        for(Contato contato : this.contatos)
        {
            texto = texto.concat(contato.toString());
        }
        return texto;
    }
}