package cmpt276.asgn2.models;

public class Users {
    private String name;
    private int id;

    public Users(){
    }

    public Users(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }//getter
    public void setName(String name){
        this.name = name;
    }//setter

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
