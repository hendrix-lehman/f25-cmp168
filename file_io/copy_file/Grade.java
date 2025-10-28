// add package name here if needed
//

class Grade {
  String examDate;
  String studentName;
  double score;

  public Grade(String examDate, String studentName, double score) {
    this.examDate = examDate;
    this.studentName = studentName;
    this.score = score;
  }

  // getters and setters
  public String getExamDate() {
    return examDate;
  }

  public String getStudentName() {
    return studentName;
  }

  public double getScore() {
    return score;
  }

  @Override
  public String toString() {
    return "Grade{" +
            "examDate=" + examDate +
            ", studentName='" + studentName + '\'' +
            ", score=" + score +
            '}';
  }
}

