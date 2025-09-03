import java.util.*;

public class Main {

    static String ModifyName(String name) {
        return name + " is a Super Hero";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));
    }
}