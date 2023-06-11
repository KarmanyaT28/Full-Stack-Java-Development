import java.util.Locale;

class SwitchCase {
    public static void main(String[] args) {
        int x=3;
//        float x1 = 1.0F; Cannot switch on a value of type float. Only convertible int values , strings or enum variables are permitted
//        String and char will work with switch case
//        if(x==1){
//            System.out.println("The value of x is 1");
//        }
//        else if(x==2){
//            System.out.println("The value of x is 2");
//        }
//        else if(x==3){
//            System.out.println("The value of x is 3");
//        }
//        else{
//            System.out.println("The value of x is other than 1,2,3");
//        }

//        switch(x){
//            case 1:
//                System.out.println("The value of x is 1");
//                break;
//            case 2:
//                System.out.println("The value of x is 2");
//                break;
//            case 3:
//                System.out.println("The value of x is 3");
//                break;
//            default:
//                System.out.println("The value of x is other than 1,2,3");
//                break;
//        }
        String name= "TEam";

        switch(name.toLowerCase(Locale.ROOT)){
            case "author":
                System.out.println("Chaand");
                break;
            case "team":
                System.out.println("Team StudyEasy");
                break;
            case "editor":
                System.out.println("Karmanya tyagi");
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
