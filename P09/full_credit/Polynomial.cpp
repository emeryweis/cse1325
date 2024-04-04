#include "Polynomial.h"

Polynomial::Polynomial(std::vector<double> coefficients) : _coefficients{&coefficients} { }

Polynomial::~Polynomial() {
    std::cerr << "Destructing coefficient" << std::endl;
    delete _coefficients;
}


