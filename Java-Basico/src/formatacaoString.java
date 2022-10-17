
public class formatacaoString {
    public static void main(String[] args) {

        String original = "adcde addef gfgrgh DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.substring(2);
        String s04 = original.substring(2, 9);
        String s05 = original.replace('a', 'x');
        int i = original.indexOf("add");
        int j = original.lastIndexOf("add");

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(i);
        System.out.println(j);

    }
}
