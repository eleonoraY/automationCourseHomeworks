package Lecture13;

public class Italian extends Person{
    public Italian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence){
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);

    }

    @Override
    public String toString() {
        return super.toString() + "\nNationality: Italian";
    }

    public void makePizza(){
        System.out.println(getNationality() + " make pizza.");
    }
}
