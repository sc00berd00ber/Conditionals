public class Main {
    public static void go(int age){
        if (age >= 18){
            System.out.println("GO VOTE!!!");
        }else{
            System.out.println("GO PLAY");
        }
    }

    public static void response(char answer){
        if (answer == 'Y' || answer == 'y'){
            System.out.println("YUP YUP YUP");
        }else{
            System.out.println("NOPE NOPE NOPE");
        }
    }

    public static void drink(int age) {
        if (age < 21){
            System.out.println("Drink Juice");
        }else if (age < 50) {
            System.out.println("Drink Adult Bev");
        }
        else{
            System.out.println("Drink Tea");
        }
    }

    public static void main(String[] args) {
        drink(11); // Juice
        drink(25); // Adult Bev
        drink(99); // Tea

        go(13);
        go(21);

        response('Y');
        response('N');
    }
}