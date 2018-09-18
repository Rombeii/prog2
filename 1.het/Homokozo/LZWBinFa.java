//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Math.sqrt;
import java.lang.Math;

public class LZWBinFa{
    void kiir(){
        
    }

    int getMelyseg(){
        melyseg = maxMelyseg = 0;
        rmelyseg(gyoker);
        return maxMelyseg - 1;
    }

    double getAtlag(){
        melyseg = atlagosszeg = atlagdb = 0;
        ratlag(gyoker);
        atlag = ((double) atlagosszeg) / atlagdb;
        return atlag;
    } 

    double getSzoras(){
        atlag = getAtlag();
        szorasosszeg = 0.0;
        melyseg = atlagdb = 0;

        rszoras(gyoker);

        if(atlagdb - 1 > 0){
            szoras = Math.sqrt(szorasosszeg / (atlagdb -1));
        }
        else{
            szoras = Math.sqrt(szorasosszeg);
        }
        return szoras;
    }

    Csomopont fa;
    Csomopont gyoker;
    int melyseg, atlagosszeg, atlagdb;
    double szorasosszeg;
    int maxMelyseg;
    double atlag, szoras;
    void rmelyseg(Csomopont elem){
        if(elem != null){
            melyseg++;
            if(melyseg > maxMelyseg){
                maxMelyseg = melyseg;
            }
            rmelyseg(elem.egyesGyermek());
            rmelyseg(elem.nullasGyermek());
            melyseg--;
        }
    }
    void ratlag(Csomopont elem){
        if(elem != null){
            melyseg++;
            ratlag(elem.egyesGyermek());
            ratlag(elem.nullasGyermek());
            melyseg--;
            if(elem.egyesGyermek() == null & elem.nullasGyermek() == null){
                atlagdb++;
                atlagosszeg += melyseg;
            }

        }

    }
    void rszoras(Csomopont elem){
        if(elem != null){
            ++melyseg;
            rszoras(elem.egyesGyermek());
            rszoras(elem.egyesGyermek());
            --melyseg;
            if(elem.egyesGyermek() == null & elem.nullasGyermek() == null){
                atlagdb++;
                szorasosszeg += ((melyseg - atlag) * (melyseg - atlag));
            }
        }
    }

}