// add package name here if needed
//
class Tester {

  public static void main(String[] args) {

    Dog dog1 = new Dog("Buddy", 30.5, 20.0, true, 5);
    Dog dog2 = new Dog("Max", false, 3);
    Dog dog3 = new Dog("Bella", 25.0, 18.0);
    Dog dog4 = new Dog();
    Dog dog5 = new Dog("Charlie");


    // we cannot instantiate an abstract class
    // Pet pet = new Pet();
    //

//     Pet[] pets = new Pet[5];
//     pets[0] = dog1;
//     pets[1] = dog2;
//     pets[2] = dog3;
//     pets[3] = dog4;
//     pets[4] = dog5;
    
    // or we can do it this way
    Pet[] pets = {dog1, dog2, dog3, dog4, dog5};
    
    for (Pet pet: pets){
      pet.play();
      System.out.println(pet);
    }

    // test equals method
    // check if dog1 is equal to dog2
    System.out.println("dog1 equals dog2: " + dog1.equals(dog2));

    Pet dog6 = dog1;
    System.out.println("dog1 equals dog6: " + dog1.equals(dog6));

    
  }
}

