let start2 = () =>{

  //let textValue = document.getElementsByClassName("getClasss")[0];
  
  ///console.log("what in a textField: "+textValue);
  window.addEventListener("keydown", (e) => {
    console.log("key is pressed");
    console.log(e);
    if (e.key == "v") {
      document.body.style.background = "violet";
    }
  });

  window.addEventListener("keyup", event => {
    if (event.key == "v") {
    document.body.style.background = "";
    }
    });


}

window.onload = start2 ;

 

  


 