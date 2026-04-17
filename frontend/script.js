document.getElementById("light").addEventListener("click", function(){
    document.body.className = "light";
})
document.getElementById("dark").addEventListener("click", function(){
    document.body.className = "dark";
})
document.getElementById("colorful").addEventListener("click", function(){
    document.body.className = "colorful";
})

//date
let today = new Date();
document.getElementById("date").innerText = today.toDateString();