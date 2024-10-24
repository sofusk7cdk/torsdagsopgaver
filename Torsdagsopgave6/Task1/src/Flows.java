public class Flows {

    public void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("a");
            System.out.println("v");
            methodB("start");
        } else {
            System.out.println("v");
            System.out.println(methodC(input));
        }
        System.out.println("t");
    }

    public void methodB(String start) {
        System.out.println("a");
        methodC(start);
    }

    public int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("r");
        System.out.println("s");
        System.out.println("j");
        System.out.println("o");
        System.out.println("v");
    }
}
