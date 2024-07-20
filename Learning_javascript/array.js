let arr = [1, 2, 3, 4, 5];

let newarr = arr.map((e) => {
    return e ** 2;
})


const greaterthanseven = ((e) => {
    if (e > 2) {
        return true;
    }
    return false;
})

let newArr = arr.filter(greaterthanseven);

console.log(newArr);