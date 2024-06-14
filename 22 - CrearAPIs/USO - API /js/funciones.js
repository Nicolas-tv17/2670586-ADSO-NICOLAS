let listaPersonas;
let datos;
let tabladatos;
let editar;
let eliminar;
let id_servicio,labor,descripcion,valor,usuario;
let formularioPersona;

window.onload = function(){
    listaPersonas = document.getElementById("listaPersonas");
    datos = document.getElementById("datos");
    tabladatos = document.getElementById("tabladatos");

    id_servicio = document.getElementById("id_servicio");
    labor = document.getElementById("labor");
    descripcion = document.getElementById("descripcion");
    valor = document.getElementById("valor");
    usuario = document.getElementById("usuario");
    
    editar = document.getElementById("editar");
    eliminar = document.getElementById("eliminar");
    formularioPersona = document.getElementById("formularioPersona");
}

function obtenerDatos(){
    url = "http://localhost/Servicios/API/ObtenerServicio.php";
    fetch(url).then(respuesta => respuesta.json()).then(data =>{
        for(let i = 0; i < data.length;i++){
            datos.innerHTML += `<td>${data[i].id_servicio}</td>`+
                                `<td>${data[i].Labor}</td>`+
                                `<td>${data[i].Descripcion}</td>`+
                                `<td>${data[i].Valor}</td>`+
                                `<td><a href="usuarios.html">${data[i].usuario}</a></td>`+
                                `<td><button onclick="actualizar(${data[i].id_servicio})" class="botoneditar">Editar</button></td>`+
                                `<td><button onclick="eliminarpersona(${data[i].id_servicio})" class="botoneliminar">Eliminar</button></td>`;
        }
    })
}


function cancelar(){
    formularioPersona.style.display = 'none';
}

function insertarServicio(){
    formularioPersona.style.display = 'block';
}

function guardarServicio(){
    let datos = new FormData();

    datos.append("Labor", labor.value);
    datos.append("Descripcion", descripcion.value);
    datos.append("Valor", valor.value);
    datos.append("usuario", usuario.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/InsertarServicio.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha ingresado con exito.");
        }else{
            alert("No se pudo insertar");
        }
    });
    labor.value = "";
    descripcion.value = "";
    valor.value = "";
    usuario.value = "";
    formularioPersona.style.display = 'none';

}

function actualizar(p_servicio){
    let servicio = p_servicio
    console.log("servicio :"+servicio)
    formularioPersona.style.display = 'block';
    guardar.removeAttribute('onclick');
    guardar.setAttribute('onclick',"actualizarPersona("+servicio+")");
}

function actualizarPersona(servicio){
    let datos = new FormData();
    datos.append("id_servicio", servicio);
    datos.append("Labor", labor.value);
    datos.append("Descripcion", descripcion.value);
    datos.append("Valor", valor.value);
    datos.append("usuario", usuario.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/ActualizarServicio.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha actualizado el registr0");
        }else{
            alert("No se pudo actualizar");
        }
    });
    labor.value = "";
    descripcion.value = "";
    valor.value = "";
    usuario.value = "";
    formularioPersona.style.display = 'none';

}

function eliminarpersona(id_servicio){
    let datos = new FormData();

    datos.append("id_servicio",id_servicio);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/EliminarServicio.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha Eliminado.");
        }else{
            alert("No se pudo eliminar");
        }
    });

    formularioPersona.style.display = 'none';
    alert("Por favor refresca la pagina para ver los cambios.")
}

obtenerDatos();