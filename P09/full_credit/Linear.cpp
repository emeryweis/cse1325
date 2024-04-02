#include <iostream>
#include <vector>
#include "Polynomial.h"


class Linear : public Polynomial {
  public:
    Linear(std::vector<double[]> coefficients) : Polynomial(coefficients) {
        if (coefficients.size() != 2) {
            throw std::runtime_error("a may not be 0");
        }
    }

    std::vector<double[]> solve() {
        _coefficients[0] = a;
        _coefficients[1] = b;

        return ((-b) / a);
    }

};