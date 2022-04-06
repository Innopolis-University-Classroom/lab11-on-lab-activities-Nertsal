import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Workshop carWorkshop = new Workshop();

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (next.toUpperCase().equals("A")) {
            carWorkshop.setWorkshop(message -> System.out.println("we Should assembles it"));
        } else if (next.toUpperCase().equals("D")) {
            carWorkshop.setWorkshop(message -> System.out.println("we Should disassembles it"));
        }
    }
}

interface Operation {
    void operate(String input);
}

class Workshop {
    private Operation workshop;

    public void startFiltering(String input) {
        workshop.operate(input);
    }

    public void setWorkshop(Operation workshop) {
        this.workshop = workshop;
    }
}