<?php
    header("Content-Type: application/json");
    header("Access-Control-Allow-Origin: *");
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Header: Content-Type");

    $servidor = 'localhost';
    $usuario = 'root';
    $contrasena = '';
    $base_de_datos = 'servicios_hogar';

    try {
        $base_datos = new PDO("mysql:host=$servidor;dbname=$base_de_datos", $usuario, $contrasena);
    } catch (Exception $e) {
        echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
	   exit;
    }

?>