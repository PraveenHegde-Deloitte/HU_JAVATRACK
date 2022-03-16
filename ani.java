public class ani extends animal
{
    public static void main(String[] args) {
        animal a = new animal();
        a.setName("dog");
        a.setAge(20);
        a.setColor("white");
        System.out.println("name of the animal =" + a.getName());
        System.out.println("age of the animal =" +a.getAge());
        System.out.println("color of the animal =" +a.getColor());
    }
}
