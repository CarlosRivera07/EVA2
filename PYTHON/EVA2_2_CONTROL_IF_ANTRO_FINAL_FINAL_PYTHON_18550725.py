print("Cuál es tu edad?")
iEdad = int(input())
print("Tienes INE?")
bTieneINE = (input().lower == 'true')
if iEdad >= 18 and bTieneINE == True:
    print("Adelante")
else:
    print("No entras")
