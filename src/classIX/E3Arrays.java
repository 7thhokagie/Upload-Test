package classIX;

public class E3Arrays {
    public static void main(String[] args) {

        String [] names={"Bestia", "Imparable", "Killer", "Monstruo", "Asesino"};

        for(int j=0; j<names.length;j++){
            System.out.print(names[j]+" ");
        }
        System.out.println();
        int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;
        }

    }
}
