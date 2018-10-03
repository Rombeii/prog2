#include <iostream>
#include "leet.h"

int main(){
    Leet fordito;

    std::string szoveg = "The Three Little Pigs is a fable about three pigs who build three houses of different materials. A big bad wolf blows down the first two pigs' houses, made of straw and sticks respectively, but is unable to destroy the third pig's house, made of bricks. Printed versions date back to the 1840s, but the story itself is thought to be much older. The phrases used in the story, and the various morals drawn from it, have become embedded in Western culture. Many versions of The Three Little Pigs have been recreated or have been modified over the years, sometimes making the wolf a kind character. It is a type 124 folktale in the Aarne–Thompson classification system.";
    std::cout << fordito.atalakito(szoveg) << std::endl;

    return 0;
}