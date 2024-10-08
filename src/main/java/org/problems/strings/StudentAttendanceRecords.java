package org.problems.strings;

public class StudentAttendanceRecords {


    public static void main(String[] args) {
        checkRecord("sdfjsdlkfjlsadf");
    }

    public static Boolean checkRecord(String s) {

        int late = 0;
        int absent = 0;
        Boolean isLate = true;
        int j = 0;
        char first = s.charAt(0);
        if (first == 'A')
            absent++;
        for (j = 1; j < s.length(); j++) {

            if (s.charAt(j) == 'A')
                absent++;

            if (first == 'L' && s.charAt(j) == 'L') {
                late++;
                if (late == 2)
                    isLate = false;
            } else {
                late = 0;
            }
            first = s.charAt(j);
        }
        if (absent < 2 && isLate)
            return true;
        return false;
    }
}


