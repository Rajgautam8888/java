import java.util.*;
public static void main(string{}arg){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter two number");
    int a=sc.nextlnt();
    int b=sc.nextlnt();
    System.out.println("Enter an operator do you want to calculate (+,-,*,/,%)");
    char op=sc.next().charAt(0);
    switch(op){
        case'+':system.out.println(a+b);
            break;
            case'-':system.out.println(a-b);
             break;
              case'*':system.out.println(a*b);
               break;
               case'/':system.out.println(a/b);
               break;
               case'%':system.out.println(a%b);
               break;
               default:system.out.println(lnvalid input");
       }        
    }
}