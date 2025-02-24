public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        String decryptedMessage = "";
        int idx_rotor2;
        int idx_rotor2_2;
        char char_rotor1;
        char decryptedChar;


        for(int i = 0; i < message.length(); i++){
            idx_rotor2 = rotors[2].indexOf(message.charAt(i));
            char_rotor1 = rotors[1].charAt(idx_rotor2);
            
            idx_rotor2_2 = rotors[2].indexOf(char_rotor1);
            decryptedChar = rotors[0].charAt(idx_rotor2_2);

            decryptedMessage += decryptedChar;
            rotate();

        }

        return decryptedMessage;
    }


    
    public String encrypt(String message){
        //TODO
        String encryptedMessage = "";
        int idx_rotor0;
        int idx_rotor1;
        char char_rotor2;
        char encryptedChar;


        for(int i = 0; i < message.length(); i++){
            idx_rotor0 = rotors[0].indexOf(message.charAt(i));
            char_rotor2 = rotors[2].charAt(idx_rotor0);

            idx_rotor1 = rotors[1].indexOf(char_rotor2);
            encryptedChar = rotors[2].charAt(idx_rotor1);


            encryptedMessage += encryptedChar;

            rotate();
        }

        return encryptedMessage;
    }
    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }

    // private void rotateCounter(){
    //     if(rotors[0].rotateCounter()){
    //         if(rotors[1].rotateCounter()){
    //             rotors[2].rotateCounter();
    //         }
    //     }
    // }
    
}
