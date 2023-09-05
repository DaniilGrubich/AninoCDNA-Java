import java.util.ArrayList;

public class AminoAcidChain {
    ArrayList<String> AminoAcids = new ArrayList<>();
    void addAminoAcid(String animoAcid){
        AminoAcids.add(animoAcid);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < AminoAcids.size(); i++) {
            out+= "#"+i+": "+AminoAcids.get(i)+"\n";
        }
        return out;
    }
}
