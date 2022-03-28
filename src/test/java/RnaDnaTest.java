import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RnaDnaTest {

    @Test
    void isSequenceEmptyString() {
        RnaDna rnadna = new RnaDna();

        String emptySequence = rnadna.transScribe("");

        assertThat(emptySequence, Matchers.isEmptyString());
    }

    @Test
    void rnaTranscriptionOfCisG() {
        RnaDna rnaDna = new RnaDna();


        String dna = rnaDna.transScribe("C");

        assertThat(dna, is(equalTo("G")));
    }

    @Test
    void rnaTranscriptionGisC() {
        RnaDna rnaDna = new RnaDna();

        String rnaSequenceC = rnaDna.transScribe("G");

        assertThat(rnaSequenceC, is(equalTo("C")));
    }

    @Test
    void rnaTranscriptionTisA() {
        RnaDna rnaDna = new RnaDna();

        String rnaSequenceT = rnaDna.transScribe("T");

        assertThat(rnaSequenceT, is(equalTo("A")));
    }
    @Test
    void rnaTranscriptionAisU() {
        RnaDna rnaDna = new RnaDna();

        String rnaSequenceA = rnaDna.transScribe("A");

        assertThat(rnaSequenceA, is(equalTo("U")));
    }


    @Test
    public void testRnaTranscription() {
        RnaDna rnaDna = new RnaDna();

        String rnaSequence = rnaDna.transScribe("ACGTGGTCTTAA");

        assertThat(rnaSequence, is(equalTo("UGCACCAGAAUU")));
  }
}
