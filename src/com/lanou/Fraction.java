

public class Fraction {
    private int molecule;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int molecule, int denominator) {
        this.molecule = molecule;
        this.denominator = denominator;
    }

    public void yuefen(int molecule,int denominator){
        int temp=0;
        if(molecule%denominator==0){
            System.out.println(molecule/denominator);
        }
        else {
            for(int i=2;i<=molecule;i++){
                if(molecule%i==0&&denominator%i==0){
                    temp=i;
                }
            }
            if(temp!=0){
                denominator/=temp;
                molecule/=temp;
            }
            System.out.println(molecule+"/"+denominator);
        }

    }

    public void add(int molecule,int denominator){
        int newMolecule=this.molecule*denominator+this.denominator*molecule;
        int newDenominator=this.denominator*denominator;
        yuefen(newMolecule,newDenominator);

    }

    public void difference(int molecule,int denominator){
        int newMolecule=this.molecule*denominator-this.denominator*molecule;
        int newDenominator=this.denominator*denominator;
        yuefen(newMolecule,newDenominator);
    }

    public void multiply(int molecule,int denominator){
        int newMolecule=molecule*this.molecule;
        int newDenominator=this.denominator*denominator;
        yuefen(newMolecule,newDenominator);
    }

    public void division(int molecule,int denominator){
        int newMolecule=denominator*this.molecule;
        int newDenominator=molecule*this.denominator;
        yuefen(newMolecule,newDenominator);
    }
}
