package C2.t2t3;


public class EmpolyeeParameter {
    public void printEmployee(Employee worker){
        StringBuilder info = new StringBuilder();
        info = info.append(worker.getName());
        info = info.append(worker.getSalary());
        System.out.println(info);
    }
    public void setWorkerSalary(Employee worker, double fixedSalary){

        System.out.println("old salary:" + worker.getSalary());
        worker.setSalary(fixedSalary);
        System.out.println("new salary:" + worker.getSalary());

    }
    
}
