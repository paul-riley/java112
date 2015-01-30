package java112.labs1;

public class LabThree {

    public void run(String x){
        System.out.println("input: " + x);

    }

    public static void main (String[] args){

        if (args.length == 1){

          LabThree y = new LabThree();
          y.run(args[0]);

        } else {

           System.out.println("Please enter one argument on the command line");

        }
    }

}
