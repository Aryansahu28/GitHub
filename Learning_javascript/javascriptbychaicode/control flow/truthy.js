const userEmail = []

if(userEmail){
    console.log("Got user email")
}
else{
    console.log("Don't have user email")
}

// Falsy Values

// false,0,-0,BigInt On ,"",null , undefined,NaN

// truthy values
// "0",'false'," ",[],{},function(){}

if(userEmail.length === 0){
    console.log("Array is empty")

}

const emptyObj = {}

if(Object.keys(emptyObj).length ===0){
    console.log("Object is Empty");
}

// Nullliah Coalescing Operator (??): null undefined


let val1;
val1 = 5 ?? 10;
val1 = null ?? 10;
val1 = undefined ?? 10;
val1 = null ?? 10 ?? 20;

console.log(val1);


// Terniary Operator

// condition ? True : false

const val = 5>6 ? "t" : "f";

// console.log(val);

100 <= 140 ? console.log("Hello world") : console.log("I refuse to hello");