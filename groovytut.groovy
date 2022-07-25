//Funcije za izlaz
println("Hello world")

ime = "Filip"

println("I am ${ime}");
println('I am ${ime}'); //Operator $ ne funkcionise sa ''

def multiLineString = ''' Ovo je tekst
u vise razlicitih 
linija''';
println(multiLineString);

printf("Neko ime: %s, neki broj: %.2f, neki string sa razmakom: %10s\n", [ime, 1.234, "Prezime"]);

//Ulaz
println("Enter number: ");
def num1 = System.console().readLine().toDouble();
println("Enter number: ");
def num2 = System.console().readLine().toDouble();
printf("Prvi broj je: %.2f, drugi broj je: %.2f, a zbir je: %.2f\n", [num1, num2, num1+num2]);

//Liste

def primes =[2,3,5,7,11,13];
println(primes[2]);
println(primes.get(2));
println(primes.size());

primes.add(17);
primes<<19;

println(primes);
println(primes.isEmpty());

println(primes.reverse());
println(primes.sort());

//Mape

def licnaMapa = [
    'ime': 'Filip',
    'godine': 23,
    'grad': 'Kragujevac',
    'lista': [1,2,3]
]
println(licnaMapa);

println(licnaMapa['ime']);
println(licnaMapa.get('godine'));
println(licnaMapa.containsKey('grad'));
println(licnaMapa.size());

licnaMapa.put('visina', 187);
println(licnaMapa.size());

//Range
def oneTo10 = 1..10;
def aToZ = 'a'..'z';
println(oneTo10.size());
println(aToZ.size());

//? operator
def punoletan = false;

println(punoletan ? 'Jeste': 'Nije');

//Switch
switch(licnaMapa['godine']){
    case 0..12: println("Dete"); break;
    case 13..18: println("Tinejdzer"); break;
    default : println("Odrastao");
}

//Funkcije
static def sayHello(){
    println("Hello world!");
}
sayHello();

static def getSum(num1=0, num2=0){
    return num1+num2;
}
println(getSum(5,4));

//Regularni izrazi
def substring = "Groovy" =~ "oo";
println(substring);
println(substring[0]);

def substring1 = "Groovy" =~ "o";

if (substring1){
    ss = substring1.size();
    for(i=0; i<ss; i++){
        println(substring1[i]);
    }
}
else{
    println("Nema poklapanja")
} //Uslovno grananje koje vraca sva poklapanja, a ne samo prvo na koje naidje

def regex = /([0-9])/;
def match = "Groovy" =~ regex;

if (match){
    ss = substring1.size();
    for(i=0; i<ss; i++){
        println(substring1[i]);
    }
}
else{
    println("Nema poklapanja")
} 