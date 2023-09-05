import java.util.ArrayList;

public class cDNA {

    ArrayList<String> nucleotides = new ArrayList<>();

    cDNA(){

    }

    void importNucleotides(String nucleotides){
        for (int i = 0; i < nucleotides.length(); i++) {
            this.nucleotides.add(""+nucleotides.charAt(i));
        }
    }

    mRNA getRNA(){
        mRNA rna = new mRNA();
        for (String s :
                nucleotides) {
            if (s.equals("A"))
                rna.addNucleotide("U");
            else if(s.equals("T"))
                rna.addNucleotide("A");
            else if(s.equals("C"))
                rna.addNucleotide("G");
            else if(s.equals("G"))
                rna.addNucleotide("C");
        }
        return rna;
    }
}
