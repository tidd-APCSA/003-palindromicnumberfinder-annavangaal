public class PalindromicNumberFinder {
    private int num;


    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int searchNum = num;
      for(int i = num+1; i > 0; i++){
        searchNum = i;
        if(testPalindromicNum(searchNum) == true){
         break;
        }
      }
      return searchNum-num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer reverseInt = Integer.valueOf(reverseNum(num));
      if(reverseInt.equals(num)){
        return true;
      }else{
        return false;
      }
    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String number = Integer.toString(num);
      String reverse =  "";
      for(int i = number.length()-1; i >= 0; i--){
        reverse += number.charAt(i);
      }
      return reverse;
    }


    // @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
