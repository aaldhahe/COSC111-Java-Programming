//chapter 10
public class SugarSmash{
   private int idNumber;
   private String screenName;
   
   private int[] highScore = new int[10];
   
   public int getIdNumber(){
      return idNumber;
   }
   public String getScreenName(){
      return screenName;
   }
   public void setIdNumber(int idNumber){
      this.idNumber = idNumber;
      
   }
   public void setScreenName(String screenName){
      this.screenName = screenName;
   }
   public int getScore(int level){
      int score = 0;
      if(level < 0 || level > 9)
         System.out.println("Invalid level");
      else{
         score = highScore[level - 1];
      }   
    return score;
      
   }
   
   public void setScore(int score, int level){
      int previousLevel;
      if(level == 1)
         highScore[level - 1] = score;
      else{
         previousLevel = highScore[level - 2];
         if(score < 100)
            System.out.println("Did not achieve 100 pts score on the first level");
         else
            highScore[level - 1] = score;
      }
   }//end method
   
}//end class