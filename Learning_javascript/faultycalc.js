const prompt = require("prompt-sync")();
// Enter the first number given by the user
let a = prompt("Enter first number: ");
// Enter the second number given by the user
let b = prompt("Enter second number: ");
// Generating random number using Math.random

let perform = prompt("What do you want to perform --> add, sub ,div,multi or expo :: ");

let c = Math.random();
a = parseInt(a);
b = parseInt(b);

if (c < 0.1) {
    if (perform == "add") {
        console.log(a - b);
    } else if (perform = "sub") {
        console.log(a / b);
    } else if (perform = "multi") {
        console.log(a + b);
    } else if (perform = "div") {
        console.log(a ** b);
    } else if (perform = "expo") {
        console.log(a * b);
    }
} else {
    if (perform == "add") {
        console.log(a + b);
    } else if (perform = "sub") {
        console.log(a - b);
    } else if (perform = "multi") {
        console.log(a * b);
    } else if (perform = "div") {
        console.log(a / b);
    } else if (perform = "expo") {
        console.log(a ** b);
    }
}