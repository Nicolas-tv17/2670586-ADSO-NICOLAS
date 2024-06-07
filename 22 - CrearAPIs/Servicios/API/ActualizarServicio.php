<?php 
    include 'DB/Conexion.php';

    if(!empty($_POST['id_servicio']) and !empty($_POST['Labor']) and !empty($_POST['Descripcion']) and !empty($_POST['Valor']) and !empty($_POST['usuario'])){

        $idServicio = $_POST['id_servicio'];
        $labor = $_POST['Labor'];
        $descripcion = $_POST['Descripcion'];
        $valor = $_POST['Valor'];
        $user = $_POST['usuario'];

        try {
            $consulta = $base_datos->prepare("UPDATE servicio SET Labor=:lab, Descripcion=:dep, Valor=:val, usuario=:usr WHERE id_servicio = :ids ");

            $consulta->bindParam(':ids', $idServicio);
            $consulta->bindParam(':lab', $labor);
            $consulta->bindParam(':dep', $descripcion);
            $consulta->bindParam(':val', $valor);
            $consulta->bindParam(':usr', $user);
            
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
