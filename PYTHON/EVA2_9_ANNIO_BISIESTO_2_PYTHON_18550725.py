print("Ingresa el año: ")
iAnnio = int(input())
iMod = iAnnio % 4
iMod2 = iAnnio % 100
iMod3 = iAnnio % 400
if iMod == 0 and (not iMod2 == 0 or iMod3 == 0):
    print("Es año bisiesto")
else:
    print("No es año bisiesto")
