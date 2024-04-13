//  inch.h

#ifndef __INCH_H
#define __INCH_H

#include <iostream>
#include <iomanip>
#include <istream>
#include <ostream>

class Inch {
  public:
    Inch(int whole, int numerator, int denominator);
    Inch();

    Inch operator+(const Inch& rhs);
    bool operator==(const Inch& rhs) {return (compare(rhs) == 0);}
    bool operator!=(const Inch& rhs) {return (compare(rhs) != 0);}
    bool operator<(const Inch& rhs) {return (compare(rhs) < 0);}
    bool operator<=(const Inch& rhs) {return (compare(rhs) <= 0);}
    bool operator>(const Inch& rhs) {return (compare(rhs) > 0);} 
    bool operator>=(const Inch& rhs) {return (compare(rhs) >= 0);}
    
    friend std::ostream& operator<<(std::ostream& ost, const Inch& inch);
    friend std::istream& operator>>(std::istream& ist, Inch& inch);



  private:
    int _whole;
    int _numerator;
    int _denominator;

    const int compare(const Inch& rhs);
    int validate();

};

#endif