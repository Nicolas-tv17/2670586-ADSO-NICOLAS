let documento, nombre, apellido, correo, telefono, direccion;
let datos, formularioPersona;
let editar, eliminar;
let tabladatos;

window.onload = function(){
    tabladatos = document.getElementById("tabladatos");
    
    documento = document.getElementById("documento");
    nombre = document.getElementById("nombre");
    apellido = document.getElementById("apellido");
    correo = document.getElementById("correo");
    telefono = document.getElementById("telefono");
    direccion = document.getElementById("direccion");
    
    editar = document.getElementById("editar");
    eliminar = document.getElementById("eliminar");
    
    datos = document.getElementById("datos");
    formularioPersona = document.getElementById("formularioPersona");
}

function obtenerDatos(){
    url = "http://localhost/Servicios/API/ObtenerUsuario.php";
    fetch(url).then(respuesta => respuesta.json()).then(data =>{
        for(let i = 0; i < data.length;i++){
            datos.innerHTML += `<td>${data[i].Documento}</td>`+
                                `<td>${data[i].Nombre}</td>`+
                                `<td>${data[i].Apellido}</td>`+
                                `<td>${data[i].Correo}</td>`+
                                `<td>${data[i].Telefono}</td>`+
                                `<td>${data[i].Direccion}</td>`+
                                `<td><button onclick="actualizar(${data[i].Documento})" class="botoneditar">Editar</button></td>`+
                                `<td><button onclick="eliminarpersona(${data[i].Documento})" class="botoneliminar">Eliminar</button></td>`;
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

    datos.append("Documento", documento.value);
    datos.append("Nombre", nombre.value);
    datos.append("Apellido", apellido.value);
    datos.append("Correo", correo.value);
    datos.append("Telefono", telefono.value);
    datos.append("Direccion", direccion.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/InsertarUsuario.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha ingresado con exito.");
        }else{
            alert("No se pudo insertar");
        }
    });
    documento.value = "";
    nombre.value = "";
    apellido.value = "";
    correo.value = "";
    telefono.value = "";
    direccion.value = "";
    formularioPersona.style.display = 'none';

}

function actualizar(p_documento){
    let cedula = p_documento
    console.log("cedula :"+cedula)
    documento.value = cedula;
    formularioPersona.style.display = 'block';
    guardar.removeAttribute('onclick');
    guardar.setAttribute('onclick',"actualizarUsuario("+cedula+")");
}

function actualizarUsuario(cedula){
    let datos = new FormData();

    datos.append("Documento", cedula);
    datos.append("Nombre", nombre.value);
    datos.append("Apellido", apellido.value);
    datos.append("Correo", correo.value);
    datos.append("Telefono", telefono.value);
    datos.append("Direccion", direccion.value);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/ActualizarUsuario.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
        console.log(data);
        if(data.status = true){
            alert("Se ha actualizado el registr0");
        }else{
            alert("No se pudo actualizar");
        }
    });
    documento.value = "";
    nombre.value = "";
    apellido.value = "";
    correo.value = "";
    telefono.value = "";
    direccion.value = "";
    formularioPersona.style.display = 'none';

}

function eliminarpersona(p_documento){
    let datos = new FormData();

    datos.append("Documento",p_documento);

    let configuracion = {
        method: "POST",
        headers: {
            "Accept": "application/json",
        },
        body: datos
    };

    fetch("http://localhost/Servicios/API/EliminarUsuario.php", configuracion).then(respuesta => respuesta.json()).then(data =>{
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