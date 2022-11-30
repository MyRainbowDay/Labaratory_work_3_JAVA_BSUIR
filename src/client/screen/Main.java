package client.screen;

import client.logic.entity.Role;
import client.logic.entity.Student;

import java.util.Scanner;

public class Main {
    private static final Presenter presenter = new Presenter();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter of operation: ");
        switch (in.nextInt()) {
            case 1:
                presenter.connect("aleksey", "999");
                break;
            case 2:
                presenter.create(new Student("Aleksey", "Borisevich", "Valerievich", "23/11/2001", 051004, 103, Role.USER));
                break;
            case 3:
                presenter.read(1445);
                break;
            case 4:
                presenter.create(new Student("Aleksey", "Borisevich", "Valerievich", "23/11/2001", 051004, 103, Role.USER));
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
