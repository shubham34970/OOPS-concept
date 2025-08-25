package P1;

public class CS1 {
    final public static void main(String[] args) {
        System.out.println("Hi CSD");
        // J mod :
        // final keyword : mtlb kisi cheej ko fix karne ke liye.
        // Agr loi class ke aage final laga de to us class ko koi aur inherit nhi kr skta
        for(int i=0; i< args.length; i++){
            System.out.print(args[i]);

        }
    }

}
class Aa{
    public static void main(String[] args) {
        System.out.println("Aa data");
        CS1.main(new String[]{"Hello Sarthak","Aj","Atharva"});
    }
}
