// add package name here if needed
//
class Driver_CookieDistributor {

  public static void main(String[] args) {

    CookieDistributor cd = new CookieDistributor(0, 0);

    System.out.println("Number of cookies: " + cd.getNumCookies());
    System.out.println("Number of people: " + cd.getNumPeople());

    int result = cd.getNumCookiesPerPerson();
    System.out.println("Each person gets " + result + " cookies.");
    
  }
}

