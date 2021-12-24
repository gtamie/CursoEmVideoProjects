package exercicioPOO1;

import java.util.Scanner;

public class TelaUsuario {

	public static void main(String[] args) {
		String nome, sexo;
		short idade, opcao;
		int pagina;
		Scanner scan = new Scanner(System.in);
		
		
		//Pedir o nome do leitor
		System.out.print("Informe o seu nome: ");
		nome=scan.next();
		
		//Pedir idade do leitor
		System.out.print("Informe a sua idade: ");
		idade=scan.nextShort();
		scan.nextLine();

		//Pedir identidade g�nero do leitor
		System.out.print("Informe sua identidade de g�nero: ");
		sexo=scan.next();
		
		//criar objeto Pessoa
		Pessoa p = new Pessoa(nome, idade, sexo);
		
		//Criar objeto Livro
		Livro l = new Livro();
		l.setLeitor(p);
		System.out.println("Livro dispon�vel: Duna");
		
		
		//La�o para mostrar op��es
		do {
			System.out.println("\nDigite: \n1 - para ver detalhes do livro"
					+ "\n2 - para abrir"+"\n3 - para fechar"
					+"\n4 - para folhear"+"\n5 - para avan�ar a p�gina"+
					"\n6 - para voltar a p�gina"+"\n7 - para sair"+
					"\nInforme a op��o desejada:");
			opcao = scan.nextShort();
			if(opcao==1) {
				System.out.println(l.detalhes());
				
			}
			
			else if(opcao==2) {
				l.abrir();
			}
			
			else if(opcao==3) {
				l.fechar();
			}
			
			else if(opcao==4) {
				System.out.println("N� da p�gina que deseja ir: ");
				pagina = scan.nextInt();
				scan.nextLine();
				l.folhear(pagina);
			}
			
			else if(opcao==5) {
				l.avancarPag();
			}
			else if(opcao==6) {
				l.voltarPag();
			}
			else if(opcao==7) {
				System.out.println("Programa encerrado.");
			}
			else
			{
				System.out.println("Op��o inv�lida.");
			}
		}while(opcao!=7);
		
		scan.close();
	}

}
