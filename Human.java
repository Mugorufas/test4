public class Human {
    String name;
    int age;
    String home;
    Human(String name,int age,String home){
        this.name=name;
        this.age=age;
        this.home=home;
    }
    void eat(){
        System.out.println(this.name + " is eating");

    }
}
