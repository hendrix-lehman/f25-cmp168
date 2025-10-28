import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

class App {

  public static void copyFile(String source, String destination) {

    // use scanner to read song.txt file and copy its content to song_copy.txt file
    Scanner scanner = null; // the Scanner helps to read the file
    PrintWriter writer = null; // the PrintWriter helps to write to the file
    try {
      File songFile = new File(source);
      File copyFile = new File(destination);
      scanner = new Scanner(songFile);
      writer = new PrintWriter(copyFile);

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        writer.println(line);
      }

      System.out.println("File copied successfully.");

    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } finally {
      if (scanner != null) {
        scanner.close();
      }
      if (writer != null) {
        writer.close();
      }
    }
  }

  public Grade[] readGradesFromFile(String filename) {

    Scanner scanner = null;
    Grade[] grades = new Grade[100]; // assuming a maximum of 100 grades
    int count = 0;
    try {
      scanner = new Scanner(new File(filename));
      boolean hasReadFirstLine = false;

      while (scanner.hasNextLine()) {
        if (!hasReadFirstLine) {
          // skip the first line
          hasReadFirstLine = true;
          scanner.nextLine();
          continue;
        }
        String line = scanner.nextLine();
        // System.out.println(line);
        String[] parts = line.split(",");
        Grade grade = new Grade(parts[0].trim(), parts[1].trim(), Double.parseDouble(parts[2].trim()));
        grades[count++] = grade;

        // for (String part : parts) {
          // part = part.trim();
          // System.out.print("Part: " + part + " | ");
        // }
        // System.out.println();
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
    return grades;
  }
  

  public static void main(String[] args) {
    App app = new App();
    // copyFile("song.txt", "song_copy.txt");
    Grade[] grades = app.readGradesFromFile("grades.txt");
    double totalScore = 0;
    int gradeCount = 0;
    for (Grade grade : grades) {
      if (grade != null) {
        totalScore += grade.getScore();
        gradeCount++;
      }
    }
    double averageScore = totalScore / gradeCount;
    System.out.println("Average Score: " + averageScore);
  }
}
