// Linear.h

#ifndef __LINEAR_H
#define __LINEAR_H

#include <iostream>
#include <vector>
#include "Polynomial.h"

class Linear : public Polynomial {
  public:  
    Linear(std::vector<double>& coefficients);
    virtual ~Linear() {}
    virtual std::vector<double> solve();

};


#endif