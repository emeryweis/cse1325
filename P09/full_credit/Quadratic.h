// Quadratic.h

#ifndef __QUADRATIC_H
#define __QUADRATIC_H

#include <iostream>
#include <vector>
#include "Polynomial.h"

class Quadratic : public Polynomial {
  public:
    Quadratic(std::vector<double>& coefficients);
    virtual ~Quadratic() {}
    virtual std::vector<double> solve();

};

#endif