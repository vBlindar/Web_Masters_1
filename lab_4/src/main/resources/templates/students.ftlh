<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Список студентов</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">

    <h2 class="mb-4">Список всех студентов</h2>
    <h3 class="mb-4"><a href="/student/student-form" class="btn btn-info btn-sm">Добавить</a></h3>
    <table class="table table-striped table-bordered">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Имя</th>
            <th>Группа</th>
            <th>Специальность</th>
            <th>Курс</th>
            <th>Действия</th>
        </tr>
        </thead>
        <tbody>
        <#list students as student>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.group}</td>
                <td>${student.speciality}</td>
                <td>${student.course}</td>
                <td>
                    <a href="/student/${student.id}" class="btn btn-info btn-sm">Просмотр</a>
                    <form action="/student/${student.id}" method="POST">
                        <input type="hidden" name="_method" value="delete">
                        <button type="submit" class="btn btn-danger">Удалить студента</button>
                    </form>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
