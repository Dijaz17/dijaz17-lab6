public class Rotor {

    
    private String rotorValues;
    private char startChar;
    private 
    char[] rValsArr = rotorValues.toCharArray();
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        if(this.startChar == rValsArr[0]){
            return true;
        }
        return false;
    }
    

    public int indexOf(char c){
        //TODO
        int idx = -1;
        for(int i = 0; i < rValsArr.length; i++){
            if( c == rValsArr[i] ){
                idx = i;
            }
        }
        return idx;
    }

    public char charAt(int idx){
        //TODO
        return rValsArr[idx];
    }
}
    
