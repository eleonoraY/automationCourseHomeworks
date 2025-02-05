package Lecture13;

public class Child extends Person{
    private String schoolName;

    public Child(String EGN, String sex, String name, String religion, String languageSpoken, String nationality, String countryOfresidence, String schoolName){
        super(EGN, sex, name, religion, languageSpoken, nationality, countryOfresidence);
        this.schoolName = schoolName;
    }

    public void goToSchool(){
        System.out.println(getName() + " goes to " + schoolName + " school.");
    }


    @Override
    public void isAdult(){
        switch (getCountryOfresidence().toLowerCase()){
            case "bulgaria":
                printAdult(30);
                break;
            case "italy":
                printAdult(18);
                break;
            case "usa":
                printAdult(21);
                break;
            default:
                System.out.println("We don't know if " + getName() + " is adult in " + getCountryOfresidence());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nSchool: " + schoolName;
    }

}
