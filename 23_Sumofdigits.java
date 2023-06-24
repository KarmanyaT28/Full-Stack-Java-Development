class Sumofdigits {
    public static void main(String[] args) {
        int value=1234;
        int sumofdigits = 0;
        while(true){
            sumofdigits = sumofdigits + value%10;
            value = value/10;
            if(value<10){
                break;
            }

        }
        System.out.println("Sum of digits is " + sumofdigits);
    }
}
