package fundamentals;

public class BlockScope {

    static void main() {

        int a = 500;
        int b = 300;

        {
            a = 800; //anything that is initialized outside the block can be used inside the block but cannot be
            b = 600; //reinitialized the block

            int c = 1000;
            System.out.println(c);
        }
        int c = 633; // Anything that is initialized inside the block can be reinitialized outside the block
                     // but cannot be used outside the block

        System.out.println(c);
    }

}
