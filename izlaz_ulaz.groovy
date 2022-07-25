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
