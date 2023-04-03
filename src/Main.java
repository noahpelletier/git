import java.util.Scanner;
public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Entrez l'indice de l'entier à diviser: ");

        x = sc.nextInt();

        System.out.println("Entrez le diviseur");

        y = sc.nextInt();

        System.out.println("Le résultat de la division est : " + Division(x,y));

    }
    public static int ReadInteger(String message, int min, int max){
    Scanner sc=new Scanner( System.in);
    System.out.println(message);
    while true{
        try{
            int result = Integer.parseInt( sc.nextLine());
            if (result>=min && result <=max){
                return result;

            }
            else throw new IllegalAccessException("La valeur doit etre comprise entre"+min+" et "+max+" : "+result);
            }
            catch (NumberFormatException e) {
                System.out.println();
            }

        }
        }






    static int Division(int indice, int diviseur)

    {

        return tableau[indice] / diviseur;



    }
}