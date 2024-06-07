let contenedorBotones;
let nombrepoke;
let imagenpoke;
let paginador;
let iniciar;
let paginaActual = "https://pokeapi.co/api/v2/pokemon";

window.onload = function(){
    paginador = document.getElementById("paginador");
    contenedorBotones = document.getElementById("contenedorBotones");
    nombrepoke = document.getElementById("nombrepoke");
    imagenpoke = document.getElementById("imagenpoke");
    iniciar = document.getElementById("iniciar");

    verificarConexion();

    window.addEventListener('offline', function(e) {
        document.getElementById("mensajeNoInternet").style.display = "block";
        contenedorBotones.innerHTML = "";
        paginador.innerHTML = "";
    });

    window.addEventListener('online', function(e) {
        document.getElementById("mensajeNoInternet").style.display = "none";
        consumoAPI();
        paginar();
    });
}

function verificarConexion() {
    if (!navigator.onLine) {
        document.getElementById("mensajeNoInternet").style.display = "block";
    }
}

function paginar(){
    let botonuno = `<button onclick="atras()" class="paginadores">ATRAS</button>
                    <button onclick="siguiente()" class="paginadores">SIGUIENTE</button>`;

    paginador.innerHTML = botonuno;
    consumoAPI();
    iniciar.innerHTML = "";
}

function siguiente(){
    fetch (paginaActual).then(respuesta => respuesta.json()).then(data=>{
        paginaActual = data.next;
        pasar(paginaActual);
    });
}

function atras(){
    let paginaAnterior = paginaActual;
    
    fetch(paginaActual).then(respuesta => respuesta.json()).then(data => {
        if(data.previous !== null){
            paginaActual = data.previous;
            pasar(paginaActual);
        } else {
            alert("No hay pokemones previos");
        }
    })
}

function pasar(pagina){
    let urlContrada = pagina;
    
    fetch (urlContrada).then(respuesta => respuesta.json()).then(data=>{
        contenedorBotones.innerHTML = "";
        for(let i = 0; i < data.results.length; i++){
            let temporal = `<div>
                                <button onclick="mostrarPokemon('${data.results[i].url}')" class="botonesJS">${data.results[i].name}</button>
                            </div>`;

            contenedorBotones.innerHTML += temporal;
        }
    });
}

function consumoAPI() {
    fetch (paginaActual).then(respuesta => respuesta.json()).then(data=>{
        contenedorBotones.innerHTML = "";
        for(let i = 0; i < data.results.length; i++){
            let temporal = `<div>
                                <button onclick="mostrarPokemon('${data.results[i].url}')" class="botonesJS">${data.results[i].name}</button>
                            </div>`;

            contenedorBotones.innerHTML += temporal;
        }
    });
}

function mostrarPokemon(endpoint){
    fetch(endpoint).then(respuesta => respuesta.json()).then(data =>{
        nombrepoke.innerHTML = data.name;
        imagenpoke.src = data.sprites.other.dream_world.front_default;
    });
}
