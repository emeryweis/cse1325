#include <iostream>
#include <string>
using namespace std;

int main() {
    std::cout << "What is your name? ";
    std::string name;
    getline(cin, name);

    std::cout << "Hello, " << name << "!" << std::endl;
}