// add package name here if needed
//
import java.io.File;

class Delete {

  public static void main(String[] args) {
    // read file name from command line argument
    if (args.length != 1) {
      System.out.println("Usage: java Delete <file-path>");
      return;
    }

    String filePath = args[0];
    File file = new File(filePath);

    try {
       if (file.exists()) {
        if (file.delete()) {
          System.out.println("Deleted the file: " + file.getName());
        } else {
          System.out.println("Failed to delete the file.");
        }
      } else {
        System.out.println("File does not exist.");
      }
    } catch (Exception e) {
      System.out.println("Invalid file path.");
      return;
    }
   
  }
}

