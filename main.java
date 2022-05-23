import java.util.Scanner;
public class Eleicoes02 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  //inicializar Scanner
  int numEleitor = 0;
  int PT=0, PDT=0, PL=0, PSDB=0, nulo=0, branco=0;
  //declarar variaveis
  
  for(int i = 0; i < 50; i++)  {
      //for para repeticao
    numEleitor++;
    // contador
    System.out.println("\nEleitor " + numEleitor +", digite o numero do candidato a sua escolha.");
    //texto que aparecera ao usuario
    System.out.print("Digite '1' para PT, '2' para PDT, '3' para PL, '4' para PSDB, '5' para voto Nulo, ou digite '6' para voto em branco!\nSua escolha e: ");
    //texto que aparecera ao usuario
    int numero = scan.nextInt();// associar a variavel ao Scanner e ao texto

   switch (numero){//comando para trocar entre varios casos
     case 1://criar um caso
       System.out.println("Voce votou no partido PT");
        //texto que aparecera ao usuario
       PT++;// contador
       break;//parar a repeticao 
     case 2://criar um caso
       System.out.println("Voce votou no partido PDT");
        //texto que aparecera ao usuario
       PDT++;// contador
       break;//parar a repeticao 
     case 3://criar um caso
       System.out.println("Voce votou no partido PL");
        //texto que aparecera ao usuario
       PL++;// contador
       break;//parar a repeticao 
     case 4://criar um caso
       System.out.println("Voce votou no Candito do partido PSDB");
        //texto que aparecera ao usuario
       PSDB++;// contador
       break;//parar a repeticao 
     case 5://criar um caso
       System.out.println("Voce votou Nulo");
        //texto que aparecera ao usuario
       nulo++;// contador
       break;//parar a repeticao 
     case 6://criar um caso
       System.out.println("Voce votou em Branco");
        //texto que aparecera ao usuario
       branco++;//contador
       break;//parar a repeticao 
     default:
       System.out.println("Voto invalido!"); 
        //texto que aparecera ao usuario

    }
  }
    System.out.printf("\nO total de votos para o PT foi igual a: " + PT + "!"); //texto que aparecera ao usuario
    System.out.printf("\nO total de votos para o PDT foi igual a: " + PDT + "!"); //texto que aparecera ao usuario
    System.out.printf("\nO total de votos para o PL foi igual a: " + PL + "!"); //texto que aparecera ao usuario
    System.out.printf("\nO total de votos para o PSDB foi igual a: " + PSDB + "!"); //texto que aparecera ao usuario
    System.out.printf("\nO total de votos nulos foi igual a: " + nulo + "!"); //texto que aparecera ao usuario
    System.out.printf("\nO total de votos em branco foi igual a: " + branco + "!");  //texto que aparecera ao usuario
 }
}

 
