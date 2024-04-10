//  inch.cpp

#include <iostream>
#include "inch.h"

Inch::Inch(int whole, int numerator, int denominator) : _whole{whole}, _numerator{numerator}, _denominator{denominator} { }
Inch::Inch() : Inch(0, 0, 2) { }