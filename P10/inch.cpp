//  inch.cpp

#include <iostream>
#include <iomanip>
#include "inch.h"

Inch::Inch(int whole, int numerator, int denominator) : _whole{whole}, _numerator{numerator}, _denominator{denominator} {
    validate();
 }
Inch::Inch() : Inch(0, 0, 2) { }

Inch Inch::operator+(const Inch& rhs) {

    int left_lcd = 64/this->_denominator;
    left_lcd *= this->_numerator;
    int right_lcd = 64/rhs._denominator;
    right_lcd *= rhs._numerator;

    int new_numerator = (left_lcd + right_lcd);
    int new_whole = (this->_whole + rhs._whole);

    return Inch(new_whole, new_numerator, 64);
}


std::ostream& operator<<(std::ostream& ost, const Inch& inch) {
    ost << inch._whole << " " << inch._numerator << "/" << inch._denominator;
    return ost;
}
std::istream& operator>>(std::istream& ist, Inch& inch) {
    char c;
    ist >> inch._whole >> inch._numerator >> c >> inch._denominator;
    inch.validate();
    return ist;
}

const int Inch::compare(const Inch& rhs) {
    double me = static_cast<double>(this->_whole) + 
    (static_cast<double>(this->_numerator) / static_cast<double>(this->_denominator));

    double you = static_cast<double>(rhs._whole) + 
    (static_cast<double>(rhs._numerator) / static_cast<double>(rhs._denominator));

    if (me < you) return -1;
    if (me > you) return 1;
    return 0;
}
