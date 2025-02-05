package Lecture13;

public class American extends Person{
    public American(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence){
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);

    }

    @Override
    public String toString() {
        return super.toString() + "\nNationality: American";
    }

    public void drinkCocaCola(){
        System.out.println(getNationality() + " love drinking Coca Cola.");
    }
}
