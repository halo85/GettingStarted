package lt.Test;

import java.util.Scanner;

public class SpaceBoxing {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int earthWeight, planet;
    double planetWeight = 0.0;
    System.out.print("Iveskite jusu svori zemeje: ");
    System.out.println();
    System.out.print("> ");
    earthWeight = keyboard.nextInt();
    System.out.println();
    System.out.println("Informacija apie planetas:");
    System.out.println();
    System.out.println("   1.  Merkurijus    2.  Venera      3.  Marsas");
    System.out.println("   4.  Jupiteris     5.  Saturnas    6.  Uranas");
    System.out.println("   7.  Neptunas      8.  Plutonas    9.  Saule");
    System.out.println("   10. Menulis       11. Europa      12. Ganimedas");
    System.out.println();
    System.out.print("Kuria planeta lankysite? ");
    System.out.println();
    System.out.print("> ");
    planet = keyboard.nextInt();
    System.out.println();
    if (planet == 1) {
      planetWeight = (earthWeight / 9.81) * 3.7;
    } else if (planet == 2) {
      planetWeight = (earthWeight / 9.81) * 8.87;
    } else if (planet == 3) {
      planetWeight = (earthWeight / 9.81) * 3.711;
    } else if (planet == 4) {
      planetWeight = (earthWeight / 9.81) * 24.79;
    } else if (planet == 5) {
      planetWeight = (earthWeight / 9.81) * 10.44;
    } else if (planet == 6) {
      planetWeight = (earthWeight / 9.81) * 8.69;
    } else if (planet == 7) {
      planetWeight = (earthWeight / 9.81) * 11.15;
    } else if (planet == 8) {
      planetWeight = (earthWeight / 9.81) * 0.68;
    } else if (planet == 9) {
      planetWeight = (earthWeight / 9.81) * 274;
    } else if (planet == 10) {
      planetWeight = (earthWeight / 9.81) * 1.62;
    } else if (planet == 11) {
      planetWeight = (earthWeight / 9.81) * 1.315;
    } else if (planet == 12) {
      planetWeight = (earthWeight / 9.81) * 1.428;
    } else {
      System.out.println("Nera tokios planetos.");
      System.exit(0);
    }
    System.out.println("Jusu svoris bus " + planetWeight + " kilogramu sioje planetoje.");
  }
}