// Linear.cpp

#include <iostream>
#include <vector>

#include "Polynomial.h"
#include "Linear.h"


Linear::Linear(std::vector<double>& coefficients) : Polynomial(coefficients) {}

std::vector<double> Linear::solve() {
    return std::vector<double> { -_coefficients[1] / _coefficients[0] };
}
Linear::~Linear() {
    delete &_coefficients;
}



