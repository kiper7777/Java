public class Methodobject {
  String name;
  int age;

  public void initObject(String userName, int userAge) {
    name = userName;
    age = userAge;
  }

  public void display() {
    System.out.println("Good morning " + name + ", " + "you are " + age + " years old");
  }

  public static void main(String[] args) {
    Methodobject iniob = new Methodobject();
    iniob.initObject("John", 28);
    iniob.display();
  }
}
