import java.util.Scanner;

public class Main {
    public static void main(String atrgs[]) {

        System.out.println("1 - cDNA->Polypeptide");
        System.out.println("2 - Polypeptide->cDNA");
        Scanner choice = new Scanner(System.in);

        if(choice.nextLine().equals("1")){
            System.out.println("Enter DNA sequence:");
            System.out.print("->");
            Scanner DNAinput = new Scanner(System.in);

            String DNANucleotides = DNAinput.nextLine().toUpperCase();
            cDNA dna = new cDNA();
            dna.importNucleotides(DNANucleotides);

            AminoAcidChain aac = cDNAtoPolypeptide(dna);
            System.out.println(aac);
        }

    }

    public static AminoAcidChain cDNAtoPolypeptide(cDNA DNA){
        mRNA rna = DNA.getRNA();
        AminoAcidChain aminoAcidChain = rna.getAminoAcids();
        return aminoAcidChain;
    }

}
