class Solution {
    public char kthCharacter(int k) {

        int length=1;
        int shift=0;

        while (length<k)
        {
            length*=2;
        }

        while (length>1)
        {
            int half=length/2;

            if (k>half)
            {
                k=k-half;
                shift=shift+1;
            }

            length=half;
        }
        return (char)('a' + shift);
    }
}