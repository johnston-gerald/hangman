package wddbyui.cit260.hangman.menus;

import wddbyui.cit260.hangman.interfaces.DisplayInfo;
import wddbyui.cit260.hangman.interfaces.EnterInfo;
import java.util.Scanner;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.exceptions.MenuException;

/**
 *
 * @author gerrygj
 */
public class Menu implements DisplayInfo, EnterInfo {

    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public final void display() {
        System.out.println("\nPlease enter one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t" + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }

    private boolean validCommand(String command) throws MenuException {
        String[][] items = this.menuItems;

        try { //Gerald and Lorna Lesson 11 Paired assignment
            for (String[] item : this.menuItems) {
                if (item[0].equals(command)) {
                    return true;
                }
            }
            throw new MenuException();
        }
        catch (MenuException e) {
            System.out.println("\n" + ErrorType.MENU_INPUT.getMessage());
            return false;
        }
    }

    @Override
    public final String getCommand() throws MenuException{

        Scanner inputScanner = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            this.display();
            command = inputScanner.nextLine();
            command = command.trim();
            valid = validCommand(command);

        } while (!valid);
        
        return command;
    }
}