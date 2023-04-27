public class Employee {
    private String name;
    private String birth;
    private double salary;
    public String getDetail()
    {
        return "姓名:" + name + " 生日:" + birth + " 工资:" + salary;
    }
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Officer o1 = new Officer();
        o1.vehicleAllowance();
    }
}
class Officer extends Employee{
    private String department;
    public void vehicleAllowance()
    {
        System.out.println("我的交通补助为100元/月");
    }
}
class Worker extends Employee{
    public void dressAllowance()
    {
        System.out.println("我的餐饮补助为200元/月");
    }
}