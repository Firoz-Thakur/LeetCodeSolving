package org.problems.strings;

public class LicenseKeyFormating {
    public static void main(String[] args) {

    }
    public String licenseKeyFormatting(String s, int k){

        StringBuilder sb = new StringBuilder();
        s.toUpperCase();
        for(int i=s.length()-1;i>=0;i--)
        {
            int window=0;
            if(window==k)
            {

                sb.append("-");
            }
            else if(s.charAt(i)=='-')
            {
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

