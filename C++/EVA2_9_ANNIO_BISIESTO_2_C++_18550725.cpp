﻿#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;



int main() {
    cout << "Ingresa el año: " << endl;
    int iAnnio;
    
    cin >> iAnnio;
    int iMod;
    
    iMod = iAnnio % 4;
    int iMod2;
    
    iMod2 = iAnnio % 100;
    int iMod3;
    
    iMod3 = iAnnio % 400;
    if (iMod == 0 && (!(iMod2 == 0) || iMod3 == 0)) {
        cout << "Es año bisiesto" << endl;
    } else {
        cout << "No es año bisiesto" << endl;
    }
    return 0;
}


