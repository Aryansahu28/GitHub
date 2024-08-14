// singleton
// object.create

// object literals 

const mySym = Symbol("key1")

const JsUser = {
    name:"Hitesh",
    "full name" : "Hitesh Choudhary",
    [mySym] : "myKey",
    age: 18,
    location: "Jaipur",
    email : "hitesh@gmail.com",
    isLoggedIn : true,
    lastLoginDays :["Monday","Saturday"]
}

// console.log(JsUser.email)
// console.log(JsUser["email"])
// console.log(JsUser["full name"])
// console.log(JsUser[mySym])

JsUser.email = "hitesh@chatgpt.com"
// object.freeze(JsUser)

JsUser.email = "htesh@gmail.com"
// console.log(JsUser)

JsUser.greeting = function(){
    console.log("Hello Js User");
}
JsUser.greetingTwo = function(){
    console.log(`Hello Js user, ${this.name}`);
}
console.log(JsUser.greeting());
console.log(JsUser.greetingTwo());