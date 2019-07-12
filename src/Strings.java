public class Strings {
  public static void main(String[] args){

  String s = "";
  long startTime = System.nanoTime();

  for(int i = 0; i<200000; i++)
  {
    System.out.println("Current place: " + i);
    s = s + i;
  }

  long endTime = System.nanoTime();
  System.out.println("Time passed: " + (endTime-startTime)/100000000 + " seconds");

  }
}