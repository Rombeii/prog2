
#ifndef HALLGATO_H
#define HALLGATO_H

#include string
#include vector



/**
  * class Hallgato
  * 
  */

class Hallgato
{
public:

  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Hallgato ();

  /**
   * Empty Destructor
   */
  virtual ~Hallgato ();

  // Static Public attributes
  //  

  // Public attributes
  //  


  // Public attribute accessor methods
  //  


  // Public attribute accessor methods
  //  



  /**
   * @param  targy
   */
  void TargyFelvetel (Tárgy* targy)
  {
  }


  /**
   * @param  targy
   */
  void TargyLeadas (Targy* targy)
  {
  }


  /**
   */
  void TargyakListazasa ()
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

  string nev;
  string neptunKod;
  string szuletesiDatum;
  string szuletesiHely;
  Tárgy* targyak;
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
   * Set the value of neptunKod
   * @param new_var the new value of neptunKod
   */
  void setNeptunKod (string new_var)   {
      neptunKod = new_var;
  }

  /**
   * Get the value of neptunKod
   * @return the value of neptunKod
   */
  string getNeptunKod ()   {
    return neptunKod;
  }

  /**
   * Set the value of szuletesiDatum
   * @param new_var the new value of szuletesiDatum
   */
  void setSzuletesiDatum (string new_var)   {
      szuletesiDatum = new_var;
  }

  /**
   * Get the value of szuletesiDatum
   * @return the value of szuletesiDatum
   */
  string getSzuletesiDatum ()   {
    return szuletesiDatum;
  }

  /**
   * Set the value of szuletesiHely
   * @param new_var the new value of szuletesiHely
   */
  void setSzuletesiHely (string new_var)   {
      szuletesiHely = new_var;
  }

  /**
   * Get the value of szuletesiHely
   * @return the value of szuletesiHely
   */
  string getSzuletesiHely ()   {
    return szuletesiHely;
  }

  /**
   * Set the value of targyak
   * @param new_var the new value of targyak
   */
  void setTargyak (Tárgy* new_var)   {
      targyak = new_var;
  }

  /**
   * Get the value of targyak
   * @return the value of targyak
   */
  Tárgy* getTargyak ()   {
    return targyak;
  }
private:


  void initAttributes () ;

};

#endif // HALLGATO_H
