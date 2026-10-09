class Solution {
    public boolean detectCapitalUse(String word) {
        boolean b=false;
        word=word.trim();
        int l=word.length();
        int c=0,d=0,a=0;
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            if(ch>='A'&&ch<='Z')
            c++;
            else
            d++;
        }
        if(c==1&&d==l-1&&word.charAt(0)>='A'&&word.charAt(0)<='Z')
        return true;
        
        if(c==l||d==l)
        return true;
        else
        return false;
        
    }
}