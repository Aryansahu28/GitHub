const myNumbers = [1,2,3,4,5,6,7,8,9,10]

// const newNums = myNumbers.map((nums) =>{ return nums + 10})

// console.log(newNums)

const newNums = myNumbers
                        .map( (val) =>{ return val + 10})
                        .map( (val) =>{ return val*2})
                        .filter( (val) =>{ return val > 30})


console.log(newNums)
