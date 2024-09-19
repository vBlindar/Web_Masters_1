<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Форма Студента</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Информация о студенте</h1>
    <form action="/index/submitForm" method="GET" class="mt-3">
        <div class="form-group">
            <label for="name">Имя</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Введите имя">
        </div>
        <div class="form-group">
            <label for="group">Группа</label>
            <input type="text" class="form-control" id="group" name="group" placeholder="Введите группу">
        </div>
        <div class="form-group">
            <label for="speciality">Специальность</label>
            <input type="text" class="form-control" id="speciality" name="speciality" placeholder="Введите специальность">
        </div>
        <button type="submit" class="btn btn-primary">Отправить</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
