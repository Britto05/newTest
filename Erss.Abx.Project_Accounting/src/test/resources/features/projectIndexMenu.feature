Feature: Check the Project Index Menu 

Scenario: Launch Browser
 Given Browser is launch for test the Projects module
 
Scenario: Verify the list view and board view
 Given the aside project main menu clicked
 And now clicked the Project sub menu
 Then Verified the list view is selected
 Then clicked the Board View