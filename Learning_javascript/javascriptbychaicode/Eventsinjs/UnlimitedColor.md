<!-- https://stackblitz.com/edit/dom-project-chaiaurcode-x3yioh?file=6-unlimitedColors%2Fchaiaurcode.js -->

```javascript 

let randomColor = function(){
  const hex = "0123456789ABCDEF";
  let color = "#";
  for(let i = 0; i<6;i++){
  color += hex[Math.floor(Math.random()*16)];
  }return color;
}
const ColorChange = function(){
  document.body.style.backgroundColor = randomColor();
}
let interval;
document.querySelector("#start").addEventListener('click',function(){
  if(!interval){
  interval = setInterval(ColorChange,1000);
}
})

document.querySelector('#stop').addEventListener('click',function(){
  clearInterval(interval);
  interval = null;
})





```