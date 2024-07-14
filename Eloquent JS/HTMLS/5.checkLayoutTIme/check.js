 
let findByID = () => {
    let elID = document.getElementById("someID");
    console.log(elID);
}

let checktime =() =>{

    function time(name, action) {
        let start = Date.now(); // Current time in milliseconds
        action();
        console.log(name, "took", Date.now() - start, "ms");
    }

    time("naive", () => {
        let target = document.getElementById("one");

        console.log("offset: "+target.offsetWidth);

        while (target.offsetWidth < 2000) {
            target.appendChild(document.createTextNode("X"));
            console.log("offset: "+target.offsetWidth);
        }
    });

    time("clever", function() {
        let target = document.getElementById("two");
        target.appendChild(document.createTextNode("XXXXX"));
        let total = Math.ceil(2000 / (target.offsetWidth / 5));
        target.firstChild.nodeValue = "X".repeat(total);
    }); 

}






