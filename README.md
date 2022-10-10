Laboratory work 4 Description

Working on this laboratory, I had to implement the principle of polymorphism that describes situations in which something occurs in several different forms, and to extend my project using interfaces and abstract classes.


I created the interface Root, from which all the others are derived. Interface People, because we have different actors, but they have similar behaviors.


The next task was to add abstract classes. In my abstract classes, I added abstract methods and public methods that are inherited by the child classes. The abstract class Students and Employees implements the interface People. From the Students we have 2 types of students: full-time and part-time. Those classes inherit the methods from the parent classes and override the abstract methods. The same thing will happen with the abstract class Employees which is divided into Professors and Administration. The abstract class Departments will have two departments: Informatics and Science. And the abstract class Evaluation will have 3 sublasses, because we have 3 types of evaluation:exams, laboratory and midterms.

I had to implement the scenarios that will happen in my simulation.In order to make those scenarios work I used dependancy injection in which an object or function receives other objects or functions that it depends on. 

First scenario will be that Students go to the university, which will show what type of study he is practicing and the period of time when the student goes to university. A student choose to go full time or part time. 

Secondly a student will take an exam and it will be shown if he is accepted to take the exam, the grade and if the grade is bigger than 5 it means that he passed the exam. The same principle will work when the student will take a midterm. 

Another option is for the student to present laboratory work and in this way will be shown how many labs has the student presented and if he presented more than half of the labs he can be accepted, otherwise it will not be. Some other scenarios will be to show the information about professors. To go to the departments and to the administration.

All things considered I have learned a lot from this laboratory, from the theoretical definitions to the implementation of all the required tasks we had to do. Using abstract classes and interfaces it helps to create a system more organized and more efficient omitting redundancy.











