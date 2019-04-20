package 实现strStr;

public class StrStr {
    public static void main(String[] args) {
        String hayStack = "a";
        String needle = "a";
        String brock = "";
        System.out.println(strStr(hayStack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() == 0)
            return 0;
        if(needle.length() > haystack.length())
            return -1;
        for(int i=0 ;i<= haystack.length() - needle.length();i++){
            boolean successFlag = true;
            for(int j = 0;j<needle.length();j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    successFlag = false;
                    break;
                }
            }
            if(successFlag)
                return i;
        }
        return -1;
    }
}
