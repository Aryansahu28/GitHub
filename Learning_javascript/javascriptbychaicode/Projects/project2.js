const form = document.querySelector("form");

// console.log(form);
form.addEventListener('submit',function(e){
  e.preventDefault();
  
  const height = parseInt(document.querySelector('#height').value);
  const weight = parseInt(document.querySelector('#weight').value);
  const results = document.querySelector('#results');

  if(height == '' || height < 0 || isNaN(height)){
    results.innerHTML = `Please enter correct height ${height}`;
  }
  else if(weight == '' || weight < 0 || isNaN(weight)){
    results.innerHTML = `Please enter correct weight ${weight}`;
  }
  else{
    const bmi = (weight /((height*height)/1000)).toFixed(2);
    // show the results
      if(bmi < 18.6){ results.innerHTML = `<span> Your bmi is ${bmi} which is under weight</span>`}
      if(bmi >= 18.6 && bmi<=24.9){ results.innerHTML = `<span> Your bmi is ${bmi} which is normal weight</span>`}
      if(bmi >24.9){ results.innerHTML = `<span> Your bmi is ${bmi} which is over weight</span>`}
    // results.innerHTML = `<span>${bmi} is your</span>`

  }
})