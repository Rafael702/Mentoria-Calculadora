import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void calcular(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operacao matematica voce deseja realizar?");
        System.out.println("+: Adicao");
        String operacaoMatematica = scanner.next();

        System.out.println("Operacao escolhida: " + operacaoMatematica);

        System.out.println("Entre com o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        int resultado = 0;
        if(operacaoMatematica == "+"){
         resultado =  primeiroNumero + segundoNumero;
        }

        System.out.println(resultado);
    }
}