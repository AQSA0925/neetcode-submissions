class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    boolean isPalindrome =true;
    int n = s.length();
    for(int i=0; i<n/2;i++){
        if(s.charAt(i) != s.charAt(n-1-i)){
            isPalindrome = false;
            break;
        }
    }
    return isPalindrome;
    }
}
