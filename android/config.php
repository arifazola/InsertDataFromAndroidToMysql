<?php

$host = "localhost";
$username = "root";
$password = "";
$database = "android";

$connection = mysqli_connect($host,$username,$password,$database);

if(!$connection){
    echo "Failed to connect to Mysql ". mysqli_connect_error();
}

$response = array();

// if($_GET['api']){
//     if($_GET['api'] == "getname"){
//             $query = mysqli_query($connection,"SELECT name FROM user");
//             $fetch = mysqli_fetch_array($query);
//             if($query){
//                 $response['error'] = false;
//                 $response['message'] = "Showing all name";
//             }else{
//                 $response['error'] = true;
//                 $response['message'] = "Could not get list of name";
//             }
//     }elseif($_GET['api'] == "addname"){

            
//         }

// }else{
//     $response['error'] = true;
//     $repsonse['message'] = "Missing Parameters";
// }

?>