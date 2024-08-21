const coding = ["js", "ruby", "java", "python", "cpp"]

coding.forEach(function (val) {
    // console.log(val);
})


coding.forEach((val) => {
    // console.log(val)
})


// function printMe(item){
//     console.log(item)
// }

// coding.forEach(printMe)

// coding.forEach((item,index,arr)=>{
//     console.log(item,index);
// })


const myCoding = [

    {
        languagename: "Javascript",
        languagefilename: "js"
    },
    {
        languagename: "Python",
        languagefilename: "py"
    },
    {
        languagename: "C++",
        languagefilename: "cpp"
    }
]

myCoding.forEach((item)=>{
    console.log(`File name of programming language ->${item.languagename} is ${item.languagefilename}`)
})