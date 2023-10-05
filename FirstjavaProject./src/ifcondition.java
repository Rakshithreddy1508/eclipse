
public class ifcondition {
    private int marks;

    public ifcondition(int marks) {
     this.marks = marks ;
    }

    public char assignGrade() { // If marks are less than 0 or greater than 100, return 'X'
     if(marks < 0 || marks > 100) {
          return 'X' ;  
     }
       // If marks are greater than or equal to 90, return 'A'
       if(marks >= 90) {  
           return 'A';
       }
        // If marks are greater than or equal to 80, return 'B'
        if(marks >= 80) {
            return 'B';
        } 
        // If marks are greater than or equal to 70, return 'C'
         if(marks >= 70) {
            return 'C';
        } 
        // If marks are greater than or equal to 60, return 'D'
         if(marks >= 60) {
            return 'D';
        } 
        // If marks are greater than or equal to 50, return 'E'
         if(marks >= 50) {
            return 'E';
        } 
        // If marks are less than 50, return 'F'
         if(marks < 50) {
            return 'F';
        } 
        return 'Y';
    }
}