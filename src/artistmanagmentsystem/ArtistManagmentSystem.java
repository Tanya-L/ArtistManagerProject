
package artistmanagmentsystem;

import artistmanagmentsystem.util.SqlStatements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author marie tanya maria
 */
public class ArtistManagmentSystem {
    private static Scanner sc;
    private static DataBaseManager dbm;

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) throws SQLException {
        sc = new Scanner(System.in);
        dbm = new DataBaseManager();
        
        mainMenu();
        
        
        // TODO code application logic here
    }  
    
    public static void mainMenu() throws SQLException {
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Find");
            System.out.println("5. Show All");
            System.out.println("0. Exit");
            System.out.println("What would you like to do: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addArtist();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void addArtist() throws SQLException {
        sc.nextLine();
        System.out.println("Insert the information for the Artist:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();

        dbm.addArtist(name, lastName, age);
    }
//    
//    public int menuUpdate(){
//    }
//    
//    public int menuFind(){
//    }

}
