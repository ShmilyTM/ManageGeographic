
package executed;

import controller.Controller;
import view.Menu;

public class Main extends Menu{
    Controller thien = new Controller();
    
    public Main(){
        super("\n==========================================================================", 
             new String[] {"Input the information of 11 countries in East Asia",
                            "Display the information of country you've just input",
                            "Search the information of country by user-entered name",
                            "Display the information of countries sorted name in ascending order",
                            "Auto generate country",
                            "Exit!"});
    }
    
    public static void main(String[] args) {
        Main hi = new Main();
        hi.run();
        
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("==========================================================================");
                thien.addCountry();
                break;
            case 2:
                System.out.println("==========================================================================");
                thien.displayCountry(thien.getCurrentCtList());
                break;
            case 3:
                thien.searchInformationByName();
                break;
            case 4:
                thien.sortInformationByAscendingOrder();
                break;
            case 5:
                thien.autoCreateCountry();
                break;
            case 6:
                System.out.println("==========================================================================");
                System.out.println("Program closing!");
                break;
            default:
                System.out.println("==========================================================================");
                System.out.println("We don't have that options!");
                break;
        }
    }
}
