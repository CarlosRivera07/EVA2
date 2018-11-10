#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;


int main() {
    cout << "INTRODUCE TU CALIFICACIÓN" << endl;
    int iCalifa;
    
    cin >> iCalifa;
    if (iCalifa == 100) {
        cout << "A" << endl;
    } else {
        if (iCalifa == 90) {
            cout << "B" << endl;
        } else {
            if (iCalifa == 80) {
                cout << "C" << endl;
            } else {
                if (iCalifa == 70) {
                    cout << "D" << endl;
                } else {
                    if (iCalifa == 60) {
                        cout << "F" << endl;
                    } else {
                        cout << "Calificación fuera de rango" << endl;
                    }
                }
            }
        }
    }
    return 0;
}
