#include "university.h"

#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <map>

typedef std::string state;
typedef std::vector<University> Universities;

int main(int argc, char* argv[]) {
    if (argc != 2) {
        std::cerr << "Usage: " << argv[0] << " <state>" << std::endl;
        return -1;
    }

    std::ifstream inputFile(argv[1]);
    if (!inputFile) {
        std::cerr << "Unable to open file: " << argv[1] << std::endl;
        return -1;
    }

    std::map<state, Universities> universities;
    std::string state, university;
    while (inputFile >> state >> university) {
        universities[state].push_back(University(university));
    }

}