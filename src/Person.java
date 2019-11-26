public class Person {
    private String name;

    public Person(String extName){
        this.name = extName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello from %s%n",this.name);
    }

    public static void main(String[] args) {
        Person catman = new Person("Catman Jones");
        System.out.println(catman.getName());
        catman.setName("Hello");
        catman.sayHello();
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.setName("John");
        System.out.println(person1.getName());
    }
}


