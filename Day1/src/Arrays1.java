import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {

        char[] vowels = {'u', 'a', 'o', 'i', 'e'};
        Arrays.sort(vowels);
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
            System.out.println("Sorted Array of Vowels in Ascending Order:" + Arrays.toString(vowels));
        }
//        char consonants[] = {'r', 'p', 's', 'd', 'k'};
//        Arrays.sort(consonants);
//        for (int i = 0; i < consonants.length; i++) {
//            System.out.println(consonants[i]);
//            System.out.println("Sorted Array of consonants in Ascending Order:" + Arrays.toString(consonants));
//      }
        char[] reverse = new char[vowels.length];
        for (int i = 0; i < vowels.length; i++) {
            reverse[i] = vowels[vowels.length - 1 - i];
        }
        System.out.println("The Sorted Array in Descending Order:" + Arrays.toString(reverse));

        String customToString = "[";
        for (int i = 0; i < vowels.length; i++) {
            if (i == (vowels.length - 1)) {
                customToString = customToString + vowels[i];
            } else {
                customToString = customToString + vowels[i] + " ,";
            }

        }
        customToString += "]";
        System.out.println(customToString);
        char searchchar='u';
        int index=-1;
        for(int i=0;i<vowels.length;i++){
            if(vowels[i]==searchchar){
                index=i;
                break;

            }
        }
        if(index != -1){
            System.out.println("The Element is not Found in the Array  " + searchchar + index);
        }
        else{
            System.out.println("The Element is Found in the Array"+searchchar);
        }

    }
}