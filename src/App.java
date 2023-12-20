import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");
        // double x = 10.34566;
        // System.out.println(x);
        // System.out.printf("%.2f%n", x);
        // //localizar se é virgula ou .
        // Locale.setDefault(Locale.US);
        // System.out.println(x);

        // -------------------------------------------------------------------

        // //exercício de fixação:
        // String product1 = "Computer";
        // String product2 = "Office desk";

        // int age = 30 ;
        // int code = 5290;
        // char gender = 'F';
        // double price1 = 2100.0;
        // double price2 = 650.0;
        // double measure = 53.234567;

        // System.out.println("Products: \n"+
        // product1+", which price is $ " + price1 + "\n" +
        // product2+", which price is $ "+price2 + "\n" +

        // "\nRecord: 30 years old, code "+code+" and gender: "+gender+"\n" +

        // String.format("\nMeasue with eight decimal places:%.8f\n", measure) +
        // String.format("Rounded (three decimal places): %.3f", measure));
        // Locale.setDefault(Locale.US);
        // System.out.printf("US decimal point: %.3f", measure);

        // -------------------------------------------------------------------------------------------------

        // //exercicio 1:

        // Scanner sc = new Scanner(System.in);

        // System.out.println("primeiro número:");
        // int x = sc.nextInt();

        // System.out.println("segundo número:");
        // int y = sc.nextInt();

        // int z = x + y;
        // System.out.println("o numéro somado é :" + z);

        // -----------------------------------------------------------------------

        // //Exercício 2:
        // Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in);

        // System.out.println("informe o raio:");

        // double raio = sc.nextDouble();
        // double pi = 3.14159;
        // double area = pi * (Math.pow(raio,2));

        // System.out.printf("Valor da área: %.4f", area);

        // sc.close();

        // --------------------------------------------------------------------
        
        // // Exercício 3:

        // Scanner sc = new Scanner(System.in);
        // System.out.println("informar A:");
        // int A = sc.nextInt();
        // System.out.println("informar B:");
        // int B = sc.nextInt();
        // System.out.println("informar C:");
        // int C = sc.nextInt();
        // System.out.println("informar D:");
        // int D = sc.nextInt();
        // int diferenca = A * B - C * D;

        // System.out.println("Resultado é = " + diferenca);

        // sc.close();


        // ----------------------------------------------------------------------

        // //Exercício 4:
    
        // Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

	    // int numero = sc.nextInt();
	    // int horas = sc.nextInt();
	    // double valorHora = sc.nextDouble();
	    // double salario = valorHora * horas;

	    // System.out.println("Número: " + numero);
	    // System.out.printf("Salário = U$ %.2f%n", salario);
		
		// sc.close();

        //-------------------------------------------------------------------------

        // //Exercicio 5:

        // Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		// int codigo1, codigo2, qtd1, qtd2;
	    // double preco1, preco2, total;
        // System.out.println("Dados sobre produto 1:");
        // System.out.println("informar codigo:");
	    // codigo1 = sc.nextInt();
        // System.out.println("informar quantidade:");
	    // qtd1 = sc.nextInt();
        // System.out.println("informar preco:");
	    // preco1 = sc.nextDouble();
	    
        // System.out.println("Dados sobre produto 2:");
        // System.out.println("informar codigo:");
	    // codigo2 = sc.nextInt();
        // System.out.println("informar quantidade:");
	    // qtd2 = sc.nextInt();
        // System.out.println("informar preco:");
	    // preco2 = sc.nextDouble();
        
	    // total = preco1 * qtd1 + preco2 * qtd2;

	    // System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		// sc.close();

        //-----------------------------------------------------


        //Exercicio 6:
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
        double triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Informe A: ");
		A = sc.nextDouble();
        System.out.println("Informe B: ");
		B = sc.nextDouble();
        System.out.println("Informe C: ");
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Area do triangulo: %.3f%n", triangulo);
		System.out.printf("Area do circulo: %.3f%n", circulo);
		System.out.printf("Area do Trapezio: %.3f%n", trapezio);
		System.out.printf("Area do quadrado: %.3f%n", quadrado);
		System.out.printf("Area do retangulo: %.3f%n", retangulo);
		
		sc.close();

    }
}
