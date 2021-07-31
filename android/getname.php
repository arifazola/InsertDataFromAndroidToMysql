<?php
include 'config.php';

$jsonresult = array();

if($_SERVER['REQUEST_METHOD'] === 'POST'){
    // $data = file_get_contents('php://input');
    $query = mysqli_query($connection, "Select * From user");

    while($result = mysqli_fetch_array($query)){
        // $jsonresult['id'] = $result[0];
        // $jsonresult['nama'] = $result[1];
        // echo json_encode($jsonresult);
        $jsonresult['id'] = $result[0];
        $jsonresult['name'] = $result[1];
        echo json_encode($jsonresult);
    }

    

}

?>