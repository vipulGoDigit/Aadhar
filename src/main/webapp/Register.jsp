<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f0f5f9;
    }

    header {
        background-color: #0f2d57;
        color: #ffffff;
        text-align: center;
        padding: 20px;
    }

    h1 {
        margin: 0;
        font-size: 30px;
    }

    .container {
        max-width: 600px;
        margin: 20px auto;
        background-color: #ffffff;
        padding: 30px;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    label {
        display: block;
        font-size: 18px;
        color: #333333;
        margin-bottom: 10px;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #cccccc;
        border-radius: 3px;
        font-size: 16px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #0f2d57;
        color: #ffffff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 18px;
    }

    input[type="submit"]:hover {
        background-color: #0b203e;
    }
</style>
</head>
<body>
    <header>
        <h1>Registration Page</h1>
    </header>

    <div class="container">
        <form action="Register" method="post">
            <label for="aadhar_no">Aadhar Number:</label>
            <input type="text" id="aadhar_no" name="aadhar_no" required>

            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="phoneNo">Phone No:</label>
            <input type="text" id="phoneNo" name="phoneNo" required>

            <label for="education">Education:</label>
            <input type="text" id="education" name="education" required>

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>

            <label for="fatherName">Father Name:</label>
            <input type="text" id="fatherName" name="fatherName" required>

            <input type="submit" value="Register">
        </form>
   
