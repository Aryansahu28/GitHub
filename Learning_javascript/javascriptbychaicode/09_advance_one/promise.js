const promiseOne = new Promise(function(resolve,reject){
    // Do asyn task
    // DB calls, cryptography, network
    setTimeout(function(){
        console.log(('Asyn task is complete'));
        resolve()
    },1000)
})

promiseOne.then(function(){
    console.log("Promise consumed");
})


new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log("Anonymous function runs")
        resolve();
    },1000)
}).then(function(){
    console.log("Async 2 resolved");
})


const promiseThree = new Promise(function(resolve,reject){
    setTimeout(function(){
        resolve({username : "chai" , email:"chai@example.com"})
    },1000)
})

promiseThree.then(function(user){
    console.log(user);
})

const promiseFour = new Promise(function(resolve,reject){

    setTimeout(function(){

        let error = false;
        if(!error){
            resolve({username : "hitesh",Password : "12345"});
        }
        else{
            reject('ERROR: Something went wrong');
        }
    },1000)
})

promiseFour
.then(function(){
    console.log("Is it running");
    return user.username;
}).then((username) =>{
    console.log(username);
}).catch(function(error){
    console.log(error);
}).finally( () => console.log("The promise is either resolved or rejected"));

const promiseFive = new Promise(function(resolve,reject){
    
})