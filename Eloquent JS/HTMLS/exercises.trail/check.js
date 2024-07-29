 function start(number_of_stars){
  let previousdotMove=[];
  window.addEventListener("mousemove",   event => {
      console.log(previousdotMove.length); 


      let dot = document.createElement("div");
      dot.className = "star";
      dot.style.left = (event.pageX - 4) + "px";
      dot.style.top = (event.pageY - 4) + "px";
      previousdotMove.push(dot);
      document.body.appendChild(dot);

      setTimeout(() => {
        dot.remove();
        let elem = previousdotMove.shift();
    }, 1000); // matches the duration of the CSS fadeOut animation


  });




  
  window.addEventListener("click", async event => {
    
    
    await Promise.resolve(setTimeout((a) => {
      console.log("clicked");
    }, 3000)) ;
 
      
    console.log(previousdotMove);
  });
}

 

  async function removeElemAS(list){
    
    let elem = list.shift();
    if(elem!=null){
      document.body.removeChild(elem);
      console.log("removedAS "+list);
      await Promise.resolve(setTimeout((a) => {
        removeElemAS(list);
      }, 500)) ;
    }
    
  }


window.onload = start(50);


