class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str_arr = {"ab", "a"};
        System.out.println(longest(str_arr));
    }

    public static String longest(String[] strs) {
        
        String prefix = strs[0];        //this is the longest prefix, initially the first word
        
        for (String word: strs) {
            if (prefix.length() == 0) {return "";}
            for (int i = 1; i < prefix.length()+1; i++) {
                if (!word.substring(0, i).equals(prefix.substring(0, i))){
                    System.out.println("Changing prefix \n Previous Prefix: " + prefix);
                    prefix = prefix.substring(0, i-1);
                    System.out.println("Updated Prefix: " + prefix);
                    break;
                    
                }
            }
        }
        return prefix;
    }

    private static int max(int length, int length2) {
        if (length > length2) { return length;}
        return length2;
    }
}