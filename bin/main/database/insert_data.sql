use springboot;

insert into role(code,name) values('ADMIN','Quản lý');
insert into role(code,name) values('USER','Người dùng');

insert into user(username,password,fullname,status) values('admin','$2a$10$AE5CmPiix7QQ9NCA41xhRu5Au4PmXrzAvnFK8kdGWhIMOsy4lTw2m','Đỗ Minh Hiếu',1);
insert into user(username,password,fullname,status) values('usera','$2a$10$AE5CmPiix7QQ9NCA41xhRu5Au4PmXrzAvnFK8kdGWhIMOsy4lTw2m','Nguyễn Văn A',1);
insert into user(username,password,fullname,status) values('userb','$2a$10$AE5CmPiix7QQ9NCA41xhRu5Au4PmXrzAvnFK8kdGWhIMOsy4lTw2m','Nguyễn Văn B',1);

INSERT INTO user_role(userid,roleid) VALUES (1,1);
INSERT INTO user_role(userid,roleid) VALUES (2,2);
INSERT INTO user_role(userid,roleid) VALUES (3,2);

INSERT INTO category(name,code) VALUES ('Thời sự', 'thoi-su');
INSERT INTO category(name,code) VALUES ('Thể thao', 'the-thao');
INSERT INTO category(name,code) VALUES ('Chính trị', 'chinh-tri');
INSERT INTO category(name,code) VALUES ('Thế giới', 'the-gioi');
