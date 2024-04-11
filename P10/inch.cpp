//  inch.cpp

#include <iostream>
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