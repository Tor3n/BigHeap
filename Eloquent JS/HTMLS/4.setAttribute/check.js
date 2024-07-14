let placePSLastToTheTop = () => {
    let paragrpgh = document.body.getElementsByTagName("p");
    console.log(paragrpgh);
    document.body.insertBefore(paragrpgh[2], paragrpgh[0]);
} 

let placeCarLastToTheTop = () => {
    let carousElArr = document.body.getElementsByClassName("carousel");
    console.log(carousElArr);
    console.log(carousElArr.length);
    document.body.insertBefore(carousElArr[carousElArr.length-1], carousElArr[0]);
}

let createAnotherCarEl = () => {
    let carousElArr = document.body.getElementsByClassName("carousel");

    const newCarouselElement = document.createElement("div");
    newCarouselElement.classList.add("carousel");
    const newCarouselElementP = document.createElement("p");
    const newPcontent = document.createTextNode("next");
    newCarouselElementP.appendChild(newPcontent);
    newCarouselElement.appendChild(newCarouselElementP);
    

    let lastCarouselElement = document.body.getElementsByClassName("carousel")[carousElArr.length-1];
    lastCarouselElement.after(newCarouselElement);
    //document.body.insertBefore(newCarouselElement, lastCarouselElement);
}