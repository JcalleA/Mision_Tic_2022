let Pantalla=document.getElementById('Pantalla');
function funcion_7(){
    Pantalla.innerHTML+='7'
}
function funcion_8(){
    Pantalla.innerHTML+='8'
}
function funcion_9(){
    Pantalla.innerHTML+='9'
}
function funcion_6(){
    Pantalla.innerHTML+='6'
}
function funcion_5(){
    Pantalla.innerHTML+='5'
}
function funcion_4(){
    Pantalla.innerHTML+='4'
}
function funcion_C(){
    Pantalla.innerHTML=''
}
function funcion_3(){
    Pantalla.innerHTML+='3'
}
function funcion_2(){
    Pantalla.innerHTML+='2'
}
function funcion_1(){
    Pantalla.innerHTML+='1'
}
function funcion_div(){
    Pantalla.innerHTML+='/'
}
function funcion_mas(){
    Pantalla.innerHTML+='+'
}
function funcion_menos(){
    Pantalla.innerHTML+='-'
}
function funcion_por(){
    Pantalla.innerHTML+='*'
}
function funcion_punto(){
    Pantalla.innerHTML+='.'
}
function funcion_0(){
    Pantalla.innerHTML+='0'
}

function funcion_igual(){
    Pantalla.innerHTML=eval(Pantalla.innerHTML);
    if(Pantalla.innerHTML.length>8){
        Pantalla.innerHTML=eval(Pantalla.innerHTML).toFixed(8);
    }
}