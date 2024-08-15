const tinderUser = {}

tinderUser.id = 1234;
tinderUser.name = "Suresh";
tinderUser.isLoggedIn = true;

// console.log(tinderUser);

const regularUser = {
    email : "Sureshuser123@gmail.com",
    fullname : {
        userfullname : {
            firstname : "Hitesh",
            lastname : "choudhary"
        }
    }
}

// console.log(regularUser.fullname.userfullname.firstname);

const obj1 = { 1 : "a", 2: "b"}
const obj2 = { 3 : "a", 4: "b"}
const obj3 = { 5 : "a", 6: "b"}

// const obj4 = { obj1,obj2}
// console.log(obj4)
// const obj4 = Object.assign({},obj1,obj2,obj3)
// console.log(obj4);

const obj4 = {...obj1,...obj2}
// console.log(obj4)

const user = [
    {
        id : 1,
        email : "hitest123@gmail.com"
},
{
    id : 1,
    email : "hitest123@gmail.com"
},
{
    id : 1,
    email : "hitest123@gmail.com"
}
]

user[1].email = "Hello@gkc.ac.in";
// console.log(user)

// console.log(tinderUser)


// console.log(Object.keys(tinderUser))
// console.log(Object.values(tinderUser))
// console.log(Object.entries(tinderUser))


// console.log(tinderUser.hasOwnProperty('isLoggedIn'))

const course = {
    coursename : "js in hindi",
    price : "999",
    courseInstructor : "hitesh"
}


// You can recast name if it is too long to write again and again
const {courseInstructor: instructor} = course

// console.log(course.courseInstructor)

// console.log(instructor)

// Json
// {
//     "name" : "hitesh",
//     "coursename" : "js in hindi",
//     "price" : "free"
// }

// Api can be given in the form of array

[
    {},
    {}
]


// https://randomuser.me/
// https://jsonformatter.org/

