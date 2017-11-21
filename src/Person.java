public class Person {
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public static void main(String [] args){
        Person bob = new Person(12,"Bob");
        Person bob2 = new Person(12,"Bob");
        Person jack = new Person(20, "Jack");

        System.out.println(bob.equals(jack));
        System.out.println(bob2.equals(bob));

        try {
            Thread.sleep(1000);
            int result = 5/0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        System.out.println(bob == bob2);

        System.out.println(jack.hashCode());
        System.out.println(bob.hashCode());
        System.out.println(bob2.hashCode());
    }
}


