const name = "hitesh";
const repoCount = 50;


// console.log(name + repoCount + " Value" );


console.log(`Hello my name is ${name} and my repo count is around ${repoCount}`)

const gameName = new String('hitesh-hc-com');

// console.log(gameName[0]);
// console.log(gameName.__proto__);

// console.log(gameName.length);
// console.log(gameName.toUpperCase());
console.log(gameName.charAt(2));
console.log(gameName.indexOf('t'));

const newSTring = gameName.substring(0,4);
console.log(newSTring);

const anotherString = gameName.slice(-12,4);
console.log(anotherString);

const newSTringOne = "   hitesh   "
console.log(newSTringOne.trim());

const url = "www.googlecwgwge%23.com";
console.log(url.replace("%23","-"))

console.log(url.includes("goo"));
console.log(gameName.split("-"))