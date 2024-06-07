<?php
    include "DB/Conexion.php";

    $consulta = $base_datos->query("SELECT *  FROM usuario");
    $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);

    $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");

    echo json_encode($datos);

?>