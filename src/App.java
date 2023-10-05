import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Vector2 v = new Vector2(2, 2, "yippee");
        Vector2 v2 = new Vector2(2, 2, "defenestration");

        // test magnitude method
        System.out.println(v.mag());

        // test addition method + toString method
        Vector2 v3 = v.add(v2);
        System.out.println(v3);

        // test isEqual method
        //should print true:
        System.out.println(v.isEqual(v2));
        // changing values of v2 so the values dont match
        v2.setX(3);
        v2.setY(2);
        // should print false:
        System.out.println(v.isEqual(v2));

        // getDimension test
        System.out.println(v.getDimension());
        
        // more inheritance test; this compiles since Vector2 extends MathObject
        MathObject[] list = {v, v2};


        // the exception is not caught because Vector2 implements Clonable
        try
        {
            v3 = (Vector2)v.clone();
            System.out.println(v3);
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        // changing v3 for HashMap testing
        v3.setX(5);
        v3.setY(6);

        // checking the default constructor
        Vector2 v4 = new Vector2();

        // making hashmap and putting all the vectors in
        HashMap<String, MathObject> map = new HashMap<String, MathObject>();
        map.put(v.getDesc(), v);
        map.put(v2.getDesc(), v2);
        map.put(v3.getDesc(), v3);
        map.put(v4.getDesc(), v4);

        // display all values
        for (MathObject i : map.values())
        {
            System.out.println(i);
        }
        
        // prompting user for key and displaying cooresponding value
        Scanner scan = new Scanner(System.in);
        String resp = "";

        System.out.println("give a key");
        resp = scan.nextLine();

        if (map.containsKey(resp))
        {
            System.out.println(map.get(resp));
        }
        else
        {
            System.out.println("key does not exist");
        }
        
        scan.close();
    }
}
