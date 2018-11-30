#include <iostream>

class Szulo{
    public:
        void szulokiir(){
            std::cout << "Ez a szulo" << std::endl;
        } 
};

class Gyerek: public Szulo{
    public:
        void gyerekkiir(){
            std::cout << "Ez a gyerek" << std::endl;
        }
};

int main(){
    Szulo *szulo = new Gyerek();

    std::cout << "Gyerek létrehozása: \n\tSzulo *szulo = new Gyerek();" << std::endl;
    std::cout << "\nA szulo objektum szulokiir() fuggvenyet hasznaljuk: \n\tszulo->szulokiir()" << std::endl;
    szulo->szulokiir();
    std::cout << "\nA szulo objektum gyerekkiir()-re mar errort kapunk" << std::endl;
    szulo->gyerekkiir();
    delete szulo;  
}