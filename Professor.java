public class Professor extends Teacher {
    private String specialty, research_area ,rank;
    private boolean tenured;

    public Professor(){
        super();
        this.specialty = "";
        this.research_area = "";
        this.rank = "";
        this.tenured = false;
    }
    
    public Professor(String spec, String research, String rank, boolean tenured,
    String ID, int sal, int num,String name, boolean alive, int age, String ssn){
        super(ID, sal, num, name, alive, age, ssn);
        this.specialty = spec;
        this.research_area = research;
        this.rank = rank;
        this.tenured = tenured;
    }
    //toString
    public String toString(){
        String output = super.toString();
        output += "Professor Info:\n\n" + "Professor Specialty: " + getSpec() +
        "\nProfessor Research Area: " + getResearch() +
        "\nProfessor Rank: " + getRank() + 
        "\nProfessor Tenured: " + getTenured();
        return output;
    }
    //copyCon
    public Professor(Professor a){
        super(a.getID(), a.getSal(), a.getYrWorked(),
        a.getName(), a.getAlive(), a.getAge(), a.getSsn());

        this.specialty = a.specialty;
        this.research_area = a.research_area;
        this.rank = a.rank;
        this.tenured = a.tenured;
    }
    //setget
    public String getSpec(){
        return this.specialty;
    }
    public String getResearch(){
        return this.research_area;
    }
    public String getRank(){
        return this.rank;
    }
    public boolean getTenured(){
        return this.tenured;
    }
    public void setSpec(String a){
        this.specialty = a;
    }
    public void setResearch(String a){
        this.research_area = a;
    }
    public void setRank(String a){
        this.rank = a;
    }
    public void setTenured(boolean a){
        this.tenured = a;
    }
    
}
