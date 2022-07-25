
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