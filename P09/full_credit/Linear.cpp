// Linear.cpp

#include <iostream>
#include <vector>

#include "Polynomial.h"
#include "Linear.h"


Linear::Linear(std::vector<double>& coefficients) : Polynomial(coefficients) {
    if (_coefficients.size() != 2) {
        throw std::invalid_argument("a may not be 0");
    }
}

std::vector<double> Linear::solve() {
    double a = _coefficients[0];
    double b = _coefficients[1];
    return {-b/a};
}
Linear::~Linear() {
    delete &_coefficients;
}



