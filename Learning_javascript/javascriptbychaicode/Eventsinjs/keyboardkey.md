```javascript

console.log('Project 5');

const insert = document.getElementById('insert');

window.addEventListener('keydown',(e)=>{
  insert.innerHTML = `
  <table>
  <tr>
    <th>key</th>
    <th>Keycode</th>
    <th>Code Hello!</th>
  </tr>
  <tr>
    <td>${e.key == ' ' ? 'Space' : e.key}</td>
    <td>${e.keyCode}</td>
    <td>${e.code}</td>
  </tr>
  
</table>
  `
})
```