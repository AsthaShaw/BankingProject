# Banking Project

### Author
Astha Shaw

### URL
https://github.com/AsthaShaw/BankingProject.git


### Description
It is a simple console Banking Project through which a user can check his balance, deposit amount, withdraw amount and request an overdraft. Three JUnit test cases have also been used to test the functionalities of deposit, withdraw and overdraft. The project has been created in Eclipse IDE using Java Programming Language, JDK 12 and Junit5.

### How to Use the Project
1. On start of the project the user needs to register providing userId(Can be any input) and password. Confirmation of password is 
required to enter the application.

2. Next on successful registration you would be presented with a menu

:-You can use the following facilities:-
1. Deposit Money
2. Check Your Balance
3. Withdraw Money
4. Request Overdraft
5. Logout

 Please enter your option
 
 3. You need to enter a valid option and then you can use the services of the bank.
 
 4. For any user to use the overdraft facility first they need to request for it and if granted then they can get a fixed overdraft limit of 100.0. Then they can withdraw that amount using the withdraw option. Overdraft can be requested just once per user.
 
 5. You can continue to use the services till you select option 5 to logout.
 
 ### How to test the Project
 Three Simple Junit test cases have been created to test the functionality of deposit, withdraw and overdraft. 
 
 Apart from that following manual unit test cases can be used to test the application:-
 
 1. Providing a blank userId.
 2. Providing a userId.
 3. Providing a blank password.
 4. Providing a password.
 5. Providing a different password while confirming.
 6. Providing the same password while confirming.
 7. Providing a different option other than one provided in the menu.
 8. Providing a valid option.
 9. Providing a negative value in deposit amount.
 10. Providing a 0 value in deposit amount.
 11. Providing the positive value in deposit amount.
 12. Providing a negative value in withdraw amount.
 13. Providing a 0 value in withdraw amount.
 14. Providing the positive value in withdraw amount.
 15. Providing greater value in withdraw amount than what is available in the balance currently.
 16. Requesting an overdraft for the first time.
 17. Requesting an overdraft for the second time.
 18. Withdraw overdraft amount.
 19. Withdraw overdraft+existing balance amount.
 20. Withdraw more than the overdraft+existing balance amount.
 21. Selecting the option for logging out.
 
 ### Pre-requisites
 
 1. Eclipse IDE installation
 2. JDK installation
 
 
 

