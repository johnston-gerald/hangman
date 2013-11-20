package hangman;

/**
 *
 * @author gerrygj
 */
public class MainMenuView extends Menu {

    private static final String[][] menuItems = {
        {"1", "Continue game"},
        {"2", "Display instructions"},
        {"3", "Exit program"},
    };

    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }

    public void getMainMenuItem() {
        mainMenuControl.activateControl(this.getCommand().charAt(0));
    }
    
    /*public char displayMenu() {
        Scanner inputScanner = new Scanner(System.in);
        
        String menuSelection = "0";
    
        do {
            System.out.println("\nPlease enter one of the following commands:"
                + "\n\t1. Continue game"
                + "\n\t2. Display instructions"
                + "\n\t3. Exit program");
            
            menuSelection = inputScanner.next();
            
        } while (ErrorHandling.isInteger(menuSelection) == false || menuSelection.charAt(0) < '1' || menuSelection.charAt(0) > '3');  //Lorna made changes
    
        return menuSelection.charAt(0);
    }*/
    
}
