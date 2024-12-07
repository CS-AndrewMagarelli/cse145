//Andrew Magarelli
package Homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Homework4 {

    private static final double PI = 3.14;
    private List<Double> circleAreas;

    public Homework4() {
        circleAreas = new ArrayList<>();
    }

    public void enterCircles(int size) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            try {
                double radius = scanner.nextDouble();
                circleAreas.add(calculateArea(radius));
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                i--; // Retry the same index
            }
        }
    }

    private double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Display total # of circles and their radii");
        System.out.println("2. Sort and display areas from smallest to largest");
        System.out.println("3. Sort and display areas from largest to smallest");
        System.out.println("4. Find and display unique areas");
        System.out.println("5. Quit");
    }

    public void displayCircles() {
        System.out.println("Total circles: " + circleAreas.size());
        for (int i = 0; i < circleAreas.size(); i++) {
            System.out.println("Circle " + (i + 1) + " Area: " + circleAreas.get(i));
        }
    }

    public void sortAndDisplayAreas(boolean ascending) {
        if (circleAreas.isEmpty()) {
            System.out.println("Cannot sort an empty collection.");
            return;
        }
        
        List<Double> sortedAreas = new ArrayList<>(circleAreas);
        Collections.sort(sortedAreas);
        if (!ascending) {
            Collections.reverse(sortedAreas);
        }

        System.out.println("Sorted areas (" + (ascending ? "smallest to largest" : "largest to smallest") + "):");
        for (double area : sortedAreas) {
            System.out.println(area);
        }
    }

    public void displayUniqueAreas() {
        HashSet<Double> uniqueAreas = new HashSet<>(circleAreas);
        List<Double> duplicates = new ArrayList<>();

        for (Double area : circleAreas) {
            if (Collections.frequency(circleAreas, area) > 1) {
                duplicates.add(area);
            }
        }

        uniqueAreas.removeAll(duplicates);
        System.out.println("Unique areas:");
        for (double area : uniqueAreas) {
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homework4 manager = new Homework4();
        
        int size;
        while (true) {
            System.out.print("Enter the number of circles to store (must be positive): ");
            size = scanner.nextInt();
            if (size > 0) {
                break;
            } else {
                System.out.println("Invalid size. Please enter a positive integer.");
            }
        }

        manager.enterCircles(size);

        int choice;
        do {
            manager.displayMenu();
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayCircles();
                    break;
                case 2:
                    manager.sortAndDisplayAreas(true);
                    break;
                case 3:
                    manager.sortAndDisplayAreas(false);
                    break;
                case 4:
                    manager.displayUniqueAreas();
                    break;
                case 5:
                    System.out.println("Exiting the program."); 
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
