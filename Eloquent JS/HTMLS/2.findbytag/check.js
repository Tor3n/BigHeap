

let prompted = () => {
    let aLink = document.body.getElementsByTagName("a")[0];
    console.log(aLink);
    let aLink1 = document.body.getElementsByTagName("a")[1];
    console.log(aLink1);
}


let findByID = () => {
    let elID = document.getElementById("someID");
    console.log(elID);
}

let findByClass = () => {
    let textValue = document.getElementsByClassName("getClasss")[0].value;
    console.log("what in a textField: "+textValue);
    let elID = document.getElementsByClassName(textValue)[0];
    console.log(elID);
}