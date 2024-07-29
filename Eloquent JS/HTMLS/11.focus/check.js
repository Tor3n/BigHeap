let start = () => {
  let help = document.querySelector("#help");
  let fields = document.querySelectorAll("input");
  for (let field of Array.from(fields)) {
    field.addEventListener("focus", event => {
      let text = event.target.getAttribute("data-help");
      help.textContent = text;
    });

    field.addEventListener("blur", event => {
      help.textContent = "";
    });
  }
}

window.onload = start ;



 