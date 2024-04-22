#ifndef UNIVERSITY_H__
#define UNIVERSITY_H__

#include <iostream>
#include <string>
#include <iostream>
#include <istream>
#include <ostream>

class University {
  private:
    std::string _name;
    int _enrollment;

  public:
    University(std::string _name, int _enrollment);
    const std::string name();
    const int enrollment();
    friend istream& operator>>(istream& ist, University& reading);
    friend ostream& operator<<(ostream& ost, const University& writing);
};

#endif