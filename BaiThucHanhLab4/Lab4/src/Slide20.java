
    import java.util.ArrayList;

    import java.util.ArrayList;

    public class Slide20 {
        public static void main(String[] args) {
            ArrayList<String> arrList = new ArrayList<>();
            arrList.add ("a");
            arrList.add ("b");
            arrList.add ("c");
            arrList.add ("d");
            arrList.add ("e");
            arrList.remove ("c");
            arrList.set(0, "j");
            System.out.print(arrList.get(2));
    }
   
}
