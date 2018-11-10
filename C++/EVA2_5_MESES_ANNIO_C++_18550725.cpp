#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;



int main() {
    cout << "Ingresa un número entre el 1 y el 12: " << endl;
    int iMes;
    
    cin >> iMes;
    if (iMes == 1) {
        cout << "El mes 1 es ENERO" << endl;
    } else {
        if (iMes == 2) {
            cout << "El mes 2 es FEBRERO" << endl;
        } else {
            if (iMes == 3) {
                cout << "El mes 3 es MARZO" << endl;
            } else {
                if (iMes == 4) {
                    cout << "El mes 4 es ABRIL" << endl;
                } else {
                    if (iMes == 5) {
                        cout << "El mes 5 es MAYO" << endl;
                    } else {
                        if (iMes == 6) {
                            cout << "El mes 6 es JUNIO" << endl;
                        } else {
                            if (iMes == 7) {
                                cout << "El mes 7 es JULIO" << endl;
                            } else {
                                if (iMes == 8) {
                                    cout << "El mes 8 es AGOSTO" << endl;
                                } else {
                                    if (iMes == 9) {
                                        cout << "El mes 9 es SEPTIEMBRE" << endl;
                                    } else {
                                        if (iMes == 10) {
                                            cout << "El mes 10 es OCTUBRE" << endl;
                                        } else {
                                            if (iMes == 11) {
                                                cout << "El mes 11 es NOVIEMBRE" << endl;
                                            } else {
                                                if (iMes == 12) {
                                                    cout << "El mes 12 es DICIEMBRE" << endl;
                                                } else {
                                                    cout << "Número fuera de rango" << endl;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}

