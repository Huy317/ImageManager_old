//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        String path = "C:\\Users\\GIA HUY\\Downloads\\Images\\nice img\\F7yxruyagAAjYKG.jpg";
        System.out.println(path.substring(path.lastIndexOf("\\")+1, path.lastIndexOf(".")));
    }
}