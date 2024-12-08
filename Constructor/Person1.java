class Person {
    String name;
    int age;
    public Person(String name){
       this.name = name;
       this.age = age;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name :" +name+ ",Age: "+age);
    }
    public static void main(String ards[]){
        Person person1 = new Person("Sindhu");
        Person person2 = new Person("Teja", 22);

        person1.displayInfo();
        person2.displayInfo();

    }

}
