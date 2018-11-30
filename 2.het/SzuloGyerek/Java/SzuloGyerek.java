class SzuloGyerek{

    public static void main (String[]args){
        Szulo szulo = new Gyerek();
        System.out.println("Gyerek letrehotasa: \n\tSzulo szulo = new Gyerek()");

        System.out.println("\nA szulo objektum fuggvenyet hasznaljuk:\n\tszulo.szulokiir()");

        szulo.szulokiir();

        System.out.println("\nA szulo.gyerekkiir()-re mar errort kapunk");

        szulo.gyerekkiir();

    }
}