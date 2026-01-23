console.log("hello");

let btn = document.querySelector('button')
let body = document.querySelector('body')

btn.addEventListener("click",function(){
    if( body.style.backgroundColor==='lightblue'){
        body.style.backgroundColor='white';
    }
    else{

      body.style.backgroundColor='lightblue';  
    }
   
});