const SCRIPTS = require("./scripts");

addition='';
result='';
for(i=0;i<7;i++){
    result=result+'#'+addition;
    console.log(result);
    addition='#';
}

for(i=1;i<101;i++){
    console.log((i%3===0&&i%5===0?'fizzbuzz':(i%3===0&&i%5!=0?'fizz':(i%3!=0&&i%5===0?'buzz':i))));
}

var f = function(a,b){
    result='';
    for (i=0;i<a;i++) {
        row='';
        for (j=0;j<b;j=j+2) {

            if(i%2===0){
                row=row+' #';
            } else {
                row=row+'# ';
            }
            
        }
        row=row+'\n';
        result=result+row;
    }
    return result;
}


console.log(f(20,20));

const roundTo = (n, step) => {
    let remainder = n % step;
    return n - remainder + (remainder < step / 2 ? 0 : step);
};


console.log(roundTo(38,10));

function multiplier(factor) {
    return function(number){
        return number*factor;
    }
    //return (number) => {return number * factor};
}

let twice = multiplier(2);
console.log(twice(5));

//************************************** */

let myMin = (a, b) =>{
    return a<b?a:(a>b?b:a);
}

console.log(myMin(555,55));

let f = (a) =>{
    if(a<0){
        a=-a;
    }
    if(a===0){
        return 'even';
    } 
    if(a===1){
        return 'odd';
    }
    return f(a-2);
}

console.log(f(-1));

str = "sadfasdf";
console.log(str[4])

let charsAt =(str, char) => {
    ret=0;
    for(i=0;i<str.length;i++){
        chAt=str[i];
        if(chAt===char){
            ret++;
        }
    }
    return ret;
}

console.log(charsAt("haBiBi","f"));

//**** objects */

let testObject ={
    "touched a tree":true,

}

console.log(testObject["touched a tree"]);



justVal = "just";

let changeVal = (a) => {
    a="hoho";
}

changeVal(justVal);

console.log(justVal);

//**************************************** */

const score = {visitors: 0, home: 0};
// This is okay
score.visitors = 1;
// This isn't allowed
score = {visitors: 1, home: 1};

var JOURNAL = [
    {"events":["carrot","exercise","weekend"],"squirrel":false},
    {"events":["bread","pudding","brushed teeth","weekend","touched tree"],"squirrel":false},
    {"events":["carrot","nachos","brushed teeth","cycling","weekend"],"squirrel":false},
    {"events":["brussel sprouts","ice cream","brushed teeth","computer","weekend"],"squirrel":false},
    {"events":["potatoes","candy","brushed teeth","exercise","weekend","dentist"],"squirrel":false},
    {"events":["brussel sprouts","pudding","brushed teeth","running","weekend"],"squirrel":false},
    {"events":["pizza","brushed teeth","computer","work","touched tree"],"squirrel":false},
    {"events":["bread","beer","brushed teeth","cycling","work"],"squirrel":false},
    {"events":["cauliflower","brushed teeth","work"],"squirrel":false},
    {"events":["pizza","brushed teeth","cycling","work"],"squirrel":false},
    {"events":["lasagna","nachos","brushed teeth","work"],"squirrel":false},
    {"events":["brushed teeth","weekend","touched tree"],"squirrel":false},
    {"events":["lettuce","brushed teeth","television","weekend"],"squirrel":false},
    {"events":["spaghetti","brushed teeth","work"],"squirrel":false},
    {"events":["brushed teeth","computer","work"],"squirrel":false},
    {"events":["lettuce","nachos","brushed teeth","work"],"squirrel":false},
    {"events":["carrot","brushed teeth","running","work"],"squirrel":false},
    {"events":["brushed teeth","work"],"squirrel":false},
    {"events":["cauliflower","reading","weekend"],"squirrel":false},
    {"events":["bread","brushed teeth","weekend"],"squirrel":false},
    {"events":["lasagna","brushed teeth","exercise","work"],"squirrel":false},
    {"events":["spaghetti","brushed teeth","reading","work"],"squirrel":false},
    {"events":["carrot","ice cream","brushed teeth","television","work"],"squirrel":false},
    {"events":["spaghetti","nachos","work"],"squirrel":false},
    {"events":["cauliflower","ice cream","brushed teeth","cycling","work"],"squirrel":false},
    {"events":["spaghetti","peanuts","computer","weekend"],"squirrel":true},
    {"events":["potatoes","ice cream","brushed teeth","computer","weekend"],"squirrel":false},
    {"events":["potatoes","ice cream","brushed teeth","work"],"squirrel":false},
    {"events":["peanuts","brushed teeth","running","work"],"squirrel":false},
    {"events":["potatoes","exercise","work"],"squirrel":false},
    {"events":["pizza","ice cream","computer","work"],"squirrel":false},
    {"events":["lasagna","ice cream","work"],"squirrel":false},
    {"events":["cauliflower","candy","reading","weekend"],"squirrel":false},
    {"events":["lasagna","nachos","brushed teeth","running","weekend"],"squirrel":false},
    {"events":["potatoes","brushed teeth","work"],"squirrel":false},
    {"events":["carrot","work"],"squirrel":false},
    {"events":["pizza","beer","work","dentist"],"squirrel":false},
    {"events":["lasagna","pudding","cycling","work"],"squirrel":false},
    {"events":["spaghetti","brushed teeth","reading","work"],"squirrel":false},
    {"events":["spaghetti","pudding","television","weekend"],"squirrel":false},
    {"events":["bread","brushed teeth","exercise","weekend"],"squirrel":false},
    {"events":["lasagna","peanuts","work"],"squirrel":true},
    {"events":["pizza","work"],"squirrel":false},
    {"events":["potatoes","exercise","work"],"squirrel":false},
    {"events":["brushed teeth","exercise","work"],"squirrel":false},
    {"events":["spaghetti","brushed teeth","television","work"],"squirrel":false},
    {"events":["pizza","cycling","weekend"],"squirrel":false},
    {"events":["carrot","brushed teeth","weekend"],"squirrel":false},
    {"events":["carrot","beer","brushed teeth","work"],"squirrel":false},
    {"events":["pizza","peanuts","candy","work"],"squirrel":true},
    {"events":["carrot","peanuts","brushed teeth","reading","work"],"squirrel":false},
    {"events":["potatoes","peanuts","brushed teeth","work"],"squirrel":false},
    {"events":["carrot","nachos","brushed teeth","exercise","work"],"squirrel":false},
    {"events":["pizza","peanuts","brushed teeth","television","weekend"],"squirrel":false},
    {"events":["lasagna","brushed teeth","cycling","weekend"],"squirrel":false},
    {"events":["cauliflower","peanuts","brushed teeth","computer","work","touched tree"],"squirrel":false},
    {"events":["lettuce","brushed teeth","television","work"],"squirrel":false},
    {"events":["potatoes","brushed teeth","computer","work"],"squirrel":false},
    {"events":["bread","candy","work"],"squirrel":false},
    {"events":["potatoes","nachos","work"],"squirrel":false},
    {"events":["carrot","pudding","brushed teeth","weekend"],"squirrel":false},
    {"events":["carrot","brushed teeth","exercise","weekend","touched tree"],"squirrel":false},
    {"events":["brussel sprouts","running","work"],"squirrel":false},
    {"events":["brushed teeth","work"],"squirrel":false},
    {"events":["lettuce","brushed teeth","running","work"],"squirrel":false},
    {"events":["candy","brushed teeth","work"],"squirrel":false},
    {"events":["brussel sprouts","brushed teeth","computer","work"],"squirrel":false},
    {"events":["bread","brushed teeth","weekend"],"squirrel":false},
    {"events":["cauliflower","brushed teeth","weekend"],"squirrel":false},
    {"events":["spaghetti","candy","television","work","touched tree"],"squirrel":false},
    {"events":["carrot","pudding","brushed teeth","work"],"squirrel":false},
    {"events":["lettuce","brushed teeth","work"],"squirrel":false},
    {"events":["carrot","ice cream","brushed teeth","cycling","work"],"squirrel":false},
    {"events":["pizza","brushed teeth","work"],"squirrel":false},
    {"events":["spaghetti","peanuts","exercise","weekend"],"squirrel":true},
    {"events":["bread","beer","computer","weekend","touched tree"],"squirrel":false},
    {"events":["brushed teeth","running","work"],"squirrel":false},
    {"events":["lettuce","peanuts","brushed teeth","work","touched tree"],"squirrel":false},
    {"events":["lasagna","brushed teeth","television","work"],"squirrel":false},
    {"events":["cauliflower","brushed teeth","running","work"],"squirrel":false},
    {"events":["carrot","brushed teeth","running","work"],"squirrel":false},
    {"events":["carrot","reading","weekend"],"squirrel":false},
    {"events":["carrot","peanuts","reading","weekend"],"squirrel":true},
    {"events":["potatoes","brushed teeth","running","work"],"squirrel":false},
    {"events":["lasagna","ice cream","work","touched tree"],"squirrel":false},
    {"events":["cauliflower","peanuts","brushed teeth","cycling","work"],"squirrel":false},
    {"events":["pizza","brushed teeth","running","work"],"squirrel":false},
    {"events":["lettuce","brushed teeth","work"],"squirrel":false},
    {"events":["bread","brushed teeth","television","weekend"],"squirrel":false},
    {"events":["cauliflower","peanuts","brushed teeth","weekend"],"squirrel":false}
  ];

  let eventsStack = [];
  for( let enttry of JOURNAL){
    let eventss = enttry.events;
    
    for(let insideEntr of eventss){
        if(!eventsStack.includes(insideEntr)){
            eventsStack.push(insideEntr);
        }
        console.log(insideEntr);
    }
    console.log('squriific: '+enttry.squirrel);
    console.log('*****');
    //console.log(`${a[0]} ev`);
  }

  console.log('*********************');
  console.log(eventsStack);


//*********************************************** */

let initArr = [1,2,3,4,5,6,7,8,9];

let reverseInit = (arr) =>{
    arr[0] ="sdfs";
}
reverseInit(initArr);

console.log(initArr);

//*********************************************** */
  

let arrayToTest1 = [1,2,3,4,5,6,7,8,9];
let arrayToTest2 = [1,2,3,4,6,7,8,9];

console.log(arrayToTest1);
console.log('************');
console.log(arrayToTest2);

let reverseArrayInside = (array) => {
    for(let i=0; i<array.length/2; i++){
        let dump = array[i];
        array[i] = array[array.length-1-i];
        array[array.length-1-i] = dump;
    }
}


 

console.log('after insert');
reverseArrayInside(arrayToTest1);
reverseArrayInside(arrayToTest2);

console.log(arrayToTest1);
console.log('************');
console.log(arrayToTest2);

//*********************************************** */

let arrayToTest12 = [1,2,3,4,5,6,7,8,9];
let arrayToTest22 = [1,2,3,4,6,7,8,9];

let reverseArrayNew = (array) => {
    let newArr = [];
    let j=0;

    for(let i=array.length-1; i>=0 ; i--){
        newArr[j]=array[i];
        j++;
    }
    return newArr;
}

console.log(reverseArrayNew(arrayToTest12));
console.log('************');
console.log(reverseArrayNew(arrayToTest22));

//******************************************************************** */

let testList = {
    id : 0,
    rest:null,
}

let limit = 5;
let insideCNT = 1;

let buildAList = (listt, insideCNTt) =>{
    //console.log("insideCNT "+insideCNT);
    if(insideCNT>=limit){
        return;
    } else {
        console.log("insidee: "+insideCNT);
        //listt.id = insideCNT;
        listt.rest = returnNewList(insideCNT++);
        buildAList(listt.rest, insideCNT);
    }
}

let returnNewList = (changeID) =>{
    console.log("list created with ID "+changeID)
    let obj = {
        id:changeID,
        rest : null,
    }

    return obj;
}

buildAList(testList, insideCNT);

console.log(JSON.stringify(testList, null, 4));


console.log('*****************************************************************************************');

/*********************************************************************************************************** */
/************************ this one creates an array from a list recursively ******************************** */
/*********************************************************************************************************** */

arAsLst = [];
let arrayIfy = (listGoesHere) =>{
    if(listGoesHere===null){
        return;
    }
    arAsLst.push(listGoesHere.id);
    console.log("pushed: "+listGoesHere.id);
    arrayIfy(listGoesHere.rest);
}

arrayIfy(testList);

/*********************************************************************************************************** */
/****************************          this one prepends a list      *************************************** */
/*********************************************************************************************************** */

let objToPrep = {
    id : 666,
    rest:null,
}

let prependAList = (list, element) => {
    element.rest = list;
}
prependAList(testList, objToPrep);

console.log(JSON.stringify( objToPrep, null, 4 ));


/*********************************************************************************************************** */
/************************************** string operations split foreach ************************************ */
/*********************************************************************************************************** */

let initStr = "2043+330+430+270+1942+270+350+800+300+340+1972+200+550+250+120+300+537";

let sum = 0; 
let q = initStr.split('+');

q.forEach((elem)=>{
    sum = sum + Number(elem) ;
})

console.log(sum);

/*********************************************************************************************************** */
/************************************** passing action as an argument ************************************ */
/*********************************************************************************************************** */


let func = (times, action) =>{
    for(i=0;i<times;i++){
        action(i);
    }
}

//func(10, console.log)

labels = [];
func(10, (j) => {labels.push(`label `+j)});

console.log(labels)

/*********************************************************************************************************** */
/************************************** function that creates new functions ************************************ */
/*********************************************************************************************************** */

let greaterThan = (n) =>{
    return m => m>n;
}

let greaterThan10 = greaterThan(10);

console.log(greaterThan10(11))


/*********************************************************************************************************** */
/************************************* function that changes other functions *********************************/
/*********************************************************************************************************** */


let noisy = (f) =>{
    return (...args)=>{
        total = [];
        console.log("what do we have here:  "+args);
        for(i=0; i<args.length; i++){
            total.push(Number(args[i]));
        }
        console.log("here: "+total);
        //total.
        console.log(Math.min(...total))
    };
}

noisy(Math.min)(3, 2, 1, 2, 22)

/*********************************************************************************************************** */
/************************************* function that changes control flow ************************************/
/*********************************************************************************************************** */

let repeat = (times, action) => {
    for(i=0; i<times; i++){
        action(i);
    }
}

let unless = (test, then) => {
    if(!test) then();
}

repeat(3, console.log);


/*********************************************************************************************************** */
/************************************* script dataset ************************************/
/*********************************************************************************************************** */

//import { SCRIPTS } from './scripts.js';

let modulee = require('./scripts.js');


let filer = (array, test) => {
    let passed = [];
    for (let element of array){
        if (test(element)){
            passed.push(element);
        }
    }
    return passed;
}

console.log(filer(modulee, script => script.living))

/*********************************************************************************************************** */
/************************************* script dataset ************************************/
/*********************************************************************************************************** */

console.log([1,2,3,4,5,6].reduce((a,b)=>{return a+b }))

console.log([1,2,3,4,5,6].map((a)=>{return a+1}))


let modulee = require('./scripts.js');

console.log(SCRIPTS.filter(a=>a.direction=='rtl').map(el=>el.name));

let modulee = require('./scripts.js');

function characterScript(code) {
    for(let script of SCRIPTS){
        if(script.ranges.some(([from, to])=>{
            return code >= from && code<to;
        })){
            return script;
        }
    }
    return null;
}

console.log(characterScript(121));

console.log([1,2,3,4,5,6,12,55].some(a=>{return a>10}));

/*********************************************************************************************************** */
/************************************* string units problems ************************************/
/*********************************************************************************************************** */

let horseShoe = "🐴👟";
console.log(horseShoe.length);
console.log(horseShoe[0] );
console.log(horseShoe.codePointAt(0));

let ho= 'hoho';
console.log(ho[0]);

let roseDragon = "🌹🐉";
for (let char of roseDragon) {
console.log(char);
}
 

/*********************************************************************************************************** */
/************************************* count by objects (how many are false and how many are true) ************************************/
/*********************************************************************************************************** */

function countBy(items, groupName) {
    let counts = [];

    for (let item of items) {
        let name = groupName(item);
        console.log("name: "+name);
        let known = counts.find(c => c.name == name);
        console.log("known: "+known);
        if (!known) {
            counts.push({name, count: 1});
        } else {
            known.count++;
        }
    }
    return counts;
}

console.log(countBy([1,1, 2, 3, 4, 5], n => n > 2));

console.log(!undefined)

/*********************************************************************************************************** */
/************************************* count by objects (how many are false and how many are true) ************************************/
/*********************************************************************************************************** */

let modulee = require('./scripts.js');

function characterScript(code) {
    for (let script of SCRIPTS) {
        if (script.ranges.some(([from, to]) => {return code >= from && code < to;})) {
            return script;
        }
    }

    return null;
    }

function countBy(items, groupName) {
    let counts = [];

    for (let item of items) {
        let name = groupName(item);
        //console.log("name: "+name);
        let known = counts.find(c => c.name == name);
        //console.log("known: "+known);
        if (!known) {
            counts.push({name, count: 1});
        } else {
            known.count++;
        }
    }
    return counts;
}

 
let scrr = countBy("dfsfsssыыы", char => {
    let script = characterScript(char.codePointAt(0));
    return script ? script.name : "none";
    }).filter(({name}) => name != "none");

console.log('****');
console.log(scrr);
console.log('****');
let ttt = scrr.reduce( ((n, {count}) => n + count ), 0);

console.log(ttt);

console.log('****');
console.log(scrr.map(({name, count})=>{ return `name is: ${name}, count is ${count}`}));


/*********************************************************************************************************** */
/*************************************check callback ************************************/
/*********************************************************************************************************** */


let calbck = (n, {count})=>{
    return(n + count);
}

/*********************************************************************************************************** */
/*************************************check reduce ************************************/
/*********************************************************************************************************** */

console.log([20,10,5].reduce((a,b)=>a-b))

/*********************************************************************************************************** */
/************************************* objects ************************************/
/*********************************************************************************************************** */

    function speak(line) {
        console.log(`The ${this.type} rabbit says '${line}'`);
    }
    
    let whiteRabbit = {type: "white", speak};
    let hungryRabbit = {type: "hungry", speak};
    whiteRabbit.speak("Oh my fur and whiskers");
 
    hungryRabbit.speak("Got any carrots?");

/*********************************************************************************************************** */
/********************************************* objects prototypes ********************************************/
/*********************************************************************************************************** */

console.log(Object.getPrototypeOf({}) == Object.prototype);
 

let protoRabbit = {
    speak(line) {
        console.log(`The ${this.type} rabbit says '${line}'`);
    }
};
let blackRabbit = Object.create(protoRabbit);
blackRabbit.type = "black";
blackRabbit.speak("I am fear and darkness");

class Rabbit {
    constructor(type) {
        this.type = type;
    }

    speak(line) {
        console.log(`The ${this.type} rabbit says '${line}'`);
    }
}


/*********************************************************************************************************** */
/******************************************************* graph ************************************************/
/*********************************************************************************************************** */

const roads = [
    "Alice's House-Bob's House", "Alice's House-Cabin",
    "Alice's House-Post Office", "Bob's House-Town Hall",
    "Daria's House-Ernie's House", "Daria's House-Town Hall",
    "Ernie's House-Grete's House", "Grete's House-Farm",
    "Grete's House-Shop", "Marketplace-Farm",
    "Marketplace-Post Office", "Marketplace-Shop",
    "Marketplace-Town Hall", "Shop-Town Hall"
];

function buildGraph(edges) {
    let graph = Object.create(null);

    function addEdge(from, to) {
        if (from in graph) {
            graph[from].push(to);
        } else {
            console.log(from);
            graph[from] = [to];
        }
    }

    for (let [from, to] of edges.map(r => r.split("-"))) {
        addEdge(from, to);
        addEdge(to, from);
    }
    return graph;
}
    
const roadGraph = buildGraph(roads);

console.log(roadGraph)




//let graphd = {};
let  graphd = Object.create(null);
const kkey = 'afdasf';
const vallue = 'DDD';
const vallue2 = 'ss';
//push as array!!!
graphd[kkey] = [vallue];
console.log(graphd);
if (kkey in graphd){
    //console.log('in...');
 
     graphd[kkey].push(vallue2);
}
console.log(graphd);

graphd["keyOne"].push("hoho");
graphd["keyTwo"].push("hoho");
console.log(graphd);

let ages = {
    Boris: ["1","2"],
    Julia: ["11"],
}
ages["Boris"].push("23")
console.log(ages["Boris"])

/*********************************************************************************************************** */
/******************************************************* map ************************************************/
/*********************************************************************************************************** */


let colors = new Map();
colors.set("RED", "reeeed");
//colors.get("RED")
console.log(colors);
colors.set("RED", ["reeeed", "ReD"]);
console.log(colors);

/*********************************************************************************************************** */
/******************************************************* errors ************************************************/
/*********************************************************************************************************** */


function numberToString(n, base = 10) {
    let result = "", sign = "";

    if (n < 0) {
        sign = "-";
        n = -n;
    }
    do {
        result = String(n % base) + result;
        n /= base;
    } while (n > 0);

    return sign + result;
}
    console.log(numberToString(13, 10));

let a=13;
let b=10;
for(let i=0;i<10;i++){
    debugger;
     a/=b;
    console.log(a)
}


let accountName = prompt("Enter an account name");

/************************************************************************************************************/
/************************************************ regularochki **********************************************/
/************************************************************************************************************/

console.log(new RegExp("ab").test("aws"));
console.log(/[1-9]/.test("0000010000"))

console.log("asdf asdf".search(/\s/))

/************************************************************************************************************/
/************************************************ import random **********************************************/
/************************************************************************************************************/

import {returnRand} from "./scripts.js";
console.log(returnRand());


import {parse} from "ini";
console.log(parse("x = 10\ny = 20"));

import {formatDate} from "format-date";

import formatDate from 'format-date';
//const {formatDate} = pkg;

console.log(formatDate(new Date(2017, 9, 13),
"dddd the Do"));

/************************************************************************************************************/
/************************************************ promises **********************************************/
/************************************************************************************************************/

new Promise((asdasd, reject) => reject(new Error("Fail")))
.then(value => console.log("Handler 1:", value))
.catch(reason => {
console.log("Caught failure " + reason);
return "nothing something";
})
.then(value => console.log("Handler 2:", value));


function withTimeout(promise, time) {
    return new Promise((resolve, reject) => {
    promise.then(resolve, reject);
    setTimeout(() => reject("Timed out"), time);
    });
}

function crackPasscode(networkID) {
    function nextDigit(code, digit) {
    let newCode = code + digit;
    
    return withTimeout(joinWifi(networkID, newCode), 50)
    .then(() => newCode)
    .catch(failure => {
    if (failure == "Timed out") {
    return nextDigit(newCode, 0);
    } else if (digit < 9) {
    return nextDigit(code, digit + 1);
    } else {
    throw failure;
    }
    });
    }
    return nextDigit("", 0);
    
}

crackPasscode("HANGAR 2").then(console.log);


let start = Date.now();
setTimeout(() => {console.log("1" );}, 20);
//while (Date.now() < start + 50) {}
console.log("2" );

var activityGraph = (table) => {
    let widest = Math.max(50, Math.max(...table))
    return table.map((n, i) => {
      let width = (n / widest) * 20
      let full = Math.floor(width), rest = " ▏▎▍▌▋▊▉"[Math.floor((width - full) * 8)]
      return String(i).padStart(2, " ") + " " + "█".repeat(full) + rest
    }).join("\n")
}

console.log(activityGraph())

/************************************************************************************************************/
/************************************************ sinCosCheck **********************************************/
/************************************************************************************************************/

let checkog = () =>{
    for(let i =0;i<2000;i++){
        console.log(Math.sin(i*0.1)+"  "+Math.cos(i*0.1));
        //console.log(Math.);
    }
}

checkog();