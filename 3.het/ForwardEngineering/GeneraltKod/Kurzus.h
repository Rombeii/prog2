
#ifndef KURZUS_H
#define KURZUS_H

#include string
#include vector



/**
  * class Kurzus
  * 
  */

class Kurzus
{
public:

  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Kurzus ();

  /**
   * Empty Destructor
   */
  virtual ~Kurzus ();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  



  /**
   * @param  oktato
   * @param  terem
   */
   Kurzus (Oktato* oktato, Terem* terem)
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
  string tipus;
  Tárgy* targy;
  Terem* terem;
  Oktato* oktato;
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
   * Set the value of tipus
   * @param new_var the new value of tipus
   */
  void setTipus (string new_var)   {
      tipus = new_var;
  }

  /**
   * Get the value of tipus
   * @return the value of tipus
   */
  string getTipus ()   {
    return tipus;
  }

  /**
   * Set the value of targy
   * @param new_var the new value of targy
   */
  void setTargy (Tárgy* new_var)   {
      targy = new_var;
  }

  /**
   * Get the value of targy
   * @return the value of targy
   */
  Tárgy* getTargy ()   {
    return targy;
  }

  /**
   * Set the value of terem
   * @param new_var the new value of terem
   */
  void setTerem (Terem* new_var)   {
      terem = new_var;
  }

  /**
   * Get the value of terem
   * @return the value of terem
   */
  Terem* getTerem ()   {
    return terem;
  }

  /**
   * Set the value of oktato
   * @param new_var the new value of oktato
   */
  void setOktato (Oktato* new_var)   {
      oktato = new_var;
  }

  /**
   * Get the value of oktato
   * @return the value of oktato
   */
  Oktato* getOktato ()   {
    return oktato;
  }
private:


  void initAttributes () ;

};

#endif // KURZUS_H
