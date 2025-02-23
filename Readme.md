# Activitats Herència ([Part1](src/part1))

## 1.Objecte Geomètric (_[geometric](src/part1/geometric)_)
- Crea la classe ObjecteGeometric que té:
  - atributs: coord_x, coord_y, color
  - mètodes: constructor, toString()
- Crea la classe Cercle que hereda de ObjecteGeometric i, a més a més, té:
  - atributs: radi
  - mètodes: constructor, toString(), perimetre() i area()
- Crea la classe Quadrat que hereda de ObjecteGeometric i, a més a més, té:
  - atributs: costat
  - mètodes: constructor, toString(), perimetre() i area()

## 2.Vehicles (_[vehicle](src/part1/vehicle)_)
- Cada vehicle s’identifica per la seva **matrícula**.
- El preu del lloguer de qualsevol vehicle té una component base que depèn dels dies de
  lloguer a raó de 10€ **per dia**.
  - En el cas de lloguer d’un cotxe, al preu base se li suma la quantitat de 1.5€ per plaça i dia.
  - El preu de lloguer del microbusos és igual que el dels cotxes, però se li afegeix una
    quantitat de 2€ per plaça independentment dels dies de lloguer.
  - El preu dels vehicles de càrrega és el preu base més 20€ * PMA (on PMA És el pes
    màxim autoritzats en tones).
  - A més a més, en cas dels camions, al preu se li suma un fixe de 40€ independentment
    dels dies de lloguer.
- Afegir un vehicle.
- Obtenir el preu del vehicle.

## 3.School (_[school](src/part1/school)_)
+ Defineix les classes corresponents al següent diagrama UML.
+ Afegeix constructors a cada classe de manera que el constructor cridi al constructor de la
classe mare i seguidament escrigui per pantalla “Sóc el constructor de la classe xxx”.
Després crea una classe executora (amb un main) dins el mateix package, crea objectes
de cada classe i observa què es mostra per pantalla en cada creació.

![School](src/img/school.png)

## 4-5. Biblioteca IImplementació herència (_[library](src/part1/library)_)
- L’objectiu d’aquesta activitat és implementar un seguit de classes en Java relacionades
mitjançant herència. 
- Implementeu les classes Fitxa, Obra, Volum i Revista corresponents
a la figura següent, pensades per poder gestionar alguns dels elements que ens podem
trobar en la gestió d’una biblioteca.

+ Els requeriments són els següents:
+ En la creació de la biblioteca cal indicar la seva dimensió.
+ En una biblioteca no hi pot haver dues fitxes amb la mateixa referència.
+ Ha de proporcionar mètodes per:
  1. Conèixer la capacitat de la biblioteca.
  2. Conèixer el nombre d’elements que hi ha en la biblioteca.
  3. Afegir una fitxa a la biblioteca.
  4. Extreure una fitxa a partir de la seva referència.
  5. Proporcionar la fitxa que es troba en una posició determinada en la biblioteca.
  6. Visualitzar el contingut de la biblioteca.
     Desenvolupeu una altra classe, anomenada ProvaBiblioteca, que contingui un mètode
     main() que comprovi la gestió correcta de la classe Biblioteca implementada.

![Library](src/img/library.png)

## 6. Empleats

