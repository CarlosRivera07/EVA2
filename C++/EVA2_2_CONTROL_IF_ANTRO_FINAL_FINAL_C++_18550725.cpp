#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;


int main() {
    cout << "Cuál es tu edad?" << endl;
    int iEdad;
    
    cin >> iEdad;
    cout << "Tienes INE?" << endl;
    bool bTieneINE;
    
    cin >> bTieneINE;
    if (iEdad >= 18 && bTieneINE == true) {
        cout << "Adelante" << endl;
    } else {
        cout << "No entras" << endl;
    }
    return 0;
}

