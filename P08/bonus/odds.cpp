#include <iostream>
#include <string>
#include <vector>


int main(int argc, char* argv[]) {
    std::cout << "Enter a sentence: ";

    std::vector<std::string> odds;
    std::vector<std::string> evens;

    for (int i = 1; i < argc; i++) {
        if (std::string(argv[i]).length() % 2 == 0) evens.push_back(argv[i]);
        
        if (std::string(argv[i]).length() % 2 == 1) odds.push_back(argv[i]);
    }

    std::cout << "Evens length: " << std::endl;
    for (std::string s : evens) {
        std::cout << s << " " << std::endl;
    }

    std::cout << "\n\n" << std::endl;
    std::cout << "Odds lenght: " << std::endl;
    for (std::string s : odds) {
        std::cout << s << " " << std::endl;
    }

}