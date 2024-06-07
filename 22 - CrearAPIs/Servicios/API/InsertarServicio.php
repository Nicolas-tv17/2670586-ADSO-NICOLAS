<?php
    include "DB/Conexion.php";

    if(!empty($_POST['Labor']) and !empty($_POST['Descripcion']) and !empty($_POST['Valor']) and !empty($_POST['usuario'])){

        $labor = $_POST['Labor'];
        $descripcion = $_POST['Descripcion'];
        $valor = $_POST['Valor'];
        $user = $_POST['usuario'];

        try {
            $consulta = $base_datos->prepare("INSERT INTO servicio ( Labor, Descripcion, Valor, usuario) VALUES(:lav, :dep, :val, :usr) ");
            $consulta->bindParam(':lav', $labor);
            $consulta->bindParam(':dep', $descripcion);
            $consulta->bindParam(':val', $valor);
            $consulta->bindParam(':usr', $user);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##SERVI##INSERT#TRUE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##SERVI##INSERT#FALSE"
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