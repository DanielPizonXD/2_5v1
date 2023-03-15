import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner d = new Scanner(System.in);
    System.out.println("Podaj liczbe a:");
    int a = d.nextInt();
    System.out.println("Podaj liczbe b:");
    int b = d.nextInt();
    System.out.println("Podaj liczbe c:");
    int c = d.nextInt();

    if(a>b && a>c){
      System.out.println(a);
    }
     
      if (b>a && b>c){
        System.out.println(b);
        }
    else
      System.out.println(c);
    
      }
  }
