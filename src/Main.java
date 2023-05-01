import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Metodos nao estaticos precisam que sua class seja instanciada para serem usados dentro de um metodo static
        Main main = new Main();
        main.calcular();
    }

    public void calcular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operacao matematica que voce deseja realizar?");
        System.out.println("+: Adicao");
        System.out.println("-: Subtracao");
        System.out.println("*: Multipplicação");
        String operacaoMatematica = scanner.next();

        System.out.println("Operacao escolhida: " + operacaoMatematica);

        System.out.println("Entre com o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        int resultado = 0;
        if (operacaoMatematica.equals("+")) {
            resultado = primeiroNumero + segundoNumero;
        }
        if (operacaoMatematica.equals("-")) {
            if (primeiroNumero > segundoNumero) {
                resultado = primeiroNumero - segundoNumero;
            } else {
                resultado = segundoNumero - primeiroNumero;
            }
        }

        if(operacaoMatematica.equals("*")){
            resultado =  primeiroNumero * segundoNumero;
        }

        System.out.println("O resultado é: " + resultado);
    }
}
//