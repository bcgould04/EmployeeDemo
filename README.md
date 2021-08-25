# Solutions

There are two ways to achieve the functionality for part-time employees
1. The Simple Approach is to add a property or flag for part-time employees. 

2. A better approach is to create a child class extending Employee class. While potentially over-kill for the 
   requirement of simply adding whether an employee is part-time or not, for future properties such as health benefit for permanent employees or 
   bonuses for managers the child class approach is a cleaner solution.  

I demonstrate the simple approach in SimpleEmployee Class. 
I demonstrate the other approach by separating Employee 
(named EmployeeAlt for this example) into child classes FullTime, PartTime, and Manager Classes. 