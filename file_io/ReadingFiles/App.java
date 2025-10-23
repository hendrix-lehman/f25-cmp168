// add package name here if needed
//
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileOutputStream;

class App {

  public static void main(String[] args) {

    Scanner scanner = null;

    // connecting to the keyboard
    // try {
    //   scanner = new Scanner(System.in);

    //   // prompt the user to enter their name
    //   System.out.print("Enter your name: ");
    //   String name = scanner.nextLine();

    //   // greet the user
    //   System.out.println("Hello, " + name + "!");
    // } catch (Exception e) {
    //   System.out.println("Error initializing scanner: " + e.getMessage());
    //   return;
    // } finally {
    //   if (scanner != null) {
    //     scanner.close();
    //   }
    // }

    // connecting to a file named "input.txt"
    // reading a file using Scanner
    try {
      File file = new File("input.txt");
      scanner = new Scanner(file);
      if (file.length() == 0) {
        System.out.println("The file is empty.");
        return;
      }
      // read and print each line from the file
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }

    // reading a file using FileReader and BufferedReader
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try {
      fileReader = new FileReader("input.txt");
      bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    } finally {
      try {
        if (bufferedReader != null) {
          bufferedReader.close();
        }
        if (fileReader != null) {
          fileReader.close();
        }
      } catch (IOException e) {
        System.out.println("Error closing file: " + e.getMessage());
      }
    } 

    // writing to a file using FileWriter and BufferedWriter 
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    try {
      fileWriter = new FileWriter("output.txt");
      bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("This is a test line.");
      bufferedWriter.newLine();
      bufferedWriter.write("This is another test line.");
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
    } finally {
      try {
        if (bufferedWriter != null) {
          bufferedWriter.close();
        }
        if (fileWriter != null) {
          fileWriter.close();
        }
      } catch (IOException e) {
        System.out.println("Error closing file: " + e.getMessage());
      }
    }

    // writing to a file using the PrintWriter class
    PrintWriter printWriter = null;
    try {
      printWriter = new PrintWriter(new FileOutputStream("output_printwriter.txt", true));
      printWriter.println("This is a test line using PrintWriter.");
      printWriter.println("This is another test line using PrintWriter.");
    } catch (FileNotFoundException e) {
      System.out.println("Error writing to file: " + e.getMessage());
    } finally {
      if (printWriter != null) {
        printWriter.close();
      }
    }

    System.out.println("End of program.");
    
  }
}

