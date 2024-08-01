public class Person {
    private int id;
    private String name;
    private String address;
    private String occupation;

    public Person(int id, String name, String address, String occupation){
        this.id = id;
        this.name = name;
        this.address = address;
        this.occupation = occupation;
    }

    public int getId(){ return id; }

    @Override
    public String toString(){
        return id + "," + name + "," + address + "," + occupation;
    }
}