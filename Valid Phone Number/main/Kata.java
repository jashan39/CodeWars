public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    // TODO: Return whether phoneNumber is in the proper form
    char[] number = phoneNumber.toCharArray();
    int[] checker = new int[]{1,2,3,6,7,8,10,11,12,13};
  
    if(number.length == 14){
  
    if((number[0] == '(') && (number[4] == ')') && (number[5] == ' ') && (number[9] == '-'))
       {
                    
           for(int i = 0; i < checker.length; i++){
           if(!(Character.isDigit(number[checker[i]])))   return false;
           }
           
          return true;
      
      }
    }
    
    return false;
  }
}