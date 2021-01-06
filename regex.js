!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="regex" content="ALL about regex">
    <title>Regex</title>
</head>
<body>
    <script>
        let str="This is the sample sentence";
        let p=/this [a-k]s t{0,1}he (sample){1}/gi
        let result=p.exec(str);
        let m=/t.i/i
        let msult=m.exec(str)
        console.log(result)
        console.log(msult)
    </script>
</body>
</html>
