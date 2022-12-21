public class Main {
    public static void main(String[] args) {
        House house1 = new House("via Roma", 2);
        System.out.println("House in " + house1.address + " has been built");
        House house2 = new House ("via Garibaldi", 1);
        System.out.println("House in " + house2.address + " has been built");

    }

}
