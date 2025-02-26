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

## 6. Empleats (_[employees](src/part1/employees)_)

- Tenim un sistema on controlem els treballadors que hi ha a la nostra empresa. 
- De l'Empleat guardarem el nom, el cognom, l'edat i el salari. 
- A més de la constructora per defecte i la constructora per paràmetres i dels seus setters&getters, un empleat també tindrà:
  - boolean plus(int plusSalarial). Aquest mètode ha de ser capaç de sumar una quantitat que
    entrarem com a paràmetre si l'empleat té més de 40 anys. Retorna una variable booleana
    per tal d'informar si s'ha apujat el seu salari o no.
  - boolean comprovaNom(): ens comprova que el nom no estigui buit
  - Després tindrem un tipus d'empleat que és un Comercial, d'un comercial guardarem la
    comissio que s'endú. Crea igualment constructores i gettersSetters.
  - A més tenim un empleat que serà el Repartidor. Aquest empleat en guardarem la zona per
    la qual reparteix el producte. Crea igualment constructores i gettersSetters.
  - Fes una classe executora, comprova la creació de diferents tipus d'objectes diferents
    empleat, comercial i repartidor. Compara classes, utilitza el getClass, instanceOf, prova la
    igualtat entre dos Objectes (equalsTo).

# Activitats Classes Abstractes ([Part2](src/part2))

## 1.Transports (_[transports](src/part2/transports)_)
- Volem modelar diversos tipus de transports: cotxes, bicicletes i metro.
- La informació rellevant relativa a tot els **transports** és:
  - 1. L'identificador
  - 2. La velocitat actual en km/h (podem suposar que és constant).
- La informació rellevant relativa als **cotxes** és:
  - 1. El tipus de combustible.
  - 2. El preu per litre de combustible.
  - 3. Els litres de combustible que gasta un cotxe per cada km recorregut.
- La informació rellevant relativa a les **bicicletes** és:
  - 1. El nombre de marxes.
- La informació rellevant relativa als **metros** és:
  - 1. El preu del bitllet. Cada 5km el preu del bitllet augmenta un 1 euro.
- A partir de les dades anteriors, volem efectuar les operacions següents:
  - Calcular el temps en hores que triga cada vehicle en recórrer una distància en
  quilòmetres, a velocitat constant.
  -  Calcular el preu que hem de pagar com a usuaris de cada vehicle en recórrer una
     distància, el programa ha de demanar la distància recorreguda. Estableix el preu que
     necessitis en cada cas.

## 2.Aquarium (_[Aquarium](src/part2/Aquarium)_)

