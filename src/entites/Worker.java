package entites;

import enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel workerLevel;
    private double baseSalary;

    public Worker(String name, WorkerLevel workerLevel, double baseSalary) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }


}
