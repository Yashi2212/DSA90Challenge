class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        //"A man, a plan, a canal: Panama"

        while(start<end){
            //check about LetterorDigit
            if( !Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            if( !Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            //letter lelo
            char leftChar= Character.toLowerCase(s.charAt(start));//a
            char rightChar= Character.toLowerCase(s.charAt(end));//a
            if( leftChar != rightChar){
                return false;
            }
            start ++;
            end --;
        }
        return true;
}
}