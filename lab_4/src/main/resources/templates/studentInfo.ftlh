<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Информация о студенте</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="mt-5">Информация о студенте</h1>

    <!-- Форма для обновления данных студента -->
    <form action="/student" method="POST" class="mt-3">
        <input type="hidden" name="_method" value="put"> <!-- Имитация PUT-запроса -->
        <input type="hidden" name="id" value="${student.id}"> <!-- Имитация PUT-запроса -->
        <div class="form-group">
            <label for="name">Имя</label>
            <input type="text" class="form-control" id="name" name="name" value="${student.name}" required>
        </div>
        <div class="form-group">
            <label for="group">Группа</label>
            <input type="text" class="form-control" id="group" name="group" value="${student.group}" required>
        </div>
        <div class="form-group">
            <label for="speciality">Специальность</label>
            <input type="text" class="form-control" id="speciality" name="speciality" value="${student.speciality}" required>
        </div>
        <div class="form-group">
            <label for="course">Курс</label>
            <input type="number" class="form-control" id="course" name="course" value="${student.course}" required>
        </div>

        <button type="submit" class="btn btn-success">Обновить</button>
    </form>

    <!-- Форма для удаления студента -->
    <form action="/student/${student.id}" method="POST" class="mt-3">
        <input type="hidden" name="_method" value="delete"> <!-- Имитация DELETE-запроса -->
        <button type="submit" class="btn btn-danger">Удалить студента</button>
    </form>
   <h3> <a href="/student/all" class="btn btn-info btn-sm">Все студенты</a> </h3>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
