import com.mysql.cj.x.protobuf.MysqlxCrud.ViewAlgorithm;

abstract class Employee {
    
// Attribute

private String id;
private String name;
private double salary;

static int minsalary = 1200;

// Default construtor
public Employee(){

    System.out.println("I am employee.");

}

public Employee(String name , double salary){

    this.name = name;
    this.salary = salary;
    disPlayEmployee();
}

public void setID(String id){

this.id = id;

}

public void setName(String name){
    
this.name = name;

}

public void setSalary(Double salary){
    
    this.salary = salary;
    
}


public String getName(){

     return this.name;

}

public double getSalary(){

     return this.salary;

}

/*public void bonus(){

System.out.println("Bonus = 10%");

}*/

public abstract void bonus();

public void disPlayEmployee(){

    //System.out.println("id: " + this.id);
    System.out.println("name: " + this.name);
    System.out.println("salary: " + this.salary);
}

}
