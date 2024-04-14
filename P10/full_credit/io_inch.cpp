#include <iostream>
#include "inch.h"

int main(int argc, char** argv) {
    Inch in;
    Inch last_in;
    Inch sum;
    std::cout << "Enter an inch (x y/z):";
    while (std::cin) {
        std::cin >> in; // Using overloaded operator>>
        std::cout << "Last input: " << in << "\n";
        sum = sum + in; // Using overloaded operator+

        if (in == last_in) {
            std::cout << "Second entry == first entry\n";
        }
        if (in != last_in) {
            std::cout << "Second entry != first entry\n";
        }  
        if (in < last_in) {
            std::cout << "Second entry < first entry\n";
        }
        if (in <= last_in) {
            std::cout << "Second entry <= first entry\n";
        }
        if (in > last_in) {
            std::cout << "Second entry > first entry\n";
        }
        if (in >= last_in) {
            std::cout << "Second entry >= first entry\n";
        }

        std::cout << "Sum: " << sum << "\n";
        std::cout << "Enter another inch (x y/z):";

        last_in = in;
    }    
}