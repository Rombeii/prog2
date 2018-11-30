class Virag{
    
    /*void szur(){
        System.out.print("Megszúrt");
    }*/
}

class SzurosVirag extends Virag{
    public void szur(){
    System.out.print("Megszúrt");

}

class Hovirag extends Virag{

}

class Rozsa extends SzurosVirag{

}

}

class Program{
    public static void fgv(Virag v){
        //v.szur(); kár odatenni mert nem minden virágra jellemző
    }
}