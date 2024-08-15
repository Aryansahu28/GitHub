function sayMyName(){
    console.log("H")
    console.log("H")
    console.log("H")
    console.log("H")
}

// sayMyName()

function sumoftwonum(number1,number2){
    return number1+number2;
}

const result = sumoftwonum(12,23);
// console.log(result)

function loginUserMessage(username){
    if(!username){
        return  "Please enter a username"
    }
    return `${username}, just logged in`
}

// console.log(loginUserMessage())

function calculateCartPrice(val1,val2,...num){
    return num
}

// console.log(calculateCartPrice(10,20,30,40))

const user = {
    username: "hitesh",
    price: 100
}

function handleObject(anyobject){
    console.log(`Username is ${anyobject.username} and price is ${anyobject.price}`)
}

// handleObject(user)

handleObject({
    username: "Ravi",
    price: 123
})

const myNewArray = [200,300,400,500]

function returnSecondvalue(getArray){
    return getArray[1]
}

