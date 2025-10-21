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

    // String filePath = File.separatorChar + "home/hendrix/lehman/f25-cmp168/file_io/";
    String filePath = "."; 
    System.out.println("File path: " + filePath);

    File file = new File(filePath);

    if (file.isDirectory()) {
      System.out.println("It's a directory.");
      File[] files = file.listFiles();
      for (File f : files) {
        // System.out.print(f);
        if (f.isDirectory()) {
          System.out.println("(dir) " + f.getCanonicalPath());
        } else {
          System.out.println("(file) " + f.getCanonicalPath());
        }
        // if(f.getName().endsWith(".txt")) {
          // f.setWritable(false);
          // System.out.println("Set " + f.getName() + " to read-only.");
        // }
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

