class Virag{
    void szur(){
        System.out.print("Megszúrt");
    }
}

class Hovirag extends Virag{        //sérti mert a Hóvirág nem szúr

}

class Rozsa extends Virag{

}

class Program{
    public static void fgv(Virag v){
        v.szur();
    }
}