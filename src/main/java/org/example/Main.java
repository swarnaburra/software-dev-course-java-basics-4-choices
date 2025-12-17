package org.example;


public class Main {
    public static void main(String[] args) {

        CollectionChoicExercises exercises = new CollectionChoiceExercises();

        String[] colors = exercises.MakeColorCollection();
        System.out.prinln("colors are " + colors);

    }

    System.out.println("\n Students: ");
    System.out.println(exercises.MakeColorCollection());

    System.out.println("\n Usernames ");
    System.out.println(exercises.MakeLoggedInUsersCollection());

    System.out.println("\n AccessCode");
    System.out.println(exercises.akeEmployeeAccessCodesCollection());

}
}
