print("Ingresa el año: ")
iAnnio = int(input())
iMod = iAnnio % 4
if iMod == 0:
    iMod2 = iAnnio % 100
    if iMod2 == 0:
        iMod3 = iAnnio % 400
        if iMod3 == 0:
            print("Es año bisiesto")
        else:
            print("No es año bisiesto")
    else:
        print("Es año bisiesto")
else:
    print("No es año bisiesto")
