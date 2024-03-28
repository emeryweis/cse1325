#include <iostream>
#include <string>
#include <vector>
#include <algorithm>    // shuffle and sort
#include <random>
#include <chrono>

/*
    Now is the time for all good men to come to the aid of their country
*/


int main(int argc, char* argv[]) {
    std::cout << "Enter a sentence: ";

    std::vector<std::string> odds;
    std::vector<std::string> evens;

    for (int i = 1; i < argc; i++) {
        if (std::string(argv[i]).length() % 2 == 0) evens.push_back(argv[i]);
        
        if (std::string(argv[i]).length() % 2 == 1) odds.push_back(argv[i]);
    }

    unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();;

    std::sort(odds.begin(), odds.end());
    std::shuffle (evens.begin(), evens.end(), std::default_random_engine(seed));


    std::cout << "Odds length (sorted): " << std::endl;
    for (std::string s : odds) {

        std::cout << s << " " << std::endl;
    }

    std::cout << "\n\n" << std::endl;

    std::cout << "Evens length (shuffled): " << std::endl;
    for (std::string s : evens) {
        std::cout << s << " " << std::endl;
    }


}