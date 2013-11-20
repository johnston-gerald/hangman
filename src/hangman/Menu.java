/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author gerrygj
 */
public abstract class Menu {
    
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

    public final void display() {
        System.out.println("\nPlease enter one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t" + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        //System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inputScanner = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            this.display();
            command = inputScanner.nextLine();
            command = command.trim();
            valid = validCommand(command);
            if (!validCommand(command)) {
                System.out.println("\nInvalid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }

}
