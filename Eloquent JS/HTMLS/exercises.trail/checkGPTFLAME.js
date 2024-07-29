 function start(number_of_stars){
    document.addEventListener('mousemove', (e) => {
      const flame = document.createElement('div');
      flame.className = 'flame';
      flame.style.left = `${e.clientX}px`;
      flame.style.top = `${e.clientY}px`;
      
      document.querySelector('.container').appendChild(flame);
      
      setTimeout(() => {
          flame.remove();
      }, 1000); // matches the duration of the CSS fadeOut animation
  });
}

  

window.onload = start(50);


