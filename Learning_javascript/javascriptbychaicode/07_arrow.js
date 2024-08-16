const obj1 = {
    username :"hitesh",
    id : 123,
    welcome : function(){
        console.log(`Hello good morning ${this.username}`)
        console.log(this)
    }
}

// obj1.welcome()
// console.log(this)
// obj1.username = "Ravi"
// obj1.welcome()

// function r(){
//     console.log(this)
// }
// r();



// const chai = function(){
//     let username = "hitesh"
//     console.log(this.username)
// }

// chai()


// ***********************Arrow Function*********************

const chai = (name) => {
    console.log(`Hello, ${name} brother`)
}

// const addnum = (num1,num2) =>{
//     return num1 + num2
// }


const addnum = (num1,num2) => (num1 + num2)


const objinarrow = () => ({username : "hitesh"})

console.log(addnum(10,20))

