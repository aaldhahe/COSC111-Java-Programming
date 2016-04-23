import javax.swing.*;

public class InputGrades{
   public static void main(String[] args){
   
      Student[] student = new Student[2];
      int x,y,z;
      String courseEntry, entry = "", msg;
      int idEntry, credits;
      char gradeEntry = ' ';
      boolean isGoodGrade = false;
      char[] grades = {'A', 'B', 'C', 'D', 'E'};
      for(x = 0; x < student.length; ++x){
         Student stu = new Student();
         entry = JOptionPane.showInputDialog(null, "For student number:" + (x + 1) + " enter student ID: ");
         idEntry = Integer.parseInt(entry);
         stu.setStudentId(idEntry);
         for(y = 0; y < 5; ++y){
            courseEntry = JOptionPane.showInputDialog(null, "For Student# " + (x + 1) +
                                                  " enter course#" + (y + 1) + ": ");
            entry = JOptionPane.showInputDialog(null, "Enter number of credit: ");
            credits = Integer.parseInt(entry);
            isGoodGrade = false;
            entry = JOptionPane.showInputDialog(null, "Enter grade: ");
            gradeEntry = entry.charAt(0);
            
            for(z = 0; z < grades.length; ++z){
            if(gradeEntry == grades[z])
               isGoodGrade = true;
            }//end z loop
            ChapterEight temp = new ChapterEight();
               //call the sets to load ChapterEight
               stu.setChapterEight(temp, y);
               
         }//end y for loop
         student[x] = stu;
      }//end main loop or for loop x
      for(x = 0; x < student.length; ++x){
         msg = "Student info:\nStuden ID#: " + student[x].getStudentId();
         for(y = 0; y < 5; ++y){
            ChapterEight temp = new ChapterEight();
            temp = student[x].getCollegeCourse(y);
            msg += "\nCourse#: " + temp.getCourseId();
            msg += "\nCourse Credits: " + temp.getCreditHours();
            msg += "\nGrade " + temp.getLetterGrade();
         }//end y loop
         JOptionPane.showMessageDialog(null, msg);

      }//end x loop
   }//end main
}//end class