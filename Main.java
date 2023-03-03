import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of baby food you want to make (in grams): ");
        double amount = scanner.nextDouble();
        System.out.println("Select a preservative(enter the number):\n1. Ascorbic acid\n2. Sodium benzoate\n3. Potassium sorbate");
        int preservativeOption = scanner.nextInt();
        double preservativeAmount = 0.0;
        switch (preservativeOption) {
            case 1:
                // Ascorbic acid: 1% of the weight of the baby food
                preservativeAmount = amount * 4.5;
                break;
            case 2:
                // Sodium benzoate: 0.1% of the weight of the baby food
                preservativeAmount = amount * 5.5;
                break;
            case 3:
                // Potassium sorbate: 0.2% of the weight of the baby food
                preservativeAmount = amount * 4.0;
                break;
            default:
                System.out.println("Invalid preservative option");
                break;
        }
        if (preservativeAmount > 0.0) {
            System.out.printf("You need %.2f grams of preservative.\n", preservativeAmount);
        }
        scanner.close();
    }
}

