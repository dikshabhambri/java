public class ElseIf{
    public static void main (String args[]){
        int age=22;
        if(age>=18){
            System.out.println("ADULT");
        }
            else if(age>=13 && age<18){
                System.out.println("TEENAGER");

            }
            else{
                System.out.println("child");
            }
        }
    
    }
