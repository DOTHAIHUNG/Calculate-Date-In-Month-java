import java.util.Scanner;

public class CalculateDateInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = scanner.nextInt();

        String daysInMonth;
        private	static	boolean	isLeapYear(int	year)	{ 
        boolean	isLeapYear	=	false;    
            if(year	%	4 == 0){       
                if	(year	%	100 == 0){            
                    if(year	%	400 == 0) 
                        isLeapYear	=	true;        
          } 
            else	{ 
            isLeapYear	=	true;       
      }     
            return	isLeapYear; 
        switch (month) {
            case 2:
                boolean	isLeapYear	=	isLeapYear(year);            
                if(isLeapYear){                
                    return	29;            
                } else	{                
                    return	28;            
                }        
                    default:            
                return	0; 
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }
        if (daysInMonth != "") System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
