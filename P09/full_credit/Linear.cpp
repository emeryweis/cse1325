// Linear.cpp

#include <iostream>
#include <vector>

#include "Polynomial.h"
#include "Linear.h"


Linear::Linear(std::vector<double>& coefficients) : Polynomial(coefficients) {}

std::vector<double> Linear::solve() {
    double a = _coefficients[0];
    double b = _coefficients[1];
    return {-b/a};
}
Linear::~Linear() {
    delete &_coefficients;
}



