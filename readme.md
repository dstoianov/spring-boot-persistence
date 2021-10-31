# Getting Started

### Reference Documentation


### Create DB



```mysql
show databases;
select * from mysql.user;
create database db_persistence CHARACTER SET utf8;
create user 'persistence'@'%' identified by 'persistence123';
GRANT ALL PRIVILEGES ON db_persistence.* to 'persistence'@'%';

create user 'liquibase_user'@'%' identified by 'liquibase_user_321';
GRANT ALL PRIVILEGES ON db_persistence.* to 'liquibase_user'@'%';

FLUSH PRIVILEGES;
```