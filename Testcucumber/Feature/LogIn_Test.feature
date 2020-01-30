Feature: Login Action
@Automation
Scenario Outline: Successful Login with Valid Credentials
 Given User is on Home Page
When I enter valid "<username>" and valid "<password>"
 Then Message displayed Login Successfully
 When User LogOut from the Application
Then Message displayed Logout Successfully
 Examples:
 
| username | password |
#| sadmin | admin123|
| Admin | admin123 |



#Scenario: After Login
#Given User is on Admin Page
#When User mouse hover on admin and job 
#And click on job categories
#Then Add job categories
#

#Scenario: After adding jobs
#Given User is on admin page

 
 
 