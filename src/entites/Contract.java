package entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Department department;
    private Worker worker;
    private List<HourContract> contractsList = new ArrayList<>();


    public Contract(Department department, Worker worker) {
        this.department = department;
        this.worker = worker;
    }

    public List<HourContract> getContractsList() {
        return contractsList;
    }

    public String getWorker() {
        return worker.getName();
    }

    public void addContract(HourContract contract) {
        System.out.println(contract.getDate());
        contractsList.add(contract);
    }

    public void removeContract(HourContract contract) {
        contractsList.remove(contract);
    }

    public int contractsLength() {
        return contractsList.size();
    }

    public Double Income(Integer year, Integer month) {
        double income = 0.0;

        for (HourContract c : contractsList) {

            System.out.println(c.getHours());

            LocalDate contractDate = c.getDate();
            int c_year = contractDate.getYear();
            int c_month = contractDate.getMonthValue();

            if (c_year == year && c_month == month) {
                System.out.println("roda");
                income += c.totalValue();
            }
        }
        return income;
    }

}
