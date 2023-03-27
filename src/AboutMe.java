import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   public static void main(String[] args) {
      // criando objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

       System.out.println("digite seu nome");
      String nome = scanner.next();
      
       System.out.println("Digite seu sobrenome");
      String sobrenome = scanner.next();

       System.out.println("Digite sua idade");
      int idade = scanner.nextInt(); 

       System.out.println("Digite sua altura ");
      double altura = scanner.nextDouble(); 

    // imprimindo dados inseridos pelo usuario
System.out.println("Ola, me chamo " +  nome   + " " + sobrenome);
System.out.println("Tenho " + idade + " anos ");
System.out.println("Minha altura e " + altura + "cm ");

   }
     //** os argumentos comecam com indice "0"
   // String nome = args [0];
   // String sobrenome = args [1];
   // int idade = Integer.valueOf(args [2]);
    //double altura = Double.valueOf(args [3]);
}
