import java.io.IOException;
import java.util.Scanner;

public class AgendaManager {
	//Função para simular limpeza de tela
	static void limpaTela()
	{
		for(int x=0; x<25; x++) System.out.println();
	}

	//Função para simular um System("pause")
	static void esperaEnter()
	{
		try
		{
			System.out.println("Pressione enter para continuar . . .");
			System.in.read();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

	//Função para imprimir o menu
	static void imprimeMenu()
	{
		System.out.print("=====MENU=====\n"+
						 "1 - Buscar;\n"+
						 "2 - Inserir;\n"+
						 "3 - Atualizar;\n"+
						 "4 - Remover;\n"+
						 "5 - Salvar;\n"+
						 "6 - Recuperar;\n"+
						 "7 - Sair\n"+
						 "==============\n");
	}

    public static void main(String[] args)
    {
		Scanner leitorInt = new Scanner(System.in);		//Cria o leitor para numeros
		Scanner leitorString = new Scanner(System.in);	//Cria o leitor para texto		(Usar o mesmo Scanner gera erro)
		
		/*Define algumas variaveis auxiliares*/
		Contato contato;
		String nome, endereco, relacao, nomeArquivo;
		int numero, opcao;

		Agenda agenda = new Agenda();//Inicializa a agenda
		do{
			/*Ciclo do programa
				Imprime conteudo da agenda seguido do menu
				Usuario escolhe uma opção
			*/
			System.out.println(agenda);
			imprimeMenu();
			opcao = leitorInt.nextInt();
			limpaTela();
			switch(opcao)
			{
				case 1:
					/*
						Busca pelo contato na agenda
							Pergunta o nome e procura por ele
							Se for encontrado imprime o contato
							Se não for encontrado informa que não foi
					*/
					System.out.print("Qual o nome do contato?");
					nome = leitorString.nextLine();
					limpaTela();
					contato = agenda.buscar(nome);
					if(contato != null)
						System.out.println(contato);
					else
						System.out.println("Contato não encontrado");
					esperaEnter();
					limpaTela();
					break;
				case 2:
					/*
						Insere um contato na agenda
							Pergunta pelos dados do contato
							Se for inserido informa que foi inserido
							Se alterar um contato informa que foi alterado
					*/
					System.out.println("Qual o nome do contato?");
					nome = leitorString.nextLine();
					limpaTela();
					System.out.println("Qual o número do contato?");
					numero = leitorInt.nextInt();
					limpaTela();
					System.out.println("Qual o endereço do contato?");
					endereco = leitorString.nextLine();
					limpaTela();
					System.out.println("Qual a relação do contato?");
					relacao = leitorString.nextLine();
					limpaTela();
					if(agenda.inserir(nome, numero, endereco, relacao))
						System.out.println("Inserido com Sucesso");
					else
						System.out.println("Alterado com Sucesso");
					esperaEnter();
					limpaTela();
					break;
				case 3:
					/*
						Altera um contado da agenda
							Pergunta pelos dados do contato
							Se for alterado informa que foi alterado
							Se não encontrar informa que não foi encontrado
					*/
					System.out.println("Qual o nome do contato?");
					nome = leitorString.nextLine();
					limpaTela();
					System.out.println("Qual o número do contato?");
					numero = leitorInt.nextInt();
					limpaTela();
					System.out.println("Qual o endereço do contato?");
					endereco = leitorString.nextLine();
					limpaTela();
					System.out.println("Qual a relação do contato?");
					relacao = leitorString.nextLine();
					limpaTela();
					if(agenda.alterar(nome, numero, endereco, relacao))
						System.out.println("Alterado com Sucesso");
					else
						System.out.println("Contato inexistente");
					esperaEnter();
					limpaTela();
					break;
				case 4:
					/*
						Remove um contado da agenda
							Pergunta pelo nome do contato
							Se for removido informa que foi removido
							Se não encontrar informa que não foi encontrado
					*/
					System.out.println("Qual o nome do contato?");
					nome = leitorString.nextLine();
					limpaTela();
					if(agenda.remover(nome))
						System.out.println("Contato removido com sucesso");
					else
						System.out.println("Contato não esta na agenda");
					esperaEnter();
					limpaTela();
					break;
				case 5:
					/*
						Salva a agenda
							Pergunta o nome do arquivo
							Se for salvo informa que foi salvo
							Se gerar erro informa que gerou erro
					*/
					System.out.println("Qual o nome do arquivo?");
					nomeArquivo = leitorString.nextLine();
					limpaTela();
					if(agenda.salvar(nomeArquivo))
						System.out.println("Salvo com sucesso");
					else
						System.out.println("Erro ao salvar");
					esperaEnter();
					limpaTela();
					break;
				case 6:
					/*
						Recupera a agenda
							Pergunta o nome do arquivo
							Se for recuperado informa que foi recuperado
							Se gerar erro informa que gerou erro
					*/
					System.out.println("Qual o nome do arquivo?");
					nomeArquivo = leitorString.nextLine();
					limpaTela();
					if(agenda.recuperar(nomeArquivo))
						System.out.println("Recuperado com sucesso");
					else
						System.out.println("Erro ao recuperar");
					esperaEnter();
					limpaTela();
					break;
			}
		}while(opcao != 7);
		leitorInt.close();
		leitorString.close();
    }
}
