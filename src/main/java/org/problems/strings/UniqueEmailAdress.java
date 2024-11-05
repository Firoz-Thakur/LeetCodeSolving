package org.problems.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdress {

    public static void main(String[] args) {
        numUniqueEmails(new String[]{"testing"});
    }
    public static void numUniqueEmails(String[] emails) {
     String[] domain ;
     String[] localName;
     Set<String> set = new HashSet<>();
     for(int i=0;i<emails.length;i++)
     {
         String[] part = emails[i].split("@");
         localName = part[0].split("\\+");
         String finalLocalName = localName[0].replace(".","");
         set.add(finalLocalName+"@"+part[1]);
     }
    }
}

