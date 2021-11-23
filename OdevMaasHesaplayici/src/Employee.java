public class Employee {
    String name;
    int salary;
    int workHouse;
    int  hireYear;

    public Employee(String name,int salary,int workHouse,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHouse=workHouse;
        this.hireYear=hireYear;
    }

    public void tax(){
        double vergi=0;
        if (this.salary > 1000){
            vergi= (this.salary * (0.03));
        }
        this.salary -=vergi;
        System.out.print(vergi);
    }

    public void bonus(){
        int bonus = 30;
        if (this.workHouse > 40){
            bonus *= (this.workHouse - 40);
        }
        this.salary +=bonus;
        System.out.print(bonus);
    }

    public void raiseSalary(){
        int yil = 2021;
        int total = (yil - this.hireYear);
        if (total < 10){
            this.salary += (this.salary *(0.5));
            System.out.print(this.salary *(0.5));
        }
        else if (total > 9 && total <20){
            this.salary += (this.salary *(0.10));
            System.out.print(this.salary *(0.10));
        }
        else {
            this.salary += (this.salary * (0.15));
            System.out.print(this.salary * (0.15));
        }
    }

     public void toStringgg(){
         System.out.println("Adı : "+this.name + "\nMaaşı : " +
                this.salary + "\nÇalışma Saati : " +
                this.workHouse + "\nBaşlangıç Yılı : " + this.hireYear );
         System.out.print("Vergi : ");
         tax();
         System.out.print("\nBonus : ");
         bonus();
         System.out.print("\nMaaş Artışı : ");
         raiseSalary();
         System.out.println("\nToplam Maaş : " + this.salary);

    }
}
