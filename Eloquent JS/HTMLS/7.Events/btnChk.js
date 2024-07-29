let start2 = () =>{

  let textValue = document.getElementsByClassName("getClasss")[0];
  
  console.log("what in a textField: "+textValue);
  textValue.addEventListener("click", (e) => {
    console.log("button pressed");
    console.log(e);
  });

      textValue.addEventListener("mousedown", event => {
      if (event.button == 0) {
        console.log("Left button");
      } else if (event.button == 1) {
        console.log("Middle button");
      } else if (event.button == 2) {
        console.log("Right button");
      }
    });
}

window.onload = start2 ;

 

  


 