// add package name here if needed
//
class NoDivisionByOneException extends Exception {


  private static final String KEY_MESSAGE = "Unsupported operation: division by one. ";

  public NoDivisionByOneException() {
    super(KEY_MESSAGE);
  }

  public NoDivisionByOneException(String message) {
    super(KEY_MESSAGE + message);
  }

}

