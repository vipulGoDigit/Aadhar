<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Aadhar Number</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f5f9;
        margin: 0;
        padding: 0;
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
        max-width: 400px;
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

    .select-message {
        text-align: center;
        color: #0f2d57;
        font-size: 24px;
        margin-top: 20px;
    }
</style>
</head>
<body>
    <header>
        <h1>Select Aadhar Number</h1>
    </header>

    <div class="container">
        <form action="select">
            <label for="adh_no">Enter Aadhar Number:</label>
            <input type="text" id="adh_no" name="adh_no" required>
            <input type="submit" value="Select">
        </form>
    </div>

   
</body>
</html>
