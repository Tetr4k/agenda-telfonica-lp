/*Importações*/
import java.util.Scanner;

public class Principal
{
	static void limpaTela(){
		for(int x=0; x<25; x++) System.out.println();
	}

	static void imprimeMenu(){
		System.out.print("=============\n"+
						 "1. Buscar;\n"+
						 "2. Inserir;\n"+
						 "3. Atualizar;\n"+
						 "4. Remover;\n"+
						 "5. Salvar;\n"+
						 "6. Recuperar;\n"+
						 "7. Sair\n"+
						 "=============\n");
	}

	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		Scanner leitor2 = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.inserir("Fulano", 99999999, "Rua A", "UFF");
		agenda.inserir("Ciclano", 88888888, "Rua B", "Cederj");
		agenda.inserir("Beltrano", 88889999, "Rua C", "Infância");
		//agenda.inserir("Fulano", 77777777, "Rua D");
		//agenda.remover("Ciclano");
		int opcao;
		do{
			limpaTela();
			System.out.println(agenda);
			imprimeMenu();
			opcao = leitor.nextInt();
			limpaTela();
			switch(opcao)
			{
				case 1:
					System.out.print("Digite o nome do contato:\n>");
					String nome = leitor2.nextLine();
					Contato contato = agenda.busca(nome);
					limpaTela();
					if(contato == null)
						System.out.println("Não foi possivel encontrar o contato "+nome+" na agenda.");
					else
						System.out.println(contato);
					nome = leitor2.nextLine();
			}
		}while(opcao != 7);
		leitor.close();
		leitor2.close();
	}
}