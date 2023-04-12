package classIX;

public class E6Arrays {
    public static void main(String[] args) {

        boolean [] flags={true,false,true,false,false,true};
        int count=0;
        for(int i=0; i<flags.length;i++){
            if(flags[i]==false){
                count++;
            }
        }
        System.out.println(count);

    }
}
