public class Principal
{
	public static void main(String[] args)
	{
		Agenda agenda = new Agenda();								//Cria agenda
		agenda.inserir("Fulano", 99999999, "Rua A", "UFF");			//Inserir o Contato "Fulano", 99999999, "Rua A", "UFF";
		agenda.inserir("Ciclano", 88888888, "Rua B", "Cederj");		//Inserir o Contato "Ciclano", 88888888, "Rua B", "Cederj";
		agenda.inserir("Beltrano", 88889999, "Rua C", "Infância");	//Inserir o Contato "Beltrano", 88889999, "Rua C", "Infância";
		agenda.inserir("Fulano", 77777777, "Rua D", "UFF");			//Inserir o Contato "Fulano", 77777777, "Rua D";
		agenda.remover("Ciclano");									//Remover o Contato "Ciclano";
		System.out.println(agenda);									//Listar o conteudo da Agenda;
	}
}