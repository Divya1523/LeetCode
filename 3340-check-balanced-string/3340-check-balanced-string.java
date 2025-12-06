class Solution {
    public boolean isBalanced(String num) {
        int es = 0, os = 0;
        for(int i = 0; i < num.length(); i++){
            int n = num.charAt(i) - '0';
            if(i % 2 == 0) es += n;
            else os += n;
        }
        if(es == os) return true;
        else return false;
    }
}