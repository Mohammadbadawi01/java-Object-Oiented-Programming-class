# java-Object-Oiented-Programming-class
# class in java with nice input terminal


the task: 

this Homework, you will implement a program to keep an updated information about students in a
university. Each student will have a unique (String) ID. By using this number, the university register should
be able to add, retrieve and update information about a given student.
Define a class called Student with the following fields:

· id [String].

· name [String].

· major [String].

· birthdate [String: DD/MM/YYYY].

· courses [ArrayList]

For each student, you have to keep information for the completed courses in an ArrayList (courses).

Therefore, define a class called Course with the following fields:

· cn [String] : course number

· ch [integer] : credit hours

· grade [integer]: course grade

You should provide the required constructors in addition to the set and get public methods to manipulate

the private fields in the aforementioned classes.

Your program should keep the updated information for all student in an ArrayList. The registrar will add,

retrieve and update the information with the following commands in the following formats:

· new student_id

· delete student_id

· set student_id attribute value

· get student_id attribute

· addCourse student_id cno

· setCourse student_id cno attribute value

· getAverage student_id

· print student_id

Ex:

 new 11711111

(create a new student with ID : 11711111)

 set 11711111 name Ali Ahmad

(set the name of student 11711111 to “Ali Ahmad”)

 set 11711111 major computer engineering

(set the major of student 11711111 to “computer engineering”)

 set 11711111 birthdate 22/10/1999

(set the birthdate of student 11711111 to “22/10/1999 ”)

 get 11711111 name

(display the name “Ali Ahmad”)

 addCourse 11711111 10636111

(Add a new course with cn : 10636111 to the courses list for 11711111)

 setCourse 11711111 10636111 ch 3

(Set the credit hours for 10636111 to 3 )

 setCourse 11711111 10636111 grade 93

(set the grade to 93)

 getAverage 11711111

(Compute and display the average for 11711111)

 print 11711111

(Print the complete information about the given student ID)

 delete 11711111

(Delete the student with ID :11711111)

 quit

GOODBYE

The “print” command should display the available information about the given ID in the following form: 

Output: 

ID : 11711111 

Name: Ali Ahmad

 Major: Computer Engineering 

Birthdate: 22/10/1999 

Average: 91.5 

CN              Credit Hours     Grade 

10636111          3                  93

10636211          3                  81 

10639291          1                  94 

 Notes:

  Keywords are case insensitive. ‘a’ is equivalent to ‘A’. 

 If a student’s attribute is not initialized and a command tries to use its value, you should display a message telling the user that it has not been initialized.
