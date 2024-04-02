#ifndef __POLYNOMIAL_H
#define __POLYNOMIAL_H

#include <iostream>
#include <vector>

class Polynomial() {
  public:
    Polynomial(double[] coefficients) {}
    virtual ~Polynomial() {}
    std::vector<double[]> solve() = 0;

  private:
    std::vector<double[]> _coefficients = {a, b, c};
};

#endif