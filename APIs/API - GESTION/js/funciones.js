let listaPersonas;
let datos;
let tabladatos;
let editar;
let eliminar;
let cedula;
let guardar;
let nombres;
let apellidos;
let telefono;
let direccion;
let email;
let formularioPersona;
let apis = "https://codetesthub.com/"

window.onload = function(){
    listaPersonas = document.getElementById("listaPersonas");
    datos = document.getElementById("datos");
    tabladatos = document.getElementById("tabladatos");
    cedula = document.getElementById("cedula");
    nombres = document.getElementById("nombres");
    apellidos = document.getElementById("apellidos");
    telefono = document.getElementById("telefono");
    direccion = document.getElementById("direccion");
    email = document.getElementById("email");
    editar = document.getElementById("editar");
    eliminar = document.getElementById("eliminar");
    formularioPersona = document.getElementById("formularioPersona");
    guardar = document.getElementById("guardar");
}

function obtenerDatos(){
    url = "https://codetesthub.com/API/Obtener.php";
    datos.innerHTML = "";
    fetch(url).then(respuesta => respuesta.json()).then(data =>{
        for(let i = 0; i < data.length;i++){
            datos.innerHTML += `<td>${data[i].cedula}</td>`+
                                `<td>${data[i].nombres}</td>`+
                                `<td>${data[i].apellidos}</td>`+
                                `<td>${data[i].telefono}</td>`+
                                `<td>${data[i].direccion}</td>`+
                                `<td>${data[i].email}</td>`+
                                `<td>${data[i].foto}</td>`+
                                `<td><button onclick="actualizar(${data[i].cedula})" class="botoneditar">Editar</button></td>`+
                                `<td><button onclick="eliminarpersona(${data[i].cedula})" class="botoneliminar">Eliminar</button></td>`;
        }
    })
}

function cancelar(){
    formularioPersona.style.display = 'none';
}

function insertaPersona(){
    formularioPersona.style.display = 'block';
}

function guardarPersona(){
    let datos = new FormData();

    datos.append("cedula", parseInt(cedula.value));
    datos.append("nombres", nombres.value);
    datos.append("apellidos", apellidos.value);
    datos.append("telefono", telefono.value);
    datos.append("direccion", direccion.value);
    datos.append("email", email.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Insertar.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha ingresado con exito.");
        }else{
            alert("No se pudo insertar");
        }
    });
    cedula.value = "";
    nombres.value = "";
    apellidos.value = "";
    telefono.value = "";
    direccion.value = "";
    email.value = "";
    formularioPersona.style.display = 'none';

}

function actualizar(documento){
    let cedu = documento;
    formularioPersona.style.display = 'block';
    cedula.value = parseInt(cedu);
    document.getElementById("cedula").readOnly = true;
    guardar.removeAttribute('onclick');
    guardar.setAttribute('onclick',"actualizarPersona("+cedu+")")
}

function actualizarPersona(cedu){
    let datos = new FormData();
    datos.append("cedula", cedula.value);
    datos.append("nombres", nombres.value);
    datos.append("apellidos", apellidos.value);
    datos.append("telefono", telefono.value);
    datos.append("direccion", direccion.value);
    datos.append("email", email.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Actualizar.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha actualizado el registr0");
        }else{
            alert("No se pudo actualizar");
        }
    });
    cedula.value = "";
    nombres.value = "";
    apellidos.value = "";
    telefono.value = "";
    direccion.value = "";
    email.value = "";
    formularioPersona.style.display = 'none';

}

function eliminarpersona(cedula){
    let datos = new FormData();

    datos.append("cedula",cedula);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("https://codetesthub.com/API/Eliminar.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha Eliminado.");
        }else{
            alert("No se pudo eliminar");
        }
    });

    formularioPersona.style.display = 'none';
}