package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Greeter {
  private static String greet(String namePassedIn, String courseDatePassedIn) {
    String welcome = "Welcome to SALT, " + namePassedIn;
    LocalDate today = LocalDate.now();
    LocalDate targetDate = LocalDate.parse(courseDatePassedIn);
    int daysBetween = (int) ChronoUnit.DAYS.between(today, targetDate);

    String dateCounter = "Today it is " + daysBetween + " days left until the course starts";

    return welcome + "\n" + dateCounter;
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does that course start? ");

    BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
    String courseDate = reader2.readLine();

    String greeting = greet(name, courseDate);

    System.out.println(greeting);
  }
}
