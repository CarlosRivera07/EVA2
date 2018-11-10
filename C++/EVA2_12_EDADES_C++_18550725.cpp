#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;


int main() {
    double dSuma;
    
    dSuma = 0;
    cout << "Ingresa la primera edad: " << endl;
    double dEdad;
    
    cin >> dEdad;
    dSuma = dSuma + dEdad;
    cout << "Ingresa la segunda edad: " << endl;
    cin >> dEdad;
    dSuma = dSuma + dEdad;
    cout << "Ingresa la tercera edad: " << endl;
    cin >> dEdad;
    dSuma = dSuma + dEdad;
    cout << "Ingresa la cuarta edad: " << endl;
    cin >> dEdad;
    dSuma = dSuma + dEdad;
    cout << "Ingresa la quinta edad: " << endl;
    cin >> dEdad;
    dSuma = dSuma + dEdad;
    double dMedia;
    
    dMedia = dSuma / 5;
    cout << "La media es: " << dMedia << endl;
    return 0;
}


