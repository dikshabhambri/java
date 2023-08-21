public class BintoDec {
    public static void BintoDec(int BinNum){
        int MyNum = BinNum;
        int DecNum = 0;
        int pow = 0;
        while( BinNum>0) {
            int lastDigit = BinNum%10;
            DecNum = DecNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;

        }
        System.out.println("Dec of " + MyNum + " = "  + DecNum);
    }

public static void main (String args[]){
    BintoDec(1001);
}
}