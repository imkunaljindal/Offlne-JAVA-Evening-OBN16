public class Concept {
    public static void main(String[] args) {

        String s = "abc-dfe-xjds-sfaf";
        String[] splitedS = s.split("-");

        System.out.println(splitedS.length);

        for(int i=0;i<splitedS.length;i++) {
            System.out.println(splitedS[i]);
        }
    }
}
