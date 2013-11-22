package hangman;

/**
 *
 * @author gerrygj
 */
public class MainMenuView extends Menu {  //Subclass of Menu, Gerald and Lorna, paired assignment, lesson 9.

    private static final String[][] menuItems = {
        {"1", "Continue game"},
        {"2", "Display instructions"},
        {"3", "Exit program"},
        {"4", "Display Class Names"},  //Added just to test the override example, Gerald and Lorna, paired assignment, lesson 9.
    };

    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }

    public void getMainMenuItem() {
        mainMenuControl.activateControl(this.getCommand().charAt(0));
    }
    
    @Override
    public void displayClassName() {  //Added just for override example, Gerald and Lorna, paired assignment, lesson 9.
        System.out.println("Class name: MainMenuView");
    } 
}
