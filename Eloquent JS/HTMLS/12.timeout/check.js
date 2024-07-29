let start = () => {
  let textarea = document.querySelector("textarea");
 
  textarea.addEventListener("input", () => {
    console.log('tt');
  });

  let inputwithdelay = document.querySelector("input");
  let timeout;

  inputwithdelay.addEventListener("input", () => {
    clearTimeout(timeout);
    timeout = setTimeout(() => console.log("Typed!"), 500);
  });
}

window.onload = start;



 