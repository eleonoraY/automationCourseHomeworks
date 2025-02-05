package Lecture13;

public class DemoPerson {
    public static void main(String[] args) {
        Person Dido = new Person(
                "0510278086",
                "male",
                "Dido",
                "Hindo",
                "German",
                "IT",
                "Bulgarian",
                "Bulgaria"
        );
        System.out.println("Print date of birth: " + Dido.getDateOfBirth());
        Dido.sayHello();
        Dido.celebrateEaster();
        Dido.isAdult();
        System.out.println("Can " + Dido.getName() + " take a loan? " + Dido.canTakeLoan());
        System.out.println("------------------------");

        Child child = new Child(
                "9906126875",
                "female",
                "Lily",
                "orthodox",
                "bulgarian",
                "bulgarian",
                "Bulgaria",
                "Ivan Vazov"

        );

        System.out.println(child);
        child.sayHello();
        child.celebrateEaster();
        child.isAdult();
        System.out.println("Can " + child.getName() + " take a loan? " + child.canTakeLoan());
        child.goToSchool();
        System.out.println("------------------------");

        Bulgarian bulgarian = new Bulgarian(
                "6010103445",
                "male",
                "Geogri",
                "catholic",
                "bulgarian",
                "Carpenter",
                "bulgarian",
                "Bulgaria"
        );
        System.out.println(bulgarian);
        bulgarian.celebrateEaster();
        bulgarian.isAdult();
        System.out.println("Can " + bulgarian.getName() + " take a loan? " + bulgarian.canTakeLoan());
        bulgarian.speakBulgarian();
        System.out.println("------------------------");

        American american = new American(
                "1201027888",
                "male",
                "John",
                "orthodox",
                "american",
                "Doctor",
                "american",
                "USA"
        );
        System.out.println(american);
        american.celebrateEaster();
        american.isAdult();
        System.out.println("Can " + american.getName() + " take a loan? " + american.canTakeLoan());
        american.drinkCocaCola();
        System.out.println("------------------------");

        Italian italian = new Italian(
                "8004045667",
                "male",
                "Federico",
                "islam",
                "italian",
                "Chef",
                "italian",
                "Italy"
        );
        System.out.println(italian);
        italian.celebrateEaster();
        italian.isAdult();
        System.out.println("Can " + italian.getName() + " take a loan? " + italian.canTakeLoan());
        italian.makePizza();
        System.out.println("------------------------");




    }
}
