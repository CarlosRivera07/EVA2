#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>



int main() {
    cout << "Cuál es tu edad?" << endl;
    int iEdad;
    
    cin >> iEdad;
    cout << "Tienes INE?" << endl;
    bool bTieneINE;
    
    cin >> bTieneINE;
    if (iEdad >= 18) {
        if (bTieneINE == true) {
            cout << "PASELE" << endl;
        } else {
            cout << "A la ch$#a clarita" << endl;
        }
    } else {
        cout << "Saquese de aqui" << endl;
    }
    return 0;
}

