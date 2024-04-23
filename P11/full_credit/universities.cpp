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
        if (universities.find(state) == universities.end()) {
            universities[state] = std::vector<University>();
        }
        universities[state].push_back({university});
    }

    while (true) {
        std::string inputState;
        std::cout << "Enter a state (2 letter abbreviation): ";
        std::getline(std::cin, inputState);

        if (inputState.empty()) {
            break;
        }
        if (universities.find(inputState) == universities.end()) {
            std::cout << "No universities found for " << inputState << std::endl;
        } else {
            std::cout << "Universities in " << inputState << ":" << std::endl;
            for (const auto& university : universities[inputState]) {
                std::cout << "- " << university << std::endl;
            }
        }
    }

    return 0;
}