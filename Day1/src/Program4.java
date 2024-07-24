public class Program4 {
    public static void main(String[] args) {
        String str="Sum of 12 and 20 is 32";
        int word=sum(str);
        System.out.println(word);
    }
    public static int sum(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words=str.split(" ");
        int i=0;
        for(String word:words){
            try{
                Integer.parseInt(word);
            }
            catch(NumberFormatException e){
                i++;

            }
        }
        return i;
    }

}
