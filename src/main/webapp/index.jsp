<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to E-aadhar</title>
<style>
   body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f5f5f5;
        }


  header {
            background-color: #003a6e;
            color: #ffffff;
            text-align: center;
            padding: 20px;
        }


    h1 {
        margin: 0;
        font-size: 30px;
    }

    .button-container {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        gap: 20px;
        margin-top: 30px;
    }

    .button {
        background-color: #ffffff;
        width: 200px;
        height: 70px;
        border-radius: 25px;
        display: flex;
        align-items: center;
        justify-content: center;
        text-decoration: none;
        color: #003a6e;
        font-size: 20px;
        font-weight: bold;
        border: 2px solid #008080;
        transition: background-color 0.3s ease;
    }

    .button:hover {
        background-color: #003a6e;
        color: #f5f5f5;
    }
            footer {
            background-color: #003a6e;
            color: #ffffff;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            left: 0;
            right: 0;
        }
</style>
</head>
<body>
    <header>
        <h1>Welcome to E-aadhar</h1>
    </header>

    <div class="button-container">
        <a class="button" href="Register.jsp">Register</a>
        <a class="button" href="update.jsp">Update</a>
        <a class="button" href="delete.jsp">Delete</a>
        <a class="button" href="select.jsp">Select</a>
    </div>
    
     <footer>
        © 2023 e-Aadhaar Portal. All rights reserved.
    </footer>
</body>
</html>
