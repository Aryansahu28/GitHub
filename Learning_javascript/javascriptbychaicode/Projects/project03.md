```javascript

const clock = document.getElementById("clock");

// console.log(date.toLocaleTimeString());

setInterval(function(){
  let date = new Date();
  clock.style.fontSize = "30px";
  clock.innerHTML = date.toLocaleTimeString();
},1000)```