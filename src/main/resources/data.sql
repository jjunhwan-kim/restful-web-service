
insert into user(id, join_date, name, password, ssn) values(10001, sysdate(), 'User1', 'test1111', '701010-1111111');
insert into user(id, join_date, name, password, ssn) values(10002, sysdate(), 'User2', 'test2222', '801010-2222222');
insert into user(id, join_date, name, password, ssn) values(10003, sysdate(), 'User3', 'test3333', '901010-1111111');

insert into post(id, description, user_id) values(10001, 'My first post', 10001);
insert into post(id, description, user_id) values(10002, 'My second post', 10001);