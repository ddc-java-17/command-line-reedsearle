package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
//    System.out.println(args.length);
    System.out.printf("%d\n",args.length);
    for (int i=0; i<args.length; i+=1) {
//      System.out.println(args[i]);
      System.out.printf("%s ",args[i]);
    }
    System.out.printf("\n");
  }

}
