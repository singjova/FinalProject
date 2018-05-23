package uno;

import java.util.List;

/**
 * Printer
 */
public class Printer {

  public static void printCard(Card c) {

  }

  public static void printCardsSet(List<Card> cards) {
    printMultiple("+--------+ ", cards.size());
    System.out.println("");
    for (Card c : cards) { printSpecialRow("Top", c.getNumberS()); }
    System.out.println("");
    printMultiple("|        | ", cards.size());
    System.out.println("");
    for (Card c : cards) { printSpecialRow("Middle", c.getColor()); }
    System.out.println("");
    printMultiple("|        | ", cards.size());
    System.out.println("");
    for (Card c : cards) { printSpecialRow("Bottom", c.getNumberS()); }
    System.out.println("");
    printMultiple("+--------+ ", cards.size());
    System.out.println("");

  }
  
  private static void printMultiple(String toPrint, int n) {
    if (n > 0) {
      System.out.print(toPrint);
      printMultiple(toPrint, n - 1);
    }
  }

  private static void printSpecialRow(String kind, String text) {
    switch (kind) {
      case "Top":
        System.out.print("| " + text + "      | ");
        break;
      case "Middle":
        System.out.print("| " + text);
        printMultiple(" ", 7 - text.length());
        System.out.print("| ");
        break;
      case "Bottom":
        System.out.print("|      " + text + " | ");
        break;
      default:
        break;
    }
  }

}