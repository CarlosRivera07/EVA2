#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>


int main() {
    cout << "Tienes tu INE?" << endl;
    bool bTieneINE;
    
    cin >> bTieneINE;
    if (bTieneINE == true) {
        cout << "SI TIENE INE" << endl;
    } else {
        cout << "NO TIENE INE" << endl;
    }
    return 0;
}

