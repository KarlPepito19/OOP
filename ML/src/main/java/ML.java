import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Main class
public class ML {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input for role selection
            System.out.println("Choose a gaming role: ");
            System.out.println("1. Mage");
            System.out.println("2. Assassin");
            System.out.println("3. Marksman");
            System.out.println("4. Tank");
            System.out.println("5. Fighter");
            System.out.println("6. Support");
            System.out.print("Enter the number of your choice: ");

            int choice = scanner.nextInt();

            // Process user's choice
            switch (choice) {
                case 1:
                    // Get user input for mage player's name and skill
                    System.out.print("Enter the name of the mage hero: ");
                    String mageName = scanner.next();
                    System.out.print("Enter the mage skill: ");
                    String mageSkill = scanner.next();

                    // Creating an instance of Mage with user input
                    Mage mage = new Mage(mageName, mageSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    mage.printInfo();

                    // Using the interface method
                    mage.performRole();
                    break;
                case 2:
                    // Get user input for assassin player's name and skill
                    System.out.print("Enter the name of the assassin hero: ");
                    String assassinName = scanner.next();
                    System.out.print("Enter the assassin skill: ");
                    String assassinSkill = scanner.next();

                    // Creating an instance of Assassin with user input
                    Assassin assassin = new Assassin(assassinName, assassinSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    assassin.printInfo();

                    // Using the interface method
                    assassin.performRole();
                    break;
                case 3:
                    // Get user input for marksman player's name and skill
                    System.out.print("Enter the name of the marksman hero: ");
                    String marksmanName = scanner.next();
                    System.out.print("Enter the marksman skill: ");
                    String marksmanSkill = scanner.next();

                    // Creating an instance of Marksman with user input
                    Marksman marksman = new Marksman(marksmanName, marksmanSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    marksman.printInfo();

                    // Using the interface method
                    marksman.performRole();
                    break;
                case 4:
                    // Get user input for tank player's name and skill
                    System.out.print("Enter the name of the tank hero: ");
                    String tankName = scanner.next();
                    System.out.print("Enter the tank skill: ");
                    String tankSkill = scanner.next();

                    // Creating an instance of Tank with user input
                    Tank tank = new Tank(tankName, tankSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    tank.printInfo();

                    // Using the interface method
                    tank.performRole();
                    break;
                case 5:
                    // Get user input for fighter player's name and skill
                    System.out.print("Enter the name of the fighter hero: ");
                    String fighterName = scanner.next();
                    System.out.print("Enter the fighter skill: ");
                    String fighterSkill = scanner.next();

                    // Creating an instance of Fighter with user input
                    Fighter fighter = new Fighter(fighterName, fighterSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    fighter.printInfo();

                    // Using the interface method
                    fighter.performRole();
                    break;
                case 6:
                    // Get user input for support player's name and skill
                    System.out.print("Enter the name of the support hero: ");
                    String supportName = scanner.next();
                    System.out.print("Enter the support skill: ");
                    String supportSkill = scanner.next();

                    // Creating an instance of Support with user input
                    Support support = new Support(supportName, supportSkill);
                    System.out.println("");
                    // Using polymorphism to call the overridden method
                    support.printInfo();

                    // Using the interface method
                    support.performRole();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 6.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (NoSuchElementException e) {
            System.out.println("Input not found. Please enter valid input.");
        } finally {
            // Close the Scanner
            scanner.close();
        }
    }
}
