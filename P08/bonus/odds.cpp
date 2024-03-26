#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main(int argc, char* argv[]) {
    cout << "Enter a sentence";

    std::vector<std::string> odds;
    std::vector<std::string> evens;

    for (int i = 1; i < argc; i++) {
        if (strcmp(argv[i] % 2) == 0) evens.push_back(argv[i]);
        if (argv[i] % 2 == 1) odds.push_back(argv[i]);
    }



}