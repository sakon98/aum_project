class Programmer extends Employee { // Programmer(ลูก) สืบทอดจาก Employee(แม่)
    
   /*  public String skill = "Java";

    public Programmer (String name , double salary){
    super(name,salary); // เรียกผ่าน construtor ของตัวแม่
    System.out.println("I am programmer.");
    }
    */
    
    public void skill (){

    System.out.println("no skill");

    }

    public void skill (String skill_programmer){

    System.out.println("skill" + skill_programmer);
        
    }

    public void skill (String ... language){

    for(int i=0 ; i < language.length ; i++){

        System.out.println("skill: " + language[i]);

    }

       
            
        }

        //Overriding

        /*public void bonus(){

            System.out.println("Bonus = 20%");
        }*/

        public void bonus(){
            System.out.println("Bonus = 20%");
        }

}
