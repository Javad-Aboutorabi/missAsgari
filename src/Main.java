import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        for (int a : list) {
//            System.out.println(a);
//        }

        int s;
        s = sum(20, 10);
        System.out.println("sum : " + s);
        /////////////////////////////////////
        int m;
        m = mull();
        System.out.println("mull : " + m);
        /////////////////////////////////////
        div(5,2);

        //////////////////////////////////////
        line();
    }

    //  method  input and output
    public static Integer sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    //  method  NOInput and output
    public static Integer mull() {
        int mull = 0;
        mull = 2 * 4;
        return mull;
    }

    //  method  Input and NOOutput
    public static void div(int a, int b) {
        float f;
        f=(float) a/b;
        System.out.println("mull : " + f);
    }
    //  method  NOInput and NOOutput
    public static void line() {
        System.out.println("-----------------------------------------------------");
        div(20, 5);
        div(22, 5);
        div(25, 5);
        div(39, 5);
        div(7, 5);
    }


}
