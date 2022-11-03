class Solution {
    public boolean squareIsWhite(String coordinates) {
       Character str = coordinates.charAt(0);
        int num = Character.getNumericValue(coordinates.charAt(1));
        int flag=0;
        if(str=='a' || str=='c' || str=='e' || str=='g'){
            if(num%2==0)
                flag=1;
        }
        else{
            if(num%2!=0)
                flag=1;
        }
        if(flag==0)
            return false;
        return true;
  
    }
}