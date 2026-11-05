public class Hello {
    public static void main(String[] args) {

        String name = System.getenv("WHO_TO_GREET");

        if (name == null || name.isEmpty()) {
            name = "Student";
        }

        System.out.println("Hello " + name + "!");
        System.out.println("This program is running inside GitHub Actions.");
    }
}
