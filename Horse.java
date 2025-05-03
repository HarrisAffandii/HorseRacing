
/**
 * Write a description of class Horse here.
 * 
 * @author Harris Ilhan Bin Ahmad Affandi
 * @version 1.0
 */
public class Horse
{
    //Fields of class Horse
    final String name;
    private char symbol;
    private int distanceTravelled;
    private boolean hasFallen;
    private double confidence;


      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.symbol = horseSymbol;
        this.name = horseName;
        this.confidence = horseConfidence;
    
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        hasFallen = true;

    }
    
    public double getConfidence()
    {
        return confidence;
    }
    
    public int getDistanceTravelled()
    {
        return distanceTravelled;
    }
    
    public String getName()
    {
        return name;
    }
    
    public char getSymbol()
    {
        return symbol;
    }
    
    public void goBackToStart()
    {
        distanceTravelled = 0;
    }
    
    public boolean hasFallen()
    {
        return hasFallen;
    }

    public void moveForward()
    {
        distanceTravelled++;
    }

    public void setConfidence(double newConfidence)
    {
        //if statement incase the new confidence is higher/lower than the max/min
        if(newConfidence < 0.1){
            this.confidence = 0.1;
        }
        else if(newConfidence > 0.9){
            this.confidence = 0.9;
        }
        else{
            this.confidence = newConfidence;
        }
    }
    
    public void setSymbol(char newSymbol)
    {
        this.symbol = newSymbol;
    }

    //testing
    public static void main(String[] args) {

        //horse 1
        Horse horse1 = new Horse('A', "Harris", -1);
        System.out.println("Horse 1 Synbol: " + horse1.getSymbol());
        System.out.println("Horse 1 name: " + horse1.getName());
        System.out.println("Horse 1 confidence: "+horse1.getConfidence());
        System.out.println("Horse 1 distance travelled: "+horse1.getDistanceTravelled());
        horse1.moveForward();
        System.out.println("Horse 1 new distance travelled: " +horse1.getDistanceTravelled());
        System.out.println("Horse 1 fallen status: " + horse1.hasFallen());

        //horse 2
        Horse horse2 = new Horse('B', "Affandi", 1.2);
        System.out.println("Horse 2 Synbol: " +horse2.getSymbol());
        System.out.println("Horse 2 name: " +horse2.getName());
        System.out.println("Horse 2 confidence: "+horse2.getConfidence());
        System.out.println("Horse 2 distance travelled: "+horse2.getDistanceTravelled());
        horse2.moveForward();
        System.out.println("Horse 2 new distance travelled: " +horse2.getDistanceTravelled());
        System.out.println("Horse 2 fallen status: " + horse2.hasFallen());
        horse2.fall();
        System.out.println("Horse 2 fallen status: " + horse2.hasFallen());

        //check if confidence can exceed the bounds
        horse2.setConfidence(1.5);
        System.out.println("Horse 2 new confidence: " + horse2.getConfidence()); //should return 0.9
        horse2.setConfidence(-0.5);
        System.out.println("Horse 2 new confidence: " + horse2.getConfidence()); //should return 0.1
    }


    
}
