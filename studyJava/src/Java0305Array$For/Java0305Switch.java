package Java0305Array$For;

public class Java0305Switch {
    public static void main(String[] args) {
        int score = 72;
        /*if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 90 && score < 100) {
            System.out.println("A");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else {
            System.out.println("F학점");
        }*/
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            default:
                System.out.println("F학점");
        }
    }
}
