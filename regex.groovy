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
