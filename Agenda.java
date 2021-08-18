import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Contato> contatos;

    public Agenda()
    {
        this.contatos = new ArrayList<Contato>();
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