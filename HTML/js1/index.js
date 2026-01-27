let canvas = document.querySelector("canvas")

let pen=canvas.getContext("2d")
pen.fillStyle ='yellow'
// pen.fillRect(0,0,30,30)
let cell=50;
let cellQ=[[0,0]]

function draw(){
    for(let i of cellQ){
        pen.fillRect(i[0],i[i],cell,cell)
    }
}