// for

for(let i=0;i<=5;i++){
    const element = i;
    if(element ==5){
        // console.log("5 is best number")
    }
    // console.log(element);
}

// console.log(element);

for(let i = 1; i<=10;i++){
    // console.log(`Outer loop value: ${i}`)
    for(let j = 1;j<=10;j++){
        // console.log(`Inner loop value ${j} and inner loop ${i}`);
        // console.log(i + "*" + j + "=" + i*j);
    }
}

let myArray = ["flash","batman","superman"]
// console.log(myArray.length)

for(let i = 0; i<myArray.length;i++){
    // console.log(myArray[i]);

}



for(let i =0; i<=20;i++){
    if(i==10){
        // console.log("It is going to at index 10")
        continue;
    }
    console.log(i);
}
