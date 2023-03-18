create database db_notebook;
use db_notebook;

CREATE TABLE notes(
	id int primary key not null auto_increment,
    author varchar(25),
    title varchar(50),
    text_value text
    );
    
insert into notes(author, title, text_value) values ('John Snow', 'Game of Thrones', 'Winter is coming...');
insert into notes(author, title, text_value) values ('Gendalf Gray', 'Lord of the Ring', 'You shall not pass...');
insert into notes(author, title, text_value) values ('Dart Vader', 'Star Wars', 'Luke, I am Your Father...');
insert into notes(author, title, text_value) values ('Bruce Wayne', 'Batman', 'Do you want to know my secret identity?');

select * from notes;