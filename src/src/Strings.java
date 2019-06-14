public class Strings {
    public static void main(String[] args){

        //String test = "";
        StringBuilder test2 = new StringBuilder();

        long startTime = System.nanoTime();
        for(int i = 0; i<500000; i++){
            System.out.println("Current place: " + i);
            //test = test + i;
            test2.append(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time passed: " + (endTime-startTime)/100000000 + " seconds");
    }
}
