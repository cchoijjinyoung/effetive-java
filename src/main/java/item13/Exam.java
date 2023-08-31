package item13;

public class Exam {
    public static void main(String[] args) throws CloneNotSupportedException {
        Room room = new Room();
        Room room2 = (Room) room.clone();
        System.out.println(room); // item13.Room@5594a1b5
        System.out.println(room2); // item13.Room@6a5fc7f7
        System.out.println(room == room2); // false
        System.out.println(room2.equals(room)); // false
        room2.hello();

        System.out.println("-------------------------");
        ExtendsRoom er = new ExtendsRoom();
        ExtendsRoom er2 = (ExtendsRoom) er.clone();
        er2.hello();
        System.out.println(er.clone().getClass());
        System.out.println(er); // item13.ExtendsRoom@1e643faf
        System.out.println(er2); // item13.ExtendsRoom@6e8dacdf
        System.out.println(er2 == er); // false
        System.out.println(er2.equals(er)); // false

        System.out.println("-------------------------");
        Room er3 = (Room) er2.clone();
        System.out.println(er3.clone().getClass()); // class item13.ExtendsRoom
        System.out.println(er3); // item13.ExtendsRoom@7a79be86
        System.out.println(er2 == er3); // false
        System.out.println(er3.equals(er)); // false
        er3.hello();
    }
}
