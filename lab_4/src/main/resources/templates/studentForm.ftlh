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
    <h3> <a href="/student/all" class="btn btn-info btn-sm">Все студенты</a> </h3>
    <h1 class="mt-5">Информация о студенте</h1>
    <form action="/student" method="POST" class="mt-3">
        <div class="form-group">
            <label for="name">Имя</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Введите имя" required>
        </div>
        <div class="form-group">
            <label for="speciality">Специальность</label>
            <input type="text" class="form-control" id="speciality" name="speciality" placeholder="Введите
            специальность" required>
        </div>
        <div class="form-group">
            <label for="group">Группа</label>
            <input type="text" class="form-control" id="group" name="group" placeholder="Введите группу" required>
        </div>
        <div class="form-group">
            <label for="speciality">Курс</label>
            <input type="number" min="1" class="form-control" id="course" name="course" placeholder="Введите курс" required>
        </div>
        <button type="submit" class="btn btn-primary">Отправить</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
