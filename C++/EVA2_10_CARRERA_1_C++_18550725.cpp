#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>



int main() {
    bool materiasTerminadas;
    
    materiasTerminadas = true;
    if (materiasTerminadas == true) {
        bool servicioLiberado;
        
        servicioLiberado = true;
        if (servicioLiberado == true) {
            bool residenciasLiberadas;
            
            residenciasLiberadas = true;
            if (residenciasLiberadas == true) {
                cout << "SI TE PUEDES TITULAR" << endl;
            } else {
                cout << "NO TE PUEDES TITULAR" << endl;
            }
        } else {
            cout << "NO TE PUEDES TITULAR" << endl;
        }
    } else {
        cout << "NO TE PUEDES TITULAR" << endl;
    }
    return 0;
}

