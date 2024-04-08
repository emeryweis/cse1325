// Quadratic.cpp

#include <iostream>
#include <vector>
#include <cmath>

#include "Polynomial.h"
#include "Quadratic.h"

Quadratic::Quadratic(std::vector<double>& coefficients) : Polynomial(coefficients) {
    if (coefficients.size() != 3) {
        throw std::runtime_error("a may not be 0");
    }
}

Quadratic::~Quadratic() {
    delete &_coefficients;
}

std::vector<double> Quadratic::solve() {
    double a = _coefficients[0];
    double b = _coefficients[1];
    double c = _coefficients[2];

    double discriminant = {b*b - 4*a*c};
    if (discriminant < 0) {
        throw std::runtime_error("No real roots!");
    }
    double root_plus = (-b + std::sqrt(discriminant)) / (2*a);
    double root_minus = (-b - std::sqrt(discriminant)) / (2*a);

    return {root_plus, root_minus};
}

