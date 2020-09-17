package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    
    public String dnaSequenceCalculator(List<String> subsequences) {
        StringBuilder dnaSequence = new StringBuilder();
        dnaSequence.append(subsequences.get(0));
        int totalOfSubsequences = subsequences.size();
        int currentNumberOfSubsequence = 1;

        if(totalOfSubsequences == 1){
            return dnaSequence.toString();
        }

        while(currentNumberOfSubsequence < totalOfSubsequences){
            String currentSubsequence = subsequences.get(currentNumberOfSubsequence);
            StringBuilder subsequenceChars = new StringBuilder();
            int currentSubsequenceSize = currentSubsequence.length();
            for(int j=0; j < currentSubsequenceSize; j++){
                char e = currentSubsequence.charAt(j);
                String eToString = Character.toString(e);
                subsequenceChars.append(eToString);

                if(!(dnaSequence.toString()).contains(subsequenceChars)){
                    dnaSequence.append(eToString);
                }
            }
            currentNumberOfSubsequence++;
        }
        return dnaSequence.toString();
	}

    public String calculate(List<String> part){
        return dnaSequenceCalculator(part);
    }
}
