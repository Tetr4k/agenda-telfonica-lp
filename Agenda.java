import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Agenda
{
    /*Atributos da classe Agenda*/
    private ArrayList<Contato> contatos;

    /*Construtor da classe Agenda(Caso base)*/
    public Agenda()
    {
        this.contatos = new ArrayList<Contato>();
    }

    /*Funções auxiliares*/
    public Contato buscar(String nome)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().toUpperCase().contains(nome.toUpperCase()))
                return contato;
        return null;
    }

    public boolean alterar(String nome, int numero, String endereco, String relacao)
    {
        for (Contato contato : this.contatos)
            if(contato.getNome().toUpperCase().equals(nome.toUpperCase()))
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
            if(contato.getNome().toUpperCase().equals(nome.toUpperCase()))
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
            if(contato.getNome().toUpperCase().equals(nome.toUpperCase()))
            {
                this.contatos.remove(contato);
                return true;
            }
        return false;
    }

    public boolean salvar(String nomeArquivo)
    {
        try
        {
            File arquivoContatos = new File(nomeArquivo+".txt");
            FileWriter fileWriter = new FileWriter(arquivoContatos);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Contato contato : this.contatos)
            {
                bufferedWriter.write(contato.getNome());
                bufferedWriter.newLine();
                bufferedWriter.write(Integer.toString(contato.getNumero()));
                bufferedWriter.newLine();
                bufferedWriter.write(contato.getEndereco());
                bufferedWriter.newLine();
                bufferedWriter.write(contato.getRelacao());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
            return true;
        }
        catch(IOException er)
        {
            return false;
        }
    }

    public boolean recuperar(String nomeArquivo)
    {
        try
        {
            File arquivoContatos = new File(nomeArquivo+".txt");
            FileReader fileReader = new FileReader(arquivoContatos);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.ready())
                this.contatos.add(new Contato(bufferedReader.readLine(), Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine(), bufferedReader.readLine()));
            bufferedReader.close();
            fileReader.close();
            return true;
        }
        catch(IOException er)
        {
            return false;
        }
    }
    
    public String toString()
    {
        if(this.contatos.isEmpty()) 
            return "Agenda vazia";
        String retorno = "Contatos na sua agenda:\n";
        for(Contato contato : this.contatos)
            retorno += contato;
        return retorno;
    }
    //salvar, recuperar
}