import java.util.*;
public class atm{

    

    
        
        // Define variables to store user's balance and transaction history
        private static double balance = 0;
        private static String transactionHistory = "Transaction history:\n";
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String username = "user123";
            String password = "pass123";
            
            // Prompt user to enter username and password
            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();
            
            // Verify login credentials
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login successful!\n");
                
                // Display main menu
                while (true) {
                    System.out.println("Main menu:");
                    System.out.println("1. Transaction history");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Quit");
                    
                    // Prompt user to enter choice
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (choice) {
                        case 1:
                            // Display transaction history
                            System.out.println(transactionHistory);
                            break;
                            
                        case 2:
                            // Withdraw money
                            System.out.print("Enter amount to withdraw: ");
                            double amountToWithdraw = scanner.nextDouble();
                            scanner.nextLine();
                            if (amountToWithdraw > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                balance -= amountToWithdraw;
                                transactionHistory += "Withdrawal of $" + amountToWithdraw + "\n";
                                System.out.println("Transaction successful!");
                            }
                            break;
                            
                        case 3:
                            // Deposit money
                            System.out.print("Enter amount to deposit: ");
                            double amountToDeposit = scanner.nextDouble();
                            scanner.nextLine();
                            balance += amountToDeposit;
                            transactionHistory += "Deposit of $" + amountToDeposit + "\n";
                            System.out.println("Transaction successful!");
                            break;
                            
                        case 4:
                            // Transfer money
                            System.out.print("Enter amount to transfer: ");
                            double amountToTransfer = scanner.nextDouble();
                            scanner.nextLine();
                            if (amountToTransfer > balance) {
                                System.out.println("Insufficient balance!");
                            } else {
                                System.out.print("Enter recipient's account number: ");
                                String recipientAccountNumber = scanner.nextLine();
                                balance -= amountToTransfer;
                                transactionHistory += "Transfer of $" + amountToTransfer + " to account " + recipientAccountNumber + "\n";
                                System.out.println("Transaction successful!");
                            }
                            break;
                            
                        case 5:
                            // Quit program
                            System.out.println("Exiting program...");
                            System.exit(0);
                            break;
                            
                        default:
                            // Invalid choice
                            System.out.println("Invalid choice!");
                            break;
                    }
                    
                    System.out.println("Current balance: $" + balance);
                }
            } else {
                System.out.println("Incorrect username or password. Exiting program...");
                System.exit(0);
            }
        }
    }
    
