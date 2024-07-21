let a;

function factorial(a) {
    if (a == 0) {
        return 1;
    } else {
        let s = 1;
        for (let i = 1; i <= a; i++) {
            s = s * i;
        }
        return s;

    }
}

console.log(factorial(5));