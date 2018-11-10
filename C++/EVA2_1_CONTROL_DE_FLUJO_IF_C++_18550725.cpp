#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>


int main() {
    cout << "Qué calificación obtuviste en Fundamentos de Programación: " << endl;
    double rCalifa;
    
    cin >> rCalifa;
    cout << "Tu calificación es: " << rCalifa << endl;
    if (rCalifa >= 70) {
        cout << "Ya pasaste!!" << endl;
    } else {
        cout << "Muy bien, lo bueno es que hay salud!!" << endl;
    }
    return 0;
}


