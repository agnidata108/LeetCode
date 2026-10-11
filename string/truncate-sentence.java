class Solution {
    public String truncateSentence(String s, int k) {
        s=s.trim()+" ";
        int l=s.length();
        int c=0;
        String S1="",S2="";
        for(int i=0; i<l; i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            S1=S1+ch;
            else{
                if(c<k){
                S2=S2+S1+" ";
                S1="";
                c++;
                }
            }
        } 
        S2 = S2.trim();
        return S2;
        
    }
}