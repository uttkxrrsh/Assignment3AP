import java.util.Random;

public final class Dice {
    private final int numFaces;
    private int faceValue;

    public Dice (int _numFaces){
        numFaces = _numFaces;
        roll();
    }

    public void roll(){
        Random rand = new Random();
        int curr_faceValue = 1 + rand.nextInt(numFaces);
        setFaceValue (curr_faceValue);
    }

    private void setFaceValue (int value){
        if (value <= numFaces){
            faceValue = value;
        }
    }

    public int getFaceValue(){
        return faceValue;
    }

    public int getNumFaces(){
        return numFaces;
    }

    public String toString(){
        return ("number of Faces " + numFaces + "current face value " + faceValue);
    }
}