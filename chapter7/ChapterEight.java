public class ChapterEight{
   
   private String courseId;
   private int creditHours;
   private char[] letterGrade;
   
   public void setCourseId(String ci){
      courseId = ci;
   }
   
   public String getCourseId(){
      return courseId;
   }
   
   public void setCreditHours(int hours){
      creditHours = hours;
   }
   
   public int getCreditHours(){
      return creditHours;
   }
   
   public void setLetterGrade(char[] letter){
      letterGrade = letter;
   }
   
   public char[] getLetterGrade(){
      return letterGrade;
   }
   
   
}//edn class