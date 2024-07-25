 let a = 6;

 function factorial(a) {
     let arr = Array.from(Array(a + 1).keys());
     console.log(arr.slice(1, ));
     let c = arr.slice(1, ).reduce((a, b) => {
         return a * b;
     })
     console.log(c)
 }

 factorial(a);