create table j_Member(
    id varchar2(200),
    password varchar2(200),
    name varchar2(200),
    email varchar2(200),
    mobile varchar2(20),
    type varchar2(1)
)
;

insert into j_member values ('admin', '1234', 'admin', null, null);

select * from j_member;

commit;


insert into j_member(id, password, name, email, mobile)
        values (?, ?, ?, ?, ?);



select id, password, name, email, mobile, type
  from j_member
 where id = '?'

update j_member
set id = ?,
    password = ?,
    name = ?,
    email = ?,
    mobile = ?,
    type = ?
where id = ?
;

update j_member set id = ?;

delete from j_member
where id = ?
;

select * from j_member;