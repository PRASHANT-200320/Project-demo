

let gameseq = [];
let userseq = [];

let btns = ["red", "yellow", "green", "purple"];

let started = false;
let level = 0;
let highScore = 0;

let h2 = document.querySelector("h2");


document.addEventListener("keydown", function (event) {
    if (started == false) {
       console.log("Game is started");
       started = true;

       levelup();
    }
});


function gameFlash(btn){
    btn.classList.add("flash");
    setTimeout(function () {
        btn.classList.remove("flash");
    }, 150);
}



function userFlash(btn){
    btn.classList.add("userflash");
    setTimeout(function () {
        btn.classList.remove("userflash");
    }, 100);
}


function levelup(){
    userseq = [];
    level++;
    h2.innerText = `Level ${level}`;
    document.getElementById("current-score").innerText = `Current Score: ${level}`;

    if (level > highScore) {
        highScore = level; // Update the high score if the current level exceeds it
        document.getElementById("high-score").innerText = `High Score: ${highScore}`;
    }



    let randIdx = Math.floor(Math.random() * 4);
    let randColor = btns[randIdx];
    let randbtn = document.querySelector(`.${randColor}`);
    gameseq.push(randColor);
    console.log(gameseq);
    gameFlash(randbtn);

}


function checkAns(idx){

    if(userseq[idx] === gameseq[idx]){
        if(userseq.length == gameseq.length){
            setTimeout(levelup, 1000);
        }
    }else{
        h2.innerHTML = `Game Over! Your score was <b>${level}</b> <br> Press Any Key to Restart.`;
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout(function () {
            document.querySelector("body").style.backgroundColor = "white";
        }, 100);
        reset();
    }
}



function btnpress(){
    let btn = this;
    userFlash(btn);

    usercolor = btn.getAttribute("id");
    userseq.push(usercolor);

    checkAns(userseq.length-1);
}

let allbtns = document.querySelectorAll(".btn");
for(let btn of allbtns){
    btn.addEventListener("click", btnpress);
}



function reset(){
    started = false;
    level = 0;
    gameseq = [];
    userseq = [];
    document.getElementById("current-score").innerText = `Current Score: 0`;
}