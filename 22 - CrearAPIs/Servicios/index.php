<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="WEB/css/estilos.css">
    <title>Api</title>
</head>
<body>
    <h1 class="titulo">API DE GESTIÓN DE SERVICIOS HOGAR</h1>
    <div class="contenedor">
        <div class="paneles">
            <div>
                <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerUsuario.php">API/ObtenerUsuario.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: GET</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li>No necesita</li>
                    </ul>
                    <h5 style="padding-bottom: 7%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Lista de personas:</h5>
                        <pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Documento": 101010,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Nombre": "Felipe",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Apellido": "Ruiz",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Correo": "felipe1222@gmail.com",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Telefono": 301223233,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Direccion": "Dosquebradas"<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Documento": 221212,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Nombre": "Sofia",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Apellido": "Giraldo",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Correo": "sofi19@gmail.com",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Telefono": 300000202,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Direccion": "Medellin"<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;]</pre>
                    </div>
                </div>
            </div>
            <div>
            <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ObtenerServicio.php">API/ObtenerServicio.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: GET</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li>No necesita</li>
                    </ul>
                    <h5 style="padding-bottom: 7%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Lista de Servicios:</h5>
                        <pre>&nbsp;&nbsp;[<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"ID": 1,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Labor": "Aseo",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Descripcion": "Se hizo aseo general a toda la casa",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Valor": 30000,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"usuario": 102030<br>&nbsp;&nbsp;&nbsp;&nbsp;},<br>&nbsp;&nbsp;&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"ID": 2,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Labor": "Reparacion",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Descripcion": "Se arreglo el lavaplatos por fuga de agua",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Valor": 70000,<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"usuario": 102030<br>&nbsp;&nbsp;&nbsp;&nbsp;}<br>&nbsp;&nbsp;]</pre>
                    </div>
                </div>
            </div>
            <div>
                <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarUsuario.php">API/InsertarUsuario.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>int</b></i> Documento</li>
                        <li><i><b>String</b></i> Nombre</li>
                        <li><i><b>String</b></i> Apellido</li>
                        <li><i><b>String</b></i> Correo</li>
                        <li><i><b>int</b></i> Telefono</li>
                        <li><i><b>String</b></i> Direccion</li>
                    </ul>
                    <h5>Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Persona actualizada:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##PERSON##INSERT"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en actualizacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##PERSON##INSERT"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
            <div>
            <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/InsertarServicio.php">API/InsertarServicio.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>String</b></i> Labor</li>
                        <li><i><b>String</b></i> Descripcion</li>
                        <li><i><b>int</b></i> Valor</li>
                        <li><i><b>int</b></i> usuario</li>
                    </ul>
                    <h5 style="padding-bottom: 6%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Servicio actualizado:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##SERVI##INSERT"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en actualizacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##SERVI##INSERT"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
            <div>
                <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarUsuario.php">API/ActualizarUsuario.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>int</b></i> Documento</li>
                        <li><i><b>String</b></i> Nombre</li>
                        <li><i><b>String</b></i> Apellido</li>
                        <li><i><b>String</b></i> Correo</li>
                        <li><i><b>int</b></i> Telefono</li>
                        <li><i><b>String</b></i> Direccion</li>
                    </ul>
                    <h5>Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Persona actualizada:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##PERSON##UPDATE"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en actualizacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##PERSON##UPDATE"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
            <div>
            <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/ActualizarServicio.php">API/ActualizarServicio.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>int</b></i> id_servicio</li>
                        <li><i><b>String</b></i> Labor</li>
                        <li><i><b>String</b></i> Descripcion</li>
                        <li><i><b>int</b></i> Valor</li>
                        <li><i><b>int</b></i> usuario</li>
                    </ul>
                    <h5 style="padding-bottom: 3%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                        <h5>Servicio actualizado:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##SERVI##UPDATE"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en actualizacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##SERVI##UPDATE"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
            <div>
                <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarUsuario.php">API/EliminarUsuario.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>int</b></i> cedula</li>
                    </ul>
                    <h5 style="padding-bottom: 16%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                    <h5>Persona eliminada:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en eliminacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
            <div>
            <h4 style="margin-top: 10px;margin-bottom: 10px;">EndPoint: <span class="endpoint-name"> <a href="./API/EliminarServicio.php">API/EliminarServicio.php</a> </span></h4>
                <div class="detalleActualizar">
                    <h5>Metodo: POST</h5>
                    <h5>Parametros:</h5>
                    <ul class="input-list">
                        <li><i><b>int</b></i> id_servicio</li>
                    </ul>
                    <h5 style="padding-bottom: 16%;">Salida: JSON</h5>
                    <div class="cuadradoJSON">
                    <h5>Servicio eliminado:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": true,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "OK##DELETE"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en parametros:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DATOS##POST"<br>&nbsp;&nbsp;}</pre>

                        <h5>Error en eliminacion:</h5>
                        <pre>&nbsp;&nbsp;{<br>&nbsp;&nbsp;&nbsp;&nbsp;"status": false,<br>&nbsp;&nbsp;&nbsp;&nbsp;"message": "ERROR##DELETE"<br>&nbsp;&nbsp;}</pre>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</body>
</html>