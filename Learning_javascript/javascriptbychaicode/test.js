const JsUser = {
    name : "ARyan",
    age : 22,
    email : "wwwvinaysahucom28@gmail.com"
}

// console.log(JsUser);
console.log(JsUser.name);
console.log(JsUser["age"]);

JsUser.email = "aryansahu.vibranium@gmail.com";
 console.log(JsUser.email);
Object.freeze(JsUser);

JsUser.email = "aryansahu29@gmail.com";
console.log(JsUser.email);