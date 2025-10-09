// add package name here if needed
//
class CookieDistributor {

  // attributes
  private int numPeople = 0;
  private int numCookies = 0;

  // constructor
  public CookieDistributor() {
  }

  public CookieDistributor(int numCookies, int numPeople) {
    // ensure only values of 0 or greater are assigned
    if (numPeople > 0) {
      this.numPeople = numPeople;
    }

    if (numCookies > 0) {
      this.numCookies = numCookies;
    }
  }

  // getters and setters
  public int getNumPeople() {
    return numPeople;
  }

  public void setNumPeople(int numPeople) {
    if (numPeople > 0) {
      this.numPeople = numPeople;
    }
  }

  public int getNumCookies() {
    return numCookies;
  }

  public void setNumCookies(int numCookies) {
    if (numCookies > 0) {
      this.numCookies = numCookies;
    }
  }

  // methods
  public int getNumCookiesPerPerson() {
    return numCookies / numPeople;
  }

  public void increaseNumPeople() {
    numPeople++;
  }

  public void increaseNumPeople(int people) {
    if (people > 0) {
      numPeople += people;
    }
  }

  public void increaseNumCookies() {
    numCookies++;
  }

  public void increaseNumCookies(int cookies) {
    if (cookies > 0) {
      numCookies += cookies;
    }
  }

  @Override
  public String toString() {
    return "CookieSplitter [numPeople=" + numPeople + ", numCookies=" + numCookies + "]"; 
  }

}

