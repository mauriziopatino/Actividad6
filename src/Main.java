import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] califications = {90, 80, 30, 50, 100};
        String name;

        Califications myCalifications = new Califications();

        System.out.println("¿Cual es tu nombre?");
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        System.out.println("----------");

        int myAverage = myCalifications.getAverage(califications);
        char myCalification = myCalifications.getCalification(myAverage);
        myCalifications.setCalificationList(califications);

        myCalifications.printData(name, myCalification, myAverage);


    }
}
