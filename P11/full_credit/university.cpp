#include "university.h"
#include <string>
#include <iostream>
#include <istream>
#include <ostream>


University::University(std::string name, int enrollment) : _name{name}, _enrollment{enrollment} {

    validate();
}

const std::string University::name() {
    return _name;
}
const int University::enrollment() {
    return _enrollment;
}

std::istream& operator>>(std::istream& ist, University& reading) {
    ist >> reading._name >> reading._enrollment;
    reading.validate();
    return ist;
}

std::ostream& operator<<(std::ostream& ost, const University& writing) {
    ost << writing._name << " has an enrollment of " << writing._enrollment;
    return ost;
}
