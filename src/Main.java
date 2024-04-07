import entites.Contract;
import entites.Department;
import entites.HourContract;
import entites.Worker;
import enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String workerName;
        WorkerLevel workerLevel;
        double workerSalary;

        Scanner sc = new Scanner(System.in);

        //NAME INFO
        System.out.println("Enter worker data:");
        System.out.println("Name:");
        workerName = sc.next();

        //LEVEL INFO
        System.out.println("Level:");
        String levelScan = sc.next();
        workerLevel = WorkerLevel.valueOf(levelScan);

        //SALARY INFO
        System.out.println("Salary:");
        workerSalary = sc.nextDouble();

        //CONTRACTS INFO
        System.out.println("How many contracts to this worker?");
        int contractsQuantity = sc.nextInt();

        //Class Instance
        Worker worker = new Worker(workerName, workerLevel, workerSalary);
        Department department = new Department("Design");
        Contract contracts = new Contract(department, worker);

        for (int i = 0; contractsQuantity > i; i++) {
            System.out.printf("Enter contract %d data %n", i + 1);
            System.out.println("Date (DD/MM/YYYY):");
            String dateScan = sc.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dateScan, formatter);

            System.out.println("Value per hour");
            int hour = sc.nextInt();

            System.out.println("Duration(hours)");
            double duration = sc.nextDouble();

            HourContract contract = new HourContract(localDate, duration, hour);
            contracts.addContract(contract);

            System.out.println(contracts.getContractsList().getFirst().getDate());
        }

        //INCOME INFO

        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String hourSelected = sc.next();

        int YearSelected;
        int DaySelected;

        String[] items = hourSelected.split("/");

        DaySelected = Integer.parseInt(items[0]);
        YearSelected = Integer.parseInt(items[1]);


        double incomeTotal = contracts.Income(YearSelected, DaySelected);

        System.out.printf("Name %s %n", contracts.getWorker());
        System.out.printf("Department %s %n", department.getName());
        System.out.printf("Income for %s %n", incomeTotal);

        System.out.printf("total de contratos: %d", contracts.contractsLength());
    }
}