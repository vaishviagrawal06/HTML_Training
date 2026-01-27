let canvas = document.querySelector("canvas")

let pen=canvas.getContext("2d")
pen.fillStyle ='yellow'
// pen.fillRect(0,0,30,30)
let cell=50;
let cellQ=[[0,0]]

document.addEventListener("keydown",)

function draw(){

    pen.clearRect(0,0,1000,600)
    for(let i of cellQ){
        pen.fillRect(i[0],i[1],cell,cell)
    }
}

function update(){
    let x= cellQ[cellQ.length-1][0]
    let y= cellQ[cellQ.length-1][1]

    let newX= x+cell
    let newY=y
  cellQ.push([newX,newY])
    cellQ.shift()

}
setInterval(()=>{
    draw()
    update()
},500)

