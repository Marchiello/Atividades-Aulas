import java.util.Scanner;

public class ProgramaFinalDaAula29_03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite um ano futuro: ");
        int ano = entrada.nextInt();

        // diferença entre o ano atual e o ano futuro

        int aux = ano - 2022;
        int idadeFutura = idade + aux;

        System.out.println("Minha idade em " + ano + " é " + idadeFutura);

        // --------------------------------------------------------------------[]

    }

}
