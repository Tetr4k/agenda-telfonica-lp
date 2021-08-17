/*Importações*/

public class Principal
{
	public static void main(String[] args)
	{
		Agenda agenda1 = new Agenda();
		agenda1.inserir("Fulano", 99999999, "Rua A", "UFF");
		agenda1.inserir("Ciclano", 88888888, "Rua B", "Cederj");
		agenda1.inserir("Beltrano", 88889999, "Rua C", "Infância");
		agenda1.inserir("Fulano", 77777777, "Rua D");
		agenda1.remover("Ciclano");
		System.out.println(agenda1.toString());
	}
}