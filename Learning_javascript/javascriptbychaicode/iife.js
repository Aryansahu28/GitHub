// Immediately Invoked Function Expressions (IIFE)


(function chai(){
    // named IIFE
    console.log(`DB CONNECTED`);
})();


( (name = "Krish") => {
    console.log(`My name is ${name}`);
})();

