package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.logging.Logger;

@Test
public class DNASequencerTest {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());

    @Test
    public void testCase0() throws Exception {
        generic(0);
    }
    @Test (expectedExceptions = MaxNumberOfSubsequencesException.class)
    public void testCase1() throws Exception {
        generic(1);
    }
    @Test (expectedExceptions = SubSequenceLengthException.class)
    public void testCase2() throws Exception {
        List<String> input = readInput(2);
        DNASequencer sequencer = new DNASequencer();
        String response = sequencer.calculate(input);
    }
    @Test(invocationCount = 50, threadPoolSize = 50)
    public void testCase3() throws Exception {
        long begginTime = System.currentTimeMillis();
        long maxExecutionTime = 100;
        generic(0);
        long finalTime = System.currentTimeMillis();
        long executionTime = finalTime - begginTime;
        Assert.assertTrue(executionTime < maxExecutionTime);
    }

    private void generic(int i) throws Exception {
        List<String> input = readInput(i);
        String output = readOutput(i);
        DNASequencer sequencer = new DNASequencer();
        String response = sequencer.calculate(input);
        Assert.assertEquals(response, output);
    }

    private List<String> readInput(int testNumber){
        List<String> lines = readFile(testNumber, "input");
        return lines;
    }

    private String readOutput(int testNumber){
        List<String> lines = readFile(testNumber, "output");
        return lines.get(0);
    }

    public List<String> readFile(int testNumber, String type){
        String fileName = "test_case<testNumber>_<type>";
        fileName = fileName.replace("<testNumber>", Integer.toString(testNumber));
        fileName = fileName.replace("<type>", type);
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        Scanner scan = new Scanner(is);
        List<String> lines = new ArrayList<String>();
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            lines.add(line);
        }
        return lines;
    }
}