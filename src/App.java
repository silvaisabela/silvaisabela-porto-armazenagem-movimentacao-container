import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		int opcao = 1;
		Porto porto = new Porto();
		
		Scanner scanner = new Scanner(System.in);

		while (opcao != 0) {

			if (opcao < 0 || opcao > 5) {
				System.out.println("Opcao invalida!");
				System.out.println();
				opcao = 1;
				continue;
			}

			System.out.println("0 - Encerrar programa");
			System.out.println("1 - Insere conteiner no p�tio"); 	
			System.out.println("2 - Retira conteiner do p�tio");
			System.out.println("3 - C�lculo do custo da movimenta��o dos conteiners");
			System.out.println("4 - Apresenta os conteiners em cada pilha do p�tio");
			System.out.println("5 - Apresenta planilhas de conteineres de cada pilha do p�tio");
			System.out.print("      Op��o: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {

			case 1:
				System.out.println("-------------------- OP��O 1 --------------------");
				inserirContainer(porto, scanner);
				break;

			case 2:
				System.out.println("-------------------- OP��O 2 --------------------");
				retirarContainer(porto, scanner);
				break;

			case 3:
				System.out.println("-------------------- OP��O 3 --------------------");
				calcularMovimentacao(porto);
				break;

			case 4:
				System.out.println("-------------------- OP��O 4 --------------------");
				exibirPilhas(porto);
				break;
				
			case 5:
				System.out.println("-------------------- OP��O 5 --------------------");
				apresentarPlanilha(porto);
				break;
			}

		}
		
		scanner.close();
	}
	
	private static void inserirContainer(Porto porto, Scanner scanner) throws Exception {
		System.out.print("Informe c�digo de identifica��o do conteiner: ");
		int id = scanner.nextInt();
		
		Container container = new Container(id);
		porto.inserirContainer(container);
		System.out.println();
		System.out.println();
	}
	
	private static void retirarContainer(Porto porto, Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Informe o c�digo de identifica�ao do conteiner a ser retirado: ");
		int id = scanner.nextInt();
		
		porto.retirarContainer(id);
	}
	
	private static void calcularMovimentacao(Porto porto) {
		porto.calcularMovimentacao();
	}

	private static void exibirPilhas(Porto porto) throws Exception {
		porto.exibirPilhas();
	}
	
	private static void apresentarPlanilha(Porto porto) {
		porto.apresentarPlanilha();
		
	}

	
}
