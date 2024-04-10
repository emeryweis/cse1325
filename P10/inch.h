//  inch.h

#ifndef __INCH_H
#define __INCH_H

#include <iostream>

class Inch {
  public:
    Inch(int whole, int numerator, int denominator);
    Inch operator+(const Inch& rhs);
    bool operator==(const Inch& rhs);
    bool operator!=(const Inch& rhs);
    

  private:
    int _whole;
    int _numerator;
    int _denominator

};

#endif