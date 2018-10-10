#include <iostream>
#include <boost/filesystem.hpp>

using namespace std;
using namespace boost::filesystem; 

void bejaro(std::string root);

int main(int argc, char* argv[]){

    //string root = "/usr/lib/jvm/java-11-openjdk-amd64";
    string root = "/home/tamas/Documents/ikszde";
    bejaro(root);

}

void bejaro(std::string root){
    for(recursive_directory_iterator end, dir(root); dir != end; dir++){
        if(extension(*dir) == ".java")
            cout<<*dir<<endl;

    }


}

//g++ JDKOsztalyok.cpp -lboost_system -lboost_filesystem -o JDKOsztalyok.o