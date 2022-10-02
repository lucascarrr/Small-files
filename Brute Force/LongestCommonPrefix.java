public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(findPrefix(strs));
        
    }

    public static String findPrefix(String[] strings) {
        String prefix = "";
        String current_longest = strings[0];
        if (strings.length == 1) {
            return strings[0];
        }

        for (String string: strings) {
            String temp_pref = "";
            for (int i = 0; i < (findMin(current_longest, string)); i++){
                if (current_longest.charAt(i) == string.charAt(i)) {
                    temp_pref += current_longest.charAt(i);
                }
                else {
                    break;
                }
            }
            prefix = temp_pref;
            
        }


        return prefix;
    }
    public static int findMin(String one, String two) {
        return one.length() < two.length() ? one.length() : two.length();
    }
    
}
