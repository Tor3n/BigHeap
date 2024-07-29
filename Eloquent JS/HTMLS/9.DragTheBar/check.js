let start = () => {
  let lastX; // Tracks the last observed mouse X position
  let bar = document.querySelector("div");

  bar.addEventListener("mousedown", event => {
    if (event.button == 0) {
      lastX = event.clientX;
      window.addEventListener("mousemove", moved);
      event.preventDefault(); // Prevent selection
    }
  });

  function moved(event) {
    if (event.buttons == 0) {
      //event.buttons == 0 means no buttons are down
      window.removeEventListener("mousemove", moved);
      console.log("removed");
    } else {
      let dist = event.clientX - lastX;
      let newWidth = Math.max(10, bar.offsetWidth + dist);
      bar.style.width = newWidth + "px";
      lastX = event.clientX;
    }
  }
}

window.onload = start ;



 