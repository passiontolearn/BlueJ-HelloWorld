public class HelloWorld
{
    private int points      = 0;
    private String objName  = "";

    // TODO:
    //     // *Find* some library that enables using Colours in BlueJ's console  
    //
    //     public static final String ANSI_GREEN = "\u001B[32m";
    
    public static void main(String[] args)
    {    
        if (args.length == 0) {
            System.err.println("The Object name must be specified");
            return;
        }
        
        HelloWorld hello = new HelloWorld(args[0]);
        hello.helloWorld();
        hello.incPoints();
        hello.decPoints();
    }

    HelloWorld(String objN)
    {
        this.objName = objN;
    }

    public String getObjectName(){
        return objName;
    }

    public void helloWorld()
    {
        System.out.println(getObjectName() + ": Hello world my name is Adam");
        System.out.println();
    }

    public void showPoints() 
    {
        System.out.println(getObjectName() + ": " + points + " Points.");
    }

    
    public void incPoints() 
    {
        points++;
        System.out.println(getObjectName() + ": Points after increment: " + points);
    }

    public void decPoints()
    {
        points--;
        System.out.println(getObjectName() + ": Points after decrement: " + points);
    }
}