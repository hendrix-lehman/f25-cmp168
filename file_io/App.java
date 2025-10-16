// add package name here if needed
//
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class App {

  public static void main(String[] args) throws IOException {

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = scanner.nextInt();
    // System.out.println("You entered: " + number);

    String filePath = File.separatorChar + "home/hendrix/lehman/f25-cmp168/file_io/";
    System.out.println("File path: " + filePath);

    File file = new File(filePath);

    if (file.isDirectory()) {
      System.out.println("It's a directory.");
      String[] files = file.list();
      for (String f : files) {
        // System.out.print(f);
        if (new File(f).isDirectory()) {
          System.out.println("(dir) " + f);
        } else {
          System.out.println("(file) " + f);
        }
      }
    } else if (file.isFile()) {
      System.out.println("It's a file.");
    } else {
      System.out.println("It doesn't exist.");
    }

    // file.createNewFile();

    // if (file.exists()) {
    //   System.out.println("File exists.");
    // } else {
    //   file.createNewFile();
    //   System.out.println("File didn't exist but created it.");
    // }
    
  }
}

