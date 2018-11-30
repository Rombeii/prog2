
#ifndef OKATATO_H
#define OKATATO_H

#include string
#include vector



/**
  * class Okatato
  * 
  */

class Okatato
{
public:

  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Okatato ();

  /**
   * Empty Destructor
   */
  virtual ~Okatato ();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  


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

  string nev;
  Terem* iroda;
  Kurzus* kurzusok;
public:


  // Private attribute accessor methods
  //  

private:

public:


  // Private attribute accessor methods
  //  


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
   * Set the value of iroda
   * @param new_var the new value of iroda
   */
  void setIroda (Terem* new_var)   {
      iroda = new_var;
  }

  /**
   * Get the value of iroda
   * @return the value of iroda
   */
  Terem* getIroda ()   {
    return iroda;
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

#endif // OKATATO_H
