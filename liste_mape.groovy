
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
