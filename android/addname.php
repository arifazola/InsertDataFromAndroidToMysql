<?php

include 'config.php';


if($_SERVER['REQUEST_METHOD'] === 'POST'){
    $data = file_get_contents('php://input');
    $json_data = json_decode($data, true);
    @$json_name = $json_data['name'];
    if($data ="" || empty($json_name)){
        $response['error'] = true;
        $response['message'] = "No Json";
    }else{
    $name = $_POST['name'];
    $query = mysqli_query($connection,"INSERT INTO user (name) VALUES ('$json_name')");
    if($query){
        $response['error'] = false;
        $response['message'] = "Successfully added name to database";
    }else{
        $response['error'] = true;
        $response['message'] = "Could not add data to database";
    }
}
}else{
    $response['error'] = true;
    $response['message'] = "Invalid Request Method";
}

echo json_encode($response);