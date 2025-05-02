
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


    
}
