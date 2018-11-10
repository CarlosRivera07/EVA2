print("Cuál es tu edad?")
iEdad = int(input())
print("Tienes INE?")
bTieneINE = (input().lower == 'true')
if iEdad >= 18:
    if bTieneINE == True:
        print("PASELE")
    else:
        print("A la ch$#a clarita")
else:
    print("Saquese de aqui")
