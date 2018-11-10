#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>


int main() {
    cout << "Cuál es tu edad?" << endl;
    int iEdad;
    
    cin >> iEdad;
    if (iEdad >= 18) {
        cout << "Es mayor de edad" << endl;
    } else {
        cout << "No es mayor de edad" << endl;
    }
    return 0;
}


