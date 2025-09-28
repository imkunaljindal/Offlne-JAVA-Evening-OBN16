public class Concept {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 16 size

        sb.append('a');
        sb.append('b');
        sb.append('c');

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));

        sb.setCharAt(2,'d');
        System.out.println(sb);

        sb.insert(0,'x');
        System.out.println(sb);
    }
}
