public class Program5 {
    public static void main(String[] args) {
        String name = "SRUTHI";
        System.out.println("name.charAt()");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println(name.contains("UT"));
        System.out.println(name.length());
        System.out.println(name.indexOf("T"));
        System.out.println(name.equals("Sruthi"));
        System.out.println(name.equalsIgnoreCase("sruthi"));
        String str="College";
        System.out.println(name.concat("Management"));
        System.out.println(name.lastIndexOf("R"));
        System.out.println(name.substring(1,4));
        System.out.println(str.toLowerCase());
        System.out.println((str.toUpperCase()));
        String str1="   Hello  World    ";
        System.out.println(str1);
        System.out.println("start"+str1.trim()+"End");
    }
}
