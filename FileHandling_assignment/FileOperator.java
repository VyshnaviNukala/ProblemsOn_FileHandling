import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a File");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createFolder(scanner);
                    break;
                case 2:
                    createTextFile(scanner);
                    break;
                case 3:
                    writeToFile(scanner);
                    break;
                case 4:
                    appendToFile(scanner);
                    break;
                case 5:
                    renameFile(scanner);
                    break;
                case 6:
                    deleteFile(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void createFolder(Scanner scanner) {
        System.out.println("Enter folder name:");
        String folderName = scanner.next();
        File folder = new File(folderName);
        if (!folder.exists()) {
            boolean created = folder.mkdir();
            if (created) {
                System.out.println("Folder created successfully!");
            } else {
                System.out.println("Folder creation failed!");
            }
        } else {
            System.out.println("Folder already exists!");
        }
    }

    private static void createTextFile(Scanner scanner) {
        System.out.println("Enter file name:");
        String fileName = scanner.next();
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
                if (created) {
                    System.out.println("File created successfully!");
                } else {
                    System.out.println("File creation failed!");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        } else {
            System.out.println("File already exists!");
        }
    }

    private static void writeToFile(Scanner scanner) {
        System.out.println("Enter file name:");
        String fileName = scanner.next();
        File file = new File(fileName);
        if (file.exists()) {
            try {
                System.out.println("Enter text to write to file:");
                String text = scanner.next();
                FileWriter writer = new FileWriter(file);
                writer.write(text);
                writer.close();
                System.out.println("Text written to file successfully!");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist!");
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.println("Enter file name:");
        String fileName = scanner.next();
        File file = new File(fileName);
        if (file.exists()) {
            try {
                System.out.println("Enter text to append to file:");
                String text = scanner.next();
                FileWriter writer = new FileWriter(file, true);
                writer.write(text);
                writer.close();
                System.out.println("Text appended to file successfully!");
                 } catch (IOException e) {
                System.out.println("Error appending to file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist!");
        }
    }

    private static void renameFile(Scanner scanner) {
        System.out.println("Enter file name:");
        String fileName = scanner.next();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Enter new file name:");
            String newFileName = scanner.next();
            File newFile = new File(newFileName);
            boolean renamed = file.renameTo(newFile);
            if (renamed) {
                System.out.println("File renamed successfully!");
            } else {
                System.out.println("File rename failed!");
            }
        } else {
            System.out.println("File does not exist!");
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.println("Enter file name:");
        String fileName = scanner.next();
        File file = new File(fileName);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("File deletion failed!");
            }
        } else {
            System.out.println("File does not exist!");
        }
    }
}
import java.io.*;

public class FileOperator 
{
    public static void main(String[] args) {

        String fileName = "D:\\HeroVired.txt";
        int totalChars = 0;

        try {
            File file = new File(fileName);

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                totalChars += line.length();
            }

            br.close();

            fr.close();

            System.out.println("Total number of characters in file are: " + totalChars);

        } catch (IOException e) {

            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}