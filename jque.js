<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JQUERY COMPLETEt</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>

<body>
    <p>Hello World</p>
    <h1>Toggle up</h1>
</body>
<script>
    $("p").click(function () {
        console.log("you clicked on it")
        $("p").hide(3000)
        $("p").show(2000)
    });
    $("h1").toggle(3000)
    $("h1").toggle(3000)
</script>

</html>
