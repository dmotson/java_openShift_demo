package java_openShift_demo;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello World!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
