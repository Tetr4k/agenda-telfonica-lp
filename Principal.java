public class Principal
{
	public static void main(String[] args)
	{
		Agenda agenda = new Agenda();
		agenda.inserir("Fulano", 99999999, "Rua A", "UFF");
		agenda.inserir("Ciclano", 88888888, "Rua B", "Cederj");
		agenda.inserir("Beltrano", 88889999, "Rua C", "Infância");
		agenda.inserir("Fulano", 77777777, "Rua D", "UFF");
		agenda.remover("Ciclano");
		System.out.println(agenda);
	}
}