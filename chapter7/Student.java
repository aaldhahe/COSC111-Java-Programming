public class Student{

   private int studentId;
   private ChapterEight[] course = new ChapterEight[5];
   
   public void setStudentId(int s){
      studentId = s;
   }
   
   public int getStudentId(){
      return studentId;
   }
   
   public ChapterEight getCollegeCourse(int x){
      return course[x];   
   }
   
   public void setChapterEight(ChapterEight c,int x){
      course[x] = c;
   }
}//end class