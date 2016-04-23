public class FullDeck{

   public static void main(String [] args){
   
      Card[] deck = new Card[52];
      int suit = 1;
      int value = 1;
      
      for(int x = 0; x < 52; ++x){
         deck[x] = new Card();
         
         switch(suit){
            case 1:
               deck[x].setSuit("Spades");
               break;
            case 2:
               deck[x].setSuit("Hearts");
               break;
            case 3:
               deck[x].setSuit("Diamonds");
               break;
            case 4:
               deck[x].setSuit("Clubs"); 
            //finish rest thorugh 4
      
         }
         switch(value){
         
            case 1:
               deck[x].setValue(1);
               deck[x].setRank("Ace");
               break;
           case 2:
            deck[x].setValue(2);
            deck[x].setRank;
           //do through 10
           
            case 11:
               deck[x].setValue(11);
               deck[x].setRank("Jack");
               break;
               
           //case 12 & 13
         }
         System.out.println("Card: " + deck[x].getRank() + " of " + deck[x].getSuit());
         ++value;
         
         if (value > 13){
            value = 1;
            ++suit;
            
         }
         
         if(suit  > 4){
            break;
         }
      }
   
   }
   

}