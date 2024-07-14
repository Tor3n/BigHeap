const ordinal = require("ordinal");
const {days, months} = require("date-names");

var formatDate = require('format-date');

console.log(formatDate(new Date(2017, 9, 13)));


var formatDate = require('format-date');

console.log(formatDate('{month}/{day}/{year}', new Date()))


setTimeout(()=>{console.log('Tick')}, 500);

new Promise((_, reject) => reject(new Error("Fail")))
.then(value => console.log("Handler 1:", value))
.catch(reason => {
console.log("Caught failure " + reason);
return "nothing";
})
.then(value => console.log("Handler 2:", value));