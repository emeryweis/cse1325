#ifndef UNIVERSITY_H__
#define UNIVERSITY_H__

#include <iostream>
#include <string>
#include <istream>
#include <ostream>


class University {
    private:
        std::string _name;
        int _enrollment;
        void validate();

    public:
        University(std::string _name = "", int _enrollment = 0);
        const std::string name();
        const int enrollment();
        friend std::istream& operator>>(std::istream& ist, University& reading);
        friend std::ostream& operator<<(std::ostream& ost, const University& writing);
};

#endif