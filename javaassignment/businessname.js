let a;

a = Math.random();
console.log(a);
let first, second, third;
if (a < 0.33) {
    first = "Crazy";
} else if (a < 0.66 && a >= 0.33) {
    first = "Amazing";
} else {
    first = "Fire";
}
if (a < 0.33) {
    second = " Engine ";
} else if (a < 0.66 && a >= 0.33) {
    second = " Foods ";
} else {
    second = " Garments ";
}
if (a < 0.33) {
    third = "Bros";
} else if (a < 0.66 && a >= 0.33) {
    third = "Limited";
} else {
    third = "Hub";
}

console.log(first + second + third);