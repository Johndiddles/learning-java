public class Demo {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("first one");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                };
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("second block");
                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        // thread1.setPriority(10);
        // thread2.setPriority(1);

        thread1.start();
        thread2.start();
    }
}