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