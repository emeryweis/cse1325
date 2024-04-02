#include <iostream>
#include <vector>

class Linear : public Polynomial {
  public:
    Linear(std::vector<double[]> coefficients) : Polynomial(coefficients) {
        if (coefficients.size() != 2) {
            throw std::runtime_error("a may not be 0");
        }
    }


}