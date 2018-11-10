#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>



int main() {
    bool materias;
    bool servicio;
    bool residencias;
    
    materias = true;
    servicio = true;
    residencias = true;
    if (materias == true && servicio == true && residencias == true) {
        cout << "YA TE PUEDES TITULAR" << endl;
    } else {
        cout << "NO TE PUEDES TITULAR" << endl;
    }
    return 0;
}

