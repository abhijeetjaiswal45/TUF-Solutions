import java.util.Arrays;

class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        int m=Student.length;
        int l=0;
        int r=0;
        while(l<Cookie.length && r<Student.length) {
            if(Cookie[l] >= Student[r]) {
                r+=1;
            }
            l+=1;
        }
        return r;
    }
}