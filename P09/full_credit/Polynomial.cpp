// Polynomial.cpp

#include "Polynomial.h"

Polynomial::Polynomial(std::vector<double> coefficients) : _coefficients{coefficients} {}

Polynomial::~Polynomial() {
    delete &_coefficients;
}

