package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    
    public DNASequencer(){
        logger.info("DNASequencer construido correctamente.");
	}

    public String calculate(List<String> parts) throws MaxNumberOfSubsequencesException, SubSequenceLengthException {
        StringBuilder dnaSequence = new StringBuilder();
        dnaSequence.append(parts.get(0));
        int totalOfSubsequences = parts.size();
        int currentNumberOfSubsequence = 1;

        if(parts.size() > 160000){
            throw new MaxNumberOfSubsequencesException("Mas de 160K subsecuencias");
        }
        for(int i = 0; i <parts.size(); i++){
            if(parts.get(i).length() > 200){
                throw new SubSequenceLengthException("Mas de 200 caracteres");
            }
        }
        while(currentNumberOfSubsequence < totalOfSubsequences){
            String currentSubsequence = parts.get(currentNumberOfSubsequence);
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
}
