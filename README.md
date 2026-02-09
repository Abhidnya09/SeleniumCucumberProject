# Selenium Code - Java (Cucumber) with chrome driver setup - simple test on sample application)

## Description. : This is a demo testcase on java tech with cucumber and selenium test. There are couple testcases ( 2 automation scripts ): which validates the business scenarios: Scenario 1: Validate user is able to view after log in Scenario 2: Validate new user is able to view after clicking on new Registration This simple tests are to validate on the sample application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html

Table of Contents
Introduction
Features
Requirements
Quick Start
Introduction
This is a demo testcase on java tech with cucumber and selenium test. This simple test is to validate the product page is appearing post login on the sample application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html

Features
Selenium Tests

Test Requirements
Test Scenario 1:

Open up google chrome browser (This project has google chrome driver version 115- which is installed and setup as path)
Launch the application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html#
Click on the hamburger menu
Click on 'SignIn Portal'
Enter the username
Enter the password
Click on Login button
Verify if the Product Category name is matching with expected. The application can be run locally.
Test Scenario 2:

Open up google chrome browser (This project has google chrome driver version 115- which is installed and setup as path)
Launch the application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html#
Click on the hamburger menu
Click on 'SignIn Portal'
Click on 'New User? Register here' button
Verify if the user lands on the User Registration Page The application can be run locally.
Local
Java 11 SDK
Maven
ChromeDriver
Execution modes ## 🤖 Starting up
command: mvn test
