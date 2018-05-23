class MyClass {
//  το sayHello() ειναι το ονομα της μεθοδου ... πρωτα φτιαχτω την μεθοδο εδω και απο κατω καλω την μεθοδο 
  static void sayHello() {
    System.out.println("Hello World!");
  }

  public static void main(String[ ] args) {
    sayHello();
  }
}
// Outputs "Hello World!"

// οταν εχεις φτιαξει μια φορα την μεθοδο απλα την καλεις και ξανα τρεχει 
//---------------------------------------------------------------------------------------------


class MyClass {

    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[ ] args) {
        sayHello();
        sayHello();
        sayHello();
    }

}


//το δικο μου :P

class MyClass {

    static void sayHello() {
        System.out.println("Hello World!");
    }
    
    static void bakaliaros() {
        System.out.println("mpakaliaros");
    }

    public static void main(String[ ] args) {
        sayHello();
        sayHello();
        sayHello();
        bakaliaros();
    }

}