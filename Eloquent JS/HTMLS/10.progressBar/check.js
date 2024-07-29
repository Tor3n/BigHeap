let start = () => {
  document.body.appendChild(document.createTextNode("supercalifragilisticexpialidocious ".repeat(1000)));

  let bar = document.querySelector("#progress");

  window.addEventListener("scroll", () => {
  let max = document.body.scrollHeight - innerHeight;
  bar.style.width = `${(pageYOffset / max) * 100}%`;
  });
}

window.onload = start ;



 