<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aadhar Details</title>
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

    p {
        font-size: 18px;
        color: #333333;
        margin-bottom: 10px;
    }
</style>
</head>
<body>
    <header>
        <h1>Aadhar Details</h1>
    </header>

    <div class="container">
        <p>Aadhar Number: <%= session=request.getSession() %></p>
              AadharDetails p=(AadharDetails)session.getAttribute("ad");
              out.println(p.getAadhar_no()+ " " + p.getName) %>
    </div>
</body>
</html>
