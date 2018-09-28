#include <cstddef>
class Bill;

class Reservation{
    Bill* bill;
public:
    Reservation():bill(NULL){}
    const Bill* GetBill()const{return bill;}
    void SetBill(Bill* pb){bill = pb;}    
};

class Bill{
    Reservation* reservation;
public:
    Bill(Reservation * r ):reservation(r){r->SetBill(this);}
    Reservation* GetReservation()const {return reservation;}
};