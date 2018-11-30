
#ifndef TEREM_H
#define TEREM_H

#include string

/**
  * class Terem
  * 
  */

class Terem
{
public:

  // Constructors/Destructors
  //  


  /**
   * Empty Constructor
   */
  Terem ();

  /**
   * Empty Destructor
   */
  virtual ~Terem ();

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
  string epulet;
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
   * Set the value of epulet
   * @param new_var the new value of epulet
   */
  void setEpulet (string new_var)   {
      epulet = new_var;
  }

  /**
   * Get the value of epulet
   * @return the value of epulet
   */
  string getEpulet ()   {
    return epulet;
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

#endif // TEREM_H
