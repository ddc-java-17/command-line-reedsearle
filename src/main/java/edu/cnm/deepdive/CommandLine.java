package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
//    System.out.println(args.length);
    System.out.printf("%d\n",args.length);
    for (String arg: args) {
//      System.out.println(args[i]);
      System.out.printf("%s ",arg);
    }
    System.out.printf("\n");
  }

}
