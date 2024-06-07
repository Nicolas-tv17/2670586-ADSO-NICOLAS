<?php 
    include 'DB/Conexion.php';

    if(!empty($_POST['Documento']) and !empty($_POST['Nombre']) and !empty($_POST['Telefono']) and !empty($_POST['Direccion'])){

        $documento = $_POST['Documento'];
        $nombre = $_POST['Nombre'];
        $apellido = $_POST['Apellido'];
        $correo = $_POST['Correo'];
        $telefono = $_POST['Telefono'];
        $direccion = $_POST['Direccion'];

        try {
            $consulta = $base_datos->prepare("UPDATE usuario SET Nombre=:nom, Apellido=:ape, Correo=:cor, Telefono=:tel, Direccion=:dir WHERE Documento = :doc ");

            $consulta->bindParam(':doc', $documento);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':ape', $apellido);
            $consulta->bindParam(':cor', $correo);
            $consulta->bindParam(':tel', $telefono);
            $consulta->bindParam(':dir', $direccion);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
