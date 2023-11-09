create database project

use project
go
 ----------------1 Student table------------------
create table Student(
stId int primary key identity(0,1),
stName varchar(45),
stpName varchar (45),
DprName varchar (45),
stAdr varchar (50),
curSem int,
stEmail nvarchar (25) not null unique,
stDob date,
stGender char,
stPhone bigint,
)

insert into Student values ('Faizan Bukhari','Ghafoor hussain shah','BCs','Hassan Abdal',4,'faizan7@gmail.com','2000-09-07','M',03097876342)
insert into Student values ('Ammad Saleem','M.Saleem','BCs','Attock',4,'ammad3@gmail.com','1999-02-09','M',03016834520)
insert into Student values ('Asad Ali','M.Basit','BCs','Fathejang',3,'asad1@gmail.com','1999-05-02','M',03012375640)
insert into Student values ('Abbas Ali','M.Kamran','BCs','D.I.Khan',3,'abbas0@gmail.com','1998-08-09','M',03010985640)
insert into Student values ('Zohaib','Zaheer Khan','BCE','Jand',2,'zohaib9@gmail.com','1997-06-02','M',03334598740)
insert into Student values ('Zanib','Zmeer Asghar','BBA','Lahore',1,'zanib5@gmail.com','2000-01-09','F',03128776543)

------------------2 Teacher table------------------
Create table Teacher(
TId int primary key identity(1,2),
TName varchar(45),
Tdept varchar (20),
TQualification varchar (30),
TGender char,
Tphone bigint,
Temail nvarchar(25) not null unique,
Date_of_joining date,
Salary money,
TAvailability bit,
) 

insert into Teacher values ('Mr.Waseem khan','CS','M.phil','M',051876543,'waseem2@gmail.com','2016-3-4',35000,1)
insert into Teacher values ('Mr.Shezad Rizwan','CE','MS.CE','M',051987643,'shezad6@gmail.com','2017-9-1',32000,1)
insert into Teacher values ('Mr.Yousaf marwat','BBA','MS.litrature','M',0518653212,'yousaf9@gmail.com','2018-1-7',30000,1)
insert into Teacher values ('Dr.Ali Imran','Math','Ph.d','M',0510987765,'aliimran1@gmail.com','2015-9-13',40000,1)
insert into Teacher(TName,Tdept,TQualification,TGender,Temail,TAvailability) values ('Sidra Nasim','CS','MS.Cs','F','sidra23@gmail.com',0)
    
	----------------defult constraint -------------
alter table Teacher add constraint zero_salary default 0 for Salary


---------------- 3 Admin ---------------
create table _Admin(
emID int primary key identity(1,1),
Employ varchar(45),
em_Position varchar(30),
em_dprt varchar(20)
)

insert into _Admin values('Dr.Muhammad Abdul Rehman','Director campus','Attock')
insert into _Admin values('Dr.Khalid Awan','HoD','CS')
insert into _Admin values('Usman Anwar','Coordinator','CS')
insert into _Admin values('Muhammad Awais','HoD','Mathematics')
insert into _Admin values('Dr. Saddam Hussain','HoD','BBA')
insert into _Admin values('Dr.Farmanullah','HoD','EE')
insert into _Admin values('Muhammad Faizan','Coordinator','EE')

 
------------------4 Offer Courses table------------------
Create table course(
crCode varchar(20) primary key, 	
crTitle varchar(35),
craditHour int,
T_Id int foreign key references Teacher(TId),--teacher name & availbility stuts
course_status bit,
em_id int foreign key references _Admin(emID)
)
insert into course values ('Db456','Database Systems',4,1,1,3)
insert into course values ('cskil345','Communication skill',3,5,1,3)
insert into course values ('Sec278','SEC',3,3,1,7)
insert into course values ('De0978','Diferential Equation',3,7,1,0)
insert into course values ('cA349','Computer Architechture',3,7,0,7)
insert into course(crCode,crTitle,craditHour,course_status,em_id) values ('oop79','OOP',4,1,3)


------------------5 registered course table------------------
create table Reg_course(
st_ID int foreign key references Student(stId),--student name
Course_Code varchar(20) foreign key references course(crCode),--course details 
)
insert into Reg_course values (0,'Db456')
insert into Reg_course values (3,'Sec278')
 

------------------6 Result table------------------
create table result( 
T_Id int foreign key references Teacher(TId),--Teacher Name
Course_Code varchar(20) foreign key references course(crCode),--for course title
st_ID int foreign key references Student(stId),--for student name
Total_marks float,
Obtain_Marks float,
GPA float,
)

select * from result

---->>>>>>>>>>> alter query for check constraints <<<<<<<<<<<----
alter table result add constraint ob_Marks check (Obtain_Marks < 21)
alter table result add constraint gpa check (GPA <= 4)

insert into result values(1,'Db456',0,20,18,3.7)
insert into result values(1,'Db456',1,20,17,3.6)
insert into result values(1,'Db456',2,20,14,3.1)
insert into result values(1,'Db456',5,20,10,2.0)

 
------------------7 Attendence ------------------
create table attendance(
st_ID int foreign key references Student(stId),--student name,deprt,semester
Attendence int,
_Date_ date,
)

insert into attendance values (1,78,'2020-11-07')
insert into attendance values (0,85,'2020-11-17')
insert into attendance values (2,89,'2020-12-03')
insert into attendance(st_ID) values (4)
insert into attendance values (5,97,'2020-12-26')

------------------8 Fee table------------------
create table Fee(
st_ID int foreign key references Student(stId),--student name,semester,deprt,
Payed_fee money,
Remaining money,
)

insert into Fee values (0,76500,0)
insert into Fee values (1,50000,25500)
insert into Fee values (2,25000,50500)
insert into Fee values (3,76500,0)
insert into Fee values (5,96000,0)


------------------9 Student login------------------
create table st_login(
login_stid int foreign key references Student(stId),
username varchar(45) Primary key,
St_password nvarchar(50), 
) 
insert into st_login values(0,'SyedFaizaN','expert@743')
insert into st_login values(1,'AmmadKinG','king#123')
------------------10 Teacher login------------------
create table em_login(
login_Tid int foreign key references Teacher(TId),
login_emId int foreign key references _Admin(emID),
username varchar(45) Primary key,
_password nvarchar(50), 
) 
insert into em_login(Login_Tid,username,_password) values(1,'SirWaseem','instructor')
insert into em_login(login_emId,username,_password) values(3,'CoUsman','checker123')

-----------------view Queries-----------------

select * from st_login
select * from em_login 

------+++++++++------for Admin detail------++++++++--------
Select * from _Admin 
Select * from _Admin where em_Position != 'HoD' and em_Position != 'Coordinator' 
select * from _Admin where em_Position = 'HoD'
select * from _Admin where em_Position = 'Coordinator'

--------------------admins view for students records------------------------

Select A.Employ,A.em_Position,A.em_dprt,S.* 
from _Admin as A right join Student as S
on A.emID = S.stId
order by DprName 
 
--------------------admins view for teachers records------------------------

select _Admin.Employ,_Admin.em_Position,_Admin.em_dprt,Teacher.*
from Teacher left join _Admin 
on _Admin.emID = Teacher.TId
order by Tdept

--------------------admins view for available courses-----------------------

select _Admin.Employ,_Admin.em_Position,_Admin.em_dprt,course.*
from _Admin right join course
on _Admin.emID = course.em_id


-----------------Student details-----------------

select * from Student ---details view overall
select * from Student where DprName = 'BCs'  ---dpartment of bcs
select * from Student where DprName = 'BCE'  ---dpartment of bce
select * from Student where DprName = 'BBA'  ---dpartment of bba
select * from Student where curSem = 1
select * from Student where curSem = 2
select * from Student where curSem = 3
select * from Student where curSem = 4

------++++++++-----Teacher details---+++++++++--------
select * from Teacher---teacher details view
select * from Teacher where TQualification = 'Ph.d' ---view of  Phd details
select * from Teacher where Salary < 35000  ---for salary less then 35k 
select * from Teacher where Salary = (select max(Salary) from Teacher) 
select * from Teacher where Salary = (select min(Salary) from Teacher) 

select Tdept,TGender,sum(Salary) 
as [Total Salary],count(TId) as [Member]
from Teacher group by Tdept,TGender ---(it gives total salary given each department)

-----+++++++++++-----view of available courses----+++++++---------

select course.crCode,course.crTitle,course.craditHour,course.course_status,course.T_Id,Teacher.TName,Teacher.TAvailability,Teacher.Temail,Teacher.TQualification 
from course join Teacher
on Teacher.TId = course.T_Id
order by craditHour desc

--------+++++++++-----registered courses view----+++++++++-----------
select Student.stId,Student.stName,course.crTitle,course.crCode,course.craditHour,Student.curSem,Student.DprName
from Reg_course join course on Reg_course.Course_Code = course.crCode 
join Student on Reg_course.st_ID = Student.stId

-----++++++++++++------Fee datails of all------+++++++++++------
select Student.stId,Student.stName,Student.curSem,Student.DprName,Fee.Payed_fee,Fee.Remaining
from Fee join Student 
on Fee.st_ID = Student.stId

-----------------for spacific department-------------------
select Student.stId,Student.stName,Student.curSem,Student.DprName,Fee.Payed_fee,Fee.Remaining
from Fee join Student 
on Fee.st_ID = Student.stId where DprName = 'BCs'--BCE,BBA,BEE--

-----------------for checking who has remaings -------------------
select Student.stId,Student.stName,Student.curSem,Student.DprName,Fee.Remaining
from Fee join Student 
on Fee.st_ID = Student.stId where Remaining>0

-----------------for checking complete submission-------------------
select Student.stId,Student.stName,Student.curSem,Student.DprName,Fee.Payed_fee  
from Fee join Student 
on Fee.st_ID = Student.stId where Remaining = 0

-----------------result-------------------

select course.crTitle,Student.stName,result.Total_marks,result.Obtain_Marks,result.GPA,Teacher.TName
from result join Student
on result.st_ID = Student.stId
join course
on result.Course_Code = course.crCode
join Teacher
on result.T_Id = Teacher.TId
------------------------------ Maximum Marks ---------------------
select course.crTitle,Student.stName,result.Total_marks,result.Obtain_Marks,result.GPA,Teacher.TName
from result join Student
on result.st_ID = Student.stId
join course
on result.Course_Code = course.crCode
join Teacher
on result.T_Id = Teacher.TId
where Obtain_Marks = (select max(Obtain_Marks) from result)
----------------------------- Minimum Marks ----------------------
select course.crTitle,Student.stName,result.Total_marks,result.Obtain_Marks,result.GPA,Teacher.TName
from result join Student
on result.st_ID = Student.stId
join course
on result.Course_Code = course.crCode
join Teacher
on result.T_Id = Teacher.TId
where Obtain_Marks = (select min(Obtain_Marks) from result)
------------------------------ Averge Marks ----------------------
select course.crTitle,Student.stName,result.Total_marks,result.Obtain_Marks,result.GPA,Teacher.TName
from result join Student
on result.st_ID = Student.stId
join course
on result.Course_Code = course.crCode
join Teacher
on result.T_Id = Teacher.TId
where Obtain_Marks = (select avg(Obtain_Marks) from result)

------------------------------ Attendace View -----------------------------
Select  attendance.st_ID,Student.stName,Student.curSem,Student.DprName,attendance.Attendence,attendance._Date_
from attendance join Student
on attendance.st_ID = Student.stId


 
--~~~~========~~~~~~~~~~~Insertion Store procedure for student ~~~~~~~~~~~~======~~~~~~~~--
create proc st_pro
@stName varchar(45),
@stpName varchar (45),
@DprName varchar (45),
@stAdr varchar (50),
@curSem int,
@stEmail nvarchar (25),
@stDob date,
@stGender char,
@stPhone bigint
as begin
insert into Student values (@stName,@stpName,@DprName,@stAdr,@curSem,@stEmail,@stDob,@stGender,@stPhone)
end
------Caliing procedure to insert value
exec st_pro 'Zahra khan','Tabish Khan','EE','Islamabad',3,'umair09gmail.com','2001-03-17','F',03097876342

------Selection store procedure-------
create proc st_view
as begin
select * from Student
end
-------- execution ------
exec st_view
-------------deletion work trough by cascading------------------
create proc st_del_pro
@stEmail nvarchar(25)
as begin
delete from Student where stEmail = @stEmail 
end
-------execution---------
exec st_del_pro'abbas0@gmail.com'
-----------------deletion work trough trigger by cascading-----------------
create trigger st_del
on Student
for delete
as begin
declare @stId int
select @stId=stId from Student
end
delete from Student where stId = 5
