import java.util.ArrayList;

public class mRNA {

    ArrayList<String> nucleotides = new ArrayList<>();

    public mRNA() {

    }

    public void addNucleotide(String nutrogenousBase) {
        nucleotides.add(nutrogenousBase);
    }

    public AminoAcidChain getAminoAcids() {
        AminoAcidChain aminoAcidChain = new AminoAcidChain();
        for (int i = 0; i < nucleotides.size(); i+=3) {
            aminoAcidChain.addAminoAcid(codonToAminoAcid(""+nucleotides.get(i)+nucleotides.get(i+1)+nucleotides.get(i+2)));
        }
        return aminoAcidChain;
    }

    public String codonToAminoAcid(String codon) {
        String n1 = "" + codon.charAt(0);
        String n2 = "" + codon.charAt(1);
        String n3 = "" + codon.charAt(2);

        if (n1.equals("A")) {
            if (n2.equals("U")) {
                if (!n3.equals("G"))
                    return "Ile";
                else
                    return "Met";
            } else if (n2.equals("C")) {
                return "Thr";
            } else if (n2.equals("A")) {
                if (n3.equals("U") || n3.equals("C"))
                    return "Asna";
                else
                    return "Lys";
            } else if(n2.equals("G")){
                if (n3.equals("U") || n3.equals("C"))
                    return "Ser";
                else
                    return "Arg";
            }
        } else if(n1.equals("G")){
            if (n2.equals("U")) {
                return "Val";
            } else if (n2.equals("C")) {
                return "Ala";
            } else if (n2.equals("A")) {
                if (n3.equals("U") || n3.equals("C"))
                    return "Asp";
                else
                    return "Glu";
            } else if(n2.equals("G")){
                    return "Gly";
            }
        } else if(n1.equals("U")){
            if (n2.equals("U")) {
                if (n3.equals("U") || n3.equals("C"))
                    return "Phe";
                else
                    return "Leu";
            } else if (n2.equals("C")) {
                return "Ser";
            } else if (n2.equals("A")) {
                if (n3.equals("U") || n3.equals("C"))
                    return "Tyr";
                else
                    return "STOP";
            } else if(n2.equals("G")){
                if (n3.equals("U") || n3.equals("C"))
                    return "Cys";
                else if(n3.equals("A"))
                    return "STOP";
                else
                    return "Trp";
            }
        } else if(n1.equals("C")){
            if (n2.equals("U")) {
                return "Leu";
            } else if (n2.equals("C")) {
                return "Pro";
            } else if (n2.equals("A")) {
                if (n3.equals("U") || n3.equals("C"))
                    return "His";
                else
                    return "Gin";
            } else if(n2.equals("G")){
                return "Arg";
            }
        }

        return null;
    }
}
