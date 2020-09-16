package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    
    public String DNASequencer(List<String> subsequences) {
        StringBuilder LCB = new StringBuilder();
        LCB.append(subsequences.get(0));
        int totalOfSubsequences = subsequences.size();
        int currentNumberOfSubsequence = 1;

        if(totalOfSubsequences == 1){
            return LCB.toString();
        }

        while(currentNumberOfSubsequence < totalOfSubsequences){
            String currentSubsequence = subsequences.get(currentNumberOfSubsequence);
            StringBuilder subsequenceChars = new StringBuilder();
            int currentSubsequenceSize = currentSubsequence.length();
            for(int j=0; j < currentSubsequenceSize; j++){
                char e = currentSubsequence.charAt(j);
                String eToString = Character.toString(e);
                subsequenceChars.append(eToString);

                if(!(LCB.toString()).contains(subsequenceChars)){
                    LCB.append(eToString);
                }
            }
            currentNumberOfSubsequence++;
        }
        return LCB.toString();
	}

    public String calculate(List<String> part){
        String LCB = DNASequencer(part);
        return LCB;
    }
}
