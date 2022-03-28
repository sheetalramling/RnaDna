public class RnaDna {

    StringBuffer rnaSequence = new StringBuffer();

    public String transScribe(String sequence) {



        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == 'C')
                rnaSequence.append("G");
            else if (sequence.charAt(i) == 'G')
                rnaSequence.append("C");
            else if (sequence.charAt(i) == 'T')
                rnaSequence.append("A");
            else if (sequence.charAt(i) == 'A')
                rnaSequence.append("U");
        }

        return rnaSequence.toString();
    }
}
