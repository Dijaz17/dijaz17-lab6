public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate()){
            rotateRotor();
        }
            
    }
    
    public boolean rotate(){
        //TODO
        char[] rValsArr = rotorValues.toCharArray();
        if(this.startChar == rValsArr[0]){
            return true;
        }
        return false;
    }
    

    public int indexOf(char c){
        //TODO
        int idx = -1;
        char[] rValsArr = rotorValues.toCharArray();

        for(int i = 0; i < rValsArr.length; i++){
            if( c == rValsArr[i] ){
                idx = i;
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
        rotatedString += rValsArr[26];
        for(int i = 1; i < rValsArr.length-1; i++){
            rotatedString += rValsArr[i];
        }

        rotorValues = rotatedString;
    }
}
    
