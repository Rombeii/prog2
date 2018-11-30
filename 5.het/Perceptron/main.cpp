#include <iostream>
#include "mlp.hpp"
#include <png++/png.hpp>
#include <fstream>

//g++ main.cpp -o main -lpng -std=c++11
//./main mandel.png

using namespace std;

int main (int argc, char **argv)
{
  png::image <png::rgb_pixel> png_image (argv[1]);

  int size = png_image.get_width() * png_image.get_height();

  Perceptron* p = new Perceptron (3, size, 256, size);

  double* image = new double[size];
  double* image_er = new double[size];


  for(int i {0}; i<png_image.get_width(); ++i)
    for(int j{0}; j<png_image.get_height();++j){
     // image[i*png_image.get_width()+j] = png_image[i][j].red;
      image_er[i*png_image.get_width()+j] = png_image[i][j].red;
    }

  double value = (*p) (image);

  //std::cout << value << std::endl;


  for(int i{0}; i<png_image.get_width(); ++i)
    for(int j{0}; j<png_image.get_height(); ++j) {
      png_image[i][j].red = image_er[i*png_image.get_width()+j];
      png_image[i][j].blue = image_er[i*png_image.get_width()+j+6];
      png_image[i][j].green = image_er[i*png_image.get_width()+j+2];
    }

  png_image.write("gusztustalan.png");
  cout << endl << "A modositott kep mentve! " << endl << endl;

  //p->save(kif);//alapértelmezett mentés
  p->kiir();

  delete p;
  delete [] image;
  delete [] image_er;

}
