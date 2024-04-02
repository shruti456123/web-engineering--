package org.example;
import javax.xml.stream.Location;
import java.util.Scanner;
import java.util.ArrayList;

public class GeneralUser {
    static Scanner scan = new Scanner(System.in);

    public static void normal(String username) {


        System.out.println("==============================================================================");
        System.out.println("Choose an number");
        System.out.println("1: View location");
        System.out.println("2: Enter you location and know climatic condition of your place");
        System.out.println("3: News on Climate change ");
        System.out.println("4: Play Quiz");
        System.out.println("5: Logout");
        System.out.println("6: Exit");
        int num = scan.nextInt();
        scan.nextLine();

        if (num == 1) {
            for (String location : Admin.locations) {
                System.out.println(location);
            }
            {
                if (Admin.locations.isEmpty()) {
                    System.out.println("No location is added");
                }
                normal("");

            }

        } else if (num == 2) {
            System.out.println("Enter your location");
            String location = scan.next();

            if (Admin.locations.contains(location)) {
                System.out.println("Climatic condition of " + Admin.locations + "respectively: " + Admin.climate);
                System.out.println("Risks due to climatic condition of " + Admin.locations + "respectively: " + Admin.Risks);
                System.out.println("Preventive measure of risks due to climate of  " + Admin.locations + "respectively: " + Admin.Pmeasures);

            } else {
                System.out.println("Location not found");
            }
            normal("");

        }
        else if (num == 3) {
            Admin.news();
            normal("");
        }
        else if (num == 4) {
            int score = 0;

            System.out.println("Welcome to the Climate Change Quiz!\n");

            // Question 1
            System.out.println("Question 1: What is the primary greenhouse gas responsible for global warming?");
            System.out.println("a) Carbon Dioxide");
            System.out.println("b) Oxygen");
            System.out.println("c) Nitrogen");
            System.out.println("d) Hydrogen");
            System.out.print("Your answer: ");
            String answer1 = scan.nextLine();
            if (answer1.equalsIgnoreCase("a")) {
                System.out.println("Correct! 🌍👏 Carbon Dioxide is the primary greenhouse gas.");
                score++;
            } else {
                System.out.println("Sorry, that's incorrect. 😔 The correct answer is: Carbon Dioxide");
                System.out.println("Don't worry, keep going! 💪");
            }
            System.out.println();

            // Question 2
            System.out.println("Question 2: What is the main cause of climate change?");
            System.out.println("a) Volcanic eruptions");
            System.out.println("b) Solar radiation");
            System.out.println("c) Human activities");
            System.out.println("d) Plate tectonics");
            System.out.print("Your answer: ");
            String answer2 = scan.nextLine();
            if (answer2.equalsIgnoreCase("c")) {
                System.out.println("Awesome! 🎉 Human activities, such as burning fossil fuels, are the main cause of climate change.");
                score++;
            } else {
                System.out.println("Oops! That's not correct. 😞 The correct answer is: Human activities");
                System.out.println("Don't give up! You're doing great! 💪");
            }
            System.out.println();

            // Question 3
            System.out.println("Question 3: Which of the following is a consequence of climate change?");
            System.out.println("a) Decreased biodiversity");
            System.out.println("b) Increased crop yields");
            System.out.println("c) Reduced frequency of extreme weather events");
            System.out.println("d) Expansion of polar ice caps");
            System.out.print("Your answer: ");
            String answer3 = scan.nextLine();
            if (answer3.equalsIgnoreCase("a")) {
                System.out.println("Fantastic! 🎉 Climate change can lead to decreased biodiversity.");
                score++;
            } else {
                System.out.println("Incorrect. 😔 The correct answer is: Decreased biodiversity");
                System.out.println("Keep trying! Every answer gets you closer to understanding. 💪");
            }
            System.out.println();

            // Display final score
            System.out.println("Quiz completed! Your score is: " + score + "/3");
            normal("");
        }

        else if (num == 5) {
            Login.userLogin();
        }



        else if (num == 6) {
            System.out.println("Thank you for participating and learning about climate change.");
            System.out.println("Remember, every action counts in protecting our planet!");

            System.out.println("Stay cool and keep the planet greener! Catch you later" +
                    ", eco-warrior. Don't forget to stay updated for more climate tips!");
            System.out.println("Ba-bye for now!🌱✨");
            System.exit(0);
        }
    }


}







