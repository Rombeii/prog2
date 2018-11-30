class Virag {
    //void szur(){}
};

class Program {
    public:
        void fgv( Virag &Virag){
            
        }
};

class SzurosVirag: public Virag{
    public:
        virtual void szur(){};
};

class Rozsa: public SzurosVirag{

};

class Hovirag: public Virag{

};

int main(){
    Program program;
    Virag virag;
    program.fgv(virag);

    Rozsa rozsa;
    program.fgv(rozsa);

    Hovirag hovirag;
    program.fgv(hovirag);
}
