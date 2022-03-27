create table Questions
(
    id serial primary key,
    question_text varchar(255) not null
);

create table Answers
(
    id serial primary key,
    answer_text varchar(255) not null,
    question_id INTEGER REFERENCES Questions (id)
);

alter table Questions
add correct_answer_id INTEGER REFERENCES Answers (id);

insert into Questions (question_text) values
('Основные принципы объектно-ориентированного программирования? Обведите один вариант.'),
('Что такое первичный ключ (primary key)? Обведите один вариант.'),
('Современные веб-страницы включают в себя код на языке JavaScript. Где происходит исполнение этого кода? Обведите один вариант.');

insert into Answers (answer_text, question_id) values
('Интерфейс, класс, объект, свойства, методы', 1),
('Абстракция, инкапсуляция, наследование, полиморфизм', 1),
('Private, protected, public', 1),
('Абстракция, Виртуализация, Перегрузка методов, Наследование', 1),
('Порядковый номер записи', 2),
('Связь двух таблиц в запросе', 2),
('Однозначно идентифицирует каждую запись в таблице', 2),
('Контроль доступа к таблице', 2),
('На веб-сервере', 3),
('На сервере приложений', 3),
('В веб-браузере', 3),
('В Java Virtual Machine в операционной системе пользователя', 3);

update Questions
set correct_answer_id = 2
where id = 1;

update Questions
set correct_answer_id = 7
where id = 2;

update Questions
set correct_answer_id = 11
where id = 3;
