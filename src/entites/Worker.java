package entites;

import enums.WorkerLevel;

public class Worker {
    private String name;
    private final WorkerLevel workerLevel;
    private final double baseSalary;

    public Worker(String name, WorkerLevel workerLevel, double baseSalary) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
