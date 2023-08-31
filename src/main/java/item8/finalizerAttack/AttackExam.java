package item8.finalizerAttack;

public class AttackExam {
    public static void main(String[] args) throws InterruptedException {
        try {
            User user = new CustomUser("홍길동");
        } catch (IllegalArgumentException e) {
            System.out.println("이러면??");
        }
        System.gc();
        Thread.sleep(3000L);
    }
}
