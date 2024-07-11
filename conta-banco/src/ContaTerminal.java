import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*TODO: Conhecer e importar a classe Scanner
        Exibir as mensagem para o nosso usuário
        Obter pela scanner os valores digitados no terminal
        Exibir a mensagem conta criada*/

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String fullName;

        System.out.println("Por favor, digite o número da Conta !");
        int numero = sc.nextInt();
    
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu primeiro Nome !");
        String nome = sc.next();
           
        System.out.println("Por favor, digite o seu sobrenome !");
        String sobreNome = sc.next();

        fullName = nome.concat(" ").concat(sobreNome);

        System.out.println("Por favor, digite o número valor do Depósito !");
        double saldo = sc.nextDouble();

        System.out.printf("Olá " + fullName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
