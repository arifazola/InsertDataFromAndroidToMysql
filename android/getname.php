<?php
include 'config.php';

// $jsonresult = array();

// if($_SERVER['REQUEST_METHOD'] === 'POST'){
//     // $data = file_get_contents('php://input');
//     $query = mysqli_query($connection, "Select * From user");

//     while($result = mysqli_fetch_array($query)){
//         // $jsonresult['id'] = $result[0];
//         // $jsonresult['nama'] = $result[1];
//         // echo json_encode($jsonresult);
//         $jsonresult['id'] = $result[0];
//         $jsonresult['name'] = $result[1];
//         echo json_encode($jsonresult);
//     }

    

// }

$data = [];
$response['result'] = array();

$query = $connection->query("SELECT name FROM `user`;");
//$num_of_row = $query->fetchColumn();
$response['error'] = false;
$response['message'] = "Successfully get data";
while($row = $query->fetch()){
    $y['name'] = $row['name'];
    array_push($response['result'], $y);
}
array_push($data,$response);

echo json_encode($response);




?>