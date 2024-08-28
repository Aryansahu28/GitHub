
let myDate = new Date()
// console.log(myDate.toString())
// console.log(myDate.toLocaleString())
// console.log(myDate.toLocaleDateString())
// console.log(myDate.toLocaleTimeString())
// console.log(typeof myDate)

let myCreateDate = new Date(2023,4,25,13,12,34,45)
// Date(year: number, monthIndex: number, date?: number, hours?: number, minutes?: number, seconds?: number, ms?: number): Date

// console.log(myCreateDate.toLocaleTimeString())

let myTimeStamp = Date.now()
// console.log(myTimeStamp)  //It will print time in milliseconds

// console.log(myCreateDate.getTime()) //It will also gice time in milliseconds

// console.log(Math.floor(Date.now()/1000))  //Always do floor or round never do ceil


let newDate = new Date()

console.log(newDate);
console.log(newDate.getMonth())
console.log(newDate.getFullYear())

console.log(`${newDate.getDay()} and the time is ${newDate.getHours()}:${newDate.getMinutes()}:${newDate.getSeconds()}`);


newDate.toLocaleString('default',{
    weekday : 'long',
})