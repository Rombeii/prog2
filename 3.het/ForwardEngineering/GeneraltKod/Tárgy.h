
#ifndef TÁRGY_H
#define TÁRGY_H

#include string
#include vector



/**
  * class Tárgy
  * 
  */

class Tárgy
{
public:

  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Tárgy ();

  /**
   * Empty Destructor
   */
  virtual ~Tárgy ();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  



  /**
   * @param  kurzus
   */
  void KurzusFelvetel (Kurzus* kurzus)
  {
  }


  /**
   * @param  hallgato
   */
  void HallgatoFelvetel (Hallgato* hallgato)
  {
  }

protected:

  // Static Protected attributes
  //  

  // Protected attributes
  //  

public:


  // Protected attribute accessor methods
  //  

protected:

public:


  // Protected attribute accessor methods
  //  

protected:


private:

  // Static Private attributes
  //  

  // Private attributes
  //  

  string kod;
  string nev;
  int kredit;
  Hallgato* hallgatok;
  Kurzus* kurzusok;
public:


  // Private attribute accessor methods
  //  

private:

public:


  // Private attribute accessor methods
  //  


  /**
   * Set the value of kod
   * @param new_var the new value of kod
   */
  void setKod (string new_var)   {
      kod = new_var;
  }

  /**
   * Get the value of kod
   * @return the value of kod
   */
  string getKod ()   {
    return kod;
  }

  /**
   * Set the value of nev
   * @param new_var the new value of nev
   */
  void setNev (string new_var)   {
      nev = new_var;
  }

  /**
   * Get the value of nev
   * @return the value of nev
   */
  string getNev ()   {
    return nev;
  }

  /**
   * Set the value of kredit
   * @param new_var the new value of kredit
   */
  void setKredit (int new_var)   {
      kredit = new_var;
  }

  /**
   * Get the value of kredit
   * @return the value of kredit
   */
  int getKredit ()   {
    return kredit;
  }

  /**
   * Set the value of hallgatok
   * @param new_var the new value of hallgatok
   */
  void setHallgatok (Hallgato* new_var)   {
      hallgatok = new_var;
  }

  /**
   * Get the value of hallgatok
   * @return the value of hallgatok
   */
  Hallgato* getHallgatok ()   {
    return hallgatok;
  }

  /**
   * Set the value of kurzusok
   * @param new_var the new value of kurzusok
   */
  void setKurzusok (Kurzus* new_var)   {
      kurzusok = new_var;
  }

  /**
   * Get the value of kurzusok
   * @return the value of kurzusok
   */
  Kurzus* getKurzusok ()   {
    return kurzusok;
  }
private:


  void initAttributes () ;

};

#endif // TÁRGY_H
