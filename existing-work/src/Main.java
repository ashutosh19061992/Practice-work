/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData() {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	
    	ArrayList<String> p = new ArrayList<String>();
        p.add("22, R.P, Aundh, 1603");
        p.add("23, S.K, Warje, 803");
        p.add("27, V.C, Aundh, 809");
        p.add("29, V.M, Aundh, 617");
        p.add("32, A.P, Baner, 315");
        p.add("34, S.B, Baner, 352");
    	int studentIdIndex = 0;
        int locationIndex = 2;
        int voteIndex = 3;
        Map<String,Integer> retVal = new HashMap<String,Integer>();// { location, studentId }
        Map<String,Integer> retValTemp = new HashMap<String,Integer>();// { location, votes }

        for(int i = 0; i< p.size(); i++) {
            List<String> eachRow = Arrays.asList(p.get(i).split(","));
            
            int incomingVotes = Integer.parseInt(eachRow.get(voteIndex).trim());
            String location = eachRow.get(locationIndex).trim();
            int studentId = Integer.parseInt(eachRow.get(studentIdIndex).trim());
            
            if(retVal.containsKey(location)) {
            	int alreadyAllocatedVotes = retValTemp.get(location);
            	if(incomingVotes > alreadyAllocatedVotes) {
            		retVal.put(location, studentId);
            	} else {
            		retVal.put(location, studentId);
            		retValTemp.put(location, incomingVotes);
            	}
            }
        }
        System.out.println(retVal);
       return retVal;
    }

    public static void main (String[] args) {
    	 System.out.println(processData());
    }
}
