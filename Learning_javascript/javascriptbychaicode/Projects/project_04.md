let randomnum = parseInt(Math.random()*100+1);

const submit = document.querySelector("#subt");
const userInput = document.querySelector("#guessField");
const guessSlot = document.querySelector(".guesses");
const loworhi = document.querySelector(".loworhi");
const remaining = document.querySelector(".lastResult");
const startOver = document.querySelector(".resultParas");

const p = document.createElement("p");

let prevGuess = [];
let numGuess = 1;

let playGame = true;

if(playGame){
  submit.addEventListener('click',function(e){
    e.preventDefault();
    let guess = parseInt(userInput.value);
    console.log(guess);
    validateGuess(guess);
  })
}

function validateGuess(guess){
  if(isNaN(guess)){
    alert("Enter a valid number");
  }else if( guess < 0){
    alert('Enter a number greater than 0')
  } else if (guess > 100){
    alert("Enter a number smaller than 100")
  }else{
    prevGuess.push(guess);
    if(numGuess === 11){
      displayGuess(guess);
      display(`Game Over. Random number is ${randomnum}`);
      endGame();
    }else{
      checkguess(guess)
    }
  }
}

function checkguess(guess){
  if(randomnum == guess){
    displayMessage("You choose a correct number woohhoo!!");
    endGame();
  } else if(randomnum < guess){
    displayMessage("Your number is too high");
  }else if (randomnum > guess){
    displayMessage("Your number is too low to be precise")
  }
}

function displayGuess(guess){
userInput.value = '';
guessSlot.innerHTML += `${guess}`;
numGuess++;
remaining.innerHTML += `${11-numGuess} `;
}

function displayMessage(message){
  loworhi.innerHTML = `<h2>${message}</h2>`; 
}

function endGame(){
  userInput.value = '';
  submit.setAttribute('disabled','');
  p.classList.add('button');
  p.innerHTML = '<h2 id="newGame">Start new Game</h2>';
  startOver.appendChild(p);
  playGame = false;
  newGame();
}

function newGame(){
  prevGuess =[];
  numGuess = 1;
  guessSlot.innerHTML = '';
  remaining.innerHTML = `${11-numGuess}`;
  submit.removeAttribute('disabled');
  startOver.removeChild(p);
  playGame = true;
}
