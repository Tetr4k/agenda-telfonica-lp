import java.util.Scanner;

public class AgendaManager {
	static void limpaTela(){
		for(int x=0; x<25; x++) System.out.println();
	}

	static void imprimeMenu(){
		System.out.print("=============\n"+
						 "A. Buscar;\n"+
						 "B. Inserir;\n"+
						 "C. Atualizar;\n"+
						 "D. Remover;\n"+
						 "E. Salvar;\n"+
						 "F. Recuperar;\n"+
						 "G. Sair\n"+
						 "=============\n");
	}
    public static void main(String[] args)
    {
        Scanner leitor = new Scanner(System.in);
		char opcao;
		do{
			limpaTela();
			imprimeMenu();
			opcao = leitor.nextLine().toUpperCase().charAt(0);
			limpaTela();
			switch(opcao)
			{

			}
		}while(opcao != 7);
        leitor.close();
    }
}
