class Virag {
    public:
        virtual void szur(){}
};

class Program {
    public:
        void fgv( Virag &virag){
            virag.szur();
        }
};

class Rozsa: public Virag{

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
    program.fgv(hovirag);   //itt sérül, mert a hóvirág nem szúr
}
