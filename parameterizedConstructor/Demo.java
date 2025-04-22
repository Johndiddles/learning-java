class Human {
    private int age;
    private String name;

    public Human(int a, String n) // parameterized constructor
    {
        age = a;
        name = n;
    }

    public String getProfile()
    {
        return "Name: " + name + ", Age: " + age;
    }
}

class Demo {
    public static void main(String args[]) 
    {
        Human NewHuman = new Human(20, "John");
        System.out.println(NewHuman.getProfile());
    }
}