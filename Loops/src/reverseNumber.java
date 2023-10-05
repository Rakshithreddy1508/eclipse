
public class reverseNumber {


    public int reverseNumber(int number) {

        if(number<0){
            return -1;
        }
        if(number==0){
            return 0;
        }
        int reverseNumber = 0 ;
        while(number>0){
            int digit = number % 10 ;
            reverseNumber = reverseNumber * 10 + digit ;
            number = number/10;
            System.out.printf("digit-%d number-%d reverseNumber-%d",digit,number,reverseNumber).println();
        }
        return reverseNumber;
    }
}