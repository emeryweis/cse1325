//  inch.cpp

#include <iostream>
#include "inch.h"

Inch::Inch(int whole, int numerator, int denominator) : _whole{whole}, _numerator{numerator}, _denominator{denominator} {
    validate();
 }
Inch::Inch() : Inch(0, 0, 2) { }

Inch Inch::operator+(const Inch& rhs) {

    int new_numerator = (_numerator + rhs._numerator);
    int new_whole = (_whole + rhs._whole);

    return Inch(new_whole, new_numerator, 64)
}