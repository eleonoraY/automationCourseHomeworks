package Lecture13;

public class Bulgarian extends Person{
    public Bulgarian(String EGN, String sex, String name, String religion, String languageSpoken, String job, String nationality, String countryOfresidence){
        super(EGN, sex, name, religion, languageSpoken, job, nationality, countryOfresidence);

    }

    @Override
    public String toString() {
        return super.toString() + "\nNationality: Bulgarian";
    }

    public void speakBulgarian(){
        System.out.println(getNationality() + " speaks bulgarian.");
    }
}
