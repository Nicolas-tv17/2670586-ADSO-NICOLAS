let contenedorprincipal;
let contenedorPokemones;
let nombre;
let imagen;

window.onload = function(){
    contenedorprincipal = document.getElementById("contenedorPrincipal");
    contenedorPokemones = document.getElementById("contenedorPokemones");
    nombre = document.getElementById("nombre");
    imagen = document.getElementById("imagen");
}

function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";

    //Consumo - AJAX
    fetch( endpoint ).then( respuesta => respuesta.json() )
    .then( data => { 
        //Codigo para ejecutar en caso de tener el JSON como respuesta de la API
        contenedorprincipal.innerHTML = "";
        for (let i = 0; i < data.results.length; i++){

            let html_temp = `<div>
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${data.results[i].name} </button>
                            </div> `;

            contenedorprincipal.innerHTML += html_temp;
        }

    } );
}

function cargarDetalle(endpoint){
    let actual = endpoint;

    fetch (actual).then(respuesta => respuesta.json()).then(data => {
        nombre.innerHTML = data.name;
        imagen.src = data.sprites.other.dream_world.front_default;
    });
}