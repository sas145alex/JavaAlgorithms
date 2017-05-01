package GreedyKnapsack;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


// рюкзак непрерывный (можно отрезать часть предметов)
public class GreedyKnapsack {

  class Item implements Comparable<Item> {
    int cost;
    int weight;

    private Item(int cost, int weight) {
      this.cost = cost;
      this.weight = weight;
    }

    @Override
    public String toString() {
      return "Item{" +
              "cost=" + cost +
              ", weight=" + weight +
              '}';
    }

    @Override
    public int compareTo(GreedyKnapsack.Item o) {
      long r1 = (long) cost * o.weight;
      long r2 = (long) o.cost * weight;

      return - Long.compare(r1, r2);
    }
  }

  private void run() throws FileNotFoundException {
    Scanner input = new Scanner(new File("src\\GreedyKnapsack\\input.txt"));
    int n = input.nextInt();
    int W = input.nextInt();
    Item[] items = new Item[n];
    for (int i = 0; i < n; i++) {
      items[i] = new Item(input.nextInt(), input.nextInt());
    }

    for (int i = 0; i< n; i++) {
      System.out.println(items[i]);
    }

    System.out.println("");
    Arrays.sort(items);
    double res = 0;
    for (Item item : items) {
      if (item.weight <= W) {
        res += item.cost;
        W -= item.weight;
      } else {
        res += (double)item.cost * W / item.weight;
        break;
      }
    }
    System.out.println(res);
  }

  public static void main(String[] args) throws FileNotFoundException {
    long startTime = System.currentTimeMillis();
    new GreedyKnapsack().run();
    long finishTime = System.currentTimeMillis();
    System.out.println(finishTime - startTime + "ms");
  }
}
