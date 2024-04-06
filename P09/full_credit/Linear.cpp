#include <iostream>
#include <vector>

#include "Polynomial.h"


class Linear : public Polynomial {
  public:
    Linear(std::vector<double[]>& coefficients) : Polynomial(coefficients) {
        if (coefficients.size() != 2) {
            throw std::runtime_error("'a' may not be 0");
        }
    }

    virtual ~Linear(){
        std::cerr << "Destructing linear" << std::endl;
    }

    std::vector<double> solve() override {
        return ((-1 * coefficients[1] ) / coefficients[0]);
    }

};