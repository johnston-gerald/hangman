package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.enums.Status;

/**
 *
 * @author gerrygj
 */
public class MainMenuView extends Menu {  //Lesson 10 Paired, moved to menus package

    private static final String[][] menuItems = {
        {"1", "Continue game"},
        {"2", "Display instructions"},
        {"3", "Exit program"},
    };

    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }

    public Status getMainMenuItem() {   //Lesson 10 Paired, Lorna & Gerald
        return mainMenuControl.activateControl(this.getCommand().charAt(0));
    }
    
}
