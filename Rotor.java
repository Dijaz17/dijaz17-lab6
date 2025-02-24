public class Rotor {

    
    public String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        char[] rValsArr = rotorValues.toCharArray();

        rotateRotor();

        if(this.startChar == rValsArr[0]){
            return true;
        }
        return false;
    }

    // public boolean rotateCounter() {
    //     char[] rValsArr = rotorValues.toCharArray();

    //     rotateRotorCounter();

    //     if(this.startChar == rValsArr[0]){
    //         return true;
    //     }
    //     return false;
    // }
    

    public int indexOf(char c){
        //TODO
        int idx = -1;
        char[] rValsArr = rotorValues.toCharArray();

        for(int i = 0; i < rValsArr.length; i++){

            if( c == rValsArr[i] ){
                return i;
            }
        }

        return idx;
    }

    public char charAt(int idx){
        //TODO
        char[] rValsArr = rotorValues.toCharArray();
        return rValsArr[idx];
    }

    public void rotateRotor(){
        char[] rValsArr = rotorValues.toCharArray();
        String rotatedString = "";
        rotatedString += rValsArr[rotorValues.length()-1];
        for(int i = 0; i < rValsArr.length-1; i++){
            rotatedString += rValsArr[i];
        }

        this.rotorValues = rotatedString;
    }

    // public void rotateRotorCounter(){
    //     char[] rValsArr = rotorValues.toCharArray();
    //     String counterRotatedString = "";
    //     for(int i = 1; i < rValsArr.length; i++){
    //         counterRotatedString += rValsArr[i];
    //     }
    //     counterRotatedString += rValsArr[0];

    //     this.rotorValues = counterRotatedString;
    // }
}
    
