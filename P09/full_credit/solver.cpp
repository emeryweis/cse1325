#include <iostream>
#include <vector>

#include "Polynomial.h"
#include "Linear.h"
#include "Quadratic.h"

int main(int argc, char** argv) {
    if ((argc < 3) || (argc > 4)) {
        throw std::runtime_error("Invalid polynomial size - must be linear or quadratic. argc length: " + std::to_string(argc));
    }
    std::vector<double> coefficients;
    for (int i = 1; i < argc; i++) {
        coefficients.push_back(std::stod(argv[i]));
    }

    
    Polynomial* p = nullptr;
    if (argc == 3) {
        p = new Linear(coefficients);
    } else {
        p = new Quadratic(coefficients);
    }

    std::vector<double> roots = p->solve();
    std::cout << "Root(s) are:" << std::endl;
    for (double root : roots) {
        std::cout << root << std::endl;
    }

    delete p;
}