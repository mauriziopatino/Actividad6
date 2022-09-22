public class Califications {
    String name;
    int calificationList [];

    public Califications() {
    }

    public void setCalificationList(int[] calificationList) {
        this.calificationList = calificationList;
    }

    public int getAverage(int[] califications){

        int addition = 0;
        int total = 0;

        for (int i = 0; i < califications.length; i++) {
            addition = addition + califications[i];
        }

        // Sacar promedio
        total = addition / califications.length;

        return total;

    }

    public char getCalification(int average){
        // Asignamos la char
        char calification = '\u0000';

        if(average <= 50){
            calification = 'F';
        } else if (average >= 51 && average <= 60) {
            calification = 'E';
        } else if (average >= 61 && average <= 70) {
            calification = 'D';
        } else if (average >= 71 && average <= 80) {
            calification = 'C';
        } else if (average >= 81 && average <= 90) {
            calification = 'B';
        } else if (average >= 91 && average<= 100) {
            calification = 'A';
        }

        return calification;
    }

    public void printData(String name, char ave, int cal){


        System.out.println("Nombre del estudiante: " + name);

        for (int i = 0; i < this.calificationList.length; i++) {
            System.out.println("Calificación " + i + ": " + this.calificationList[i]);
        }

        System.out.println("Promedio " + ave);

        System.out.println("Calificación: " + cal);

    }





}
