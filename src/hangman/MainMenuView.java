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
    
}
