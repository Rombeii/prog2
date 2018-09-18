public class Csomopont{
    char betu;
    Csomopont balNulla;
    Csomopont jobbEgy;

    Csomopont(char b){
        betu = b;
        balNulla = null;
        jobbEgy = null;
    }

    Csomopont nullasGyermek(){
        return balNulla;
    }

    Csomopont egyesGyermek(){
        return jobbEgy;
    }

    void ujNullasGyermek(Csomopont gy){
        balNulla = gy;
    }

    void ujEgyesGyermek(Csomopont gy){
        jobbEgy = gy;
    }

    char getBetu(){
        return betu;
    }
}