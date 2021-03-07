import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // ArrayList items=new ArrayList();//before Generic and java 1.5
        ArrayList<Integer> items=new ArrayList<>();
        items.add(1);
        items.add(2);
       // items.add("tim");//due to Generics this cant be done
        items.add(3);
        items.add(4);

        doubleNumber(items);

    }

    private static void doubleNumber(List<Integer> list){
                for(int i:list){
                    System.out.println(i*2);
                }

//        for(Object i:list){
//            System.out.println((Integer)i*2);//before java 1.5 and Generics we had to cast the object we get to its real type
//        }
    }
}
