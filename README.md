
# OrangeHRM Selenium Automation

## Project Overview

This project demonstrates my learning and practical experience in web application test automation using Selenium WebDriver, Java, TestNG, and Maven. The tests use the OrangeHRM demo application.

## Tools and Technologies

- Programming Language: Java
- Automation Tool: Selenium WebDriver
- Test Framework: TestNG
- Build Tool: Maven
- Design Pattern: Page Object Model (POM)
- IDE: Eclipse
- Version Control: Git and GitHub

## Test Scenarios

### 1. Login Testing

- Verify login using valid credentials.
- Verify navigation to the dashboard after successful login.

### 2. PIM (Personnel Information Management) Testing

- Navigate to the PIM module.
- Open the Add Employee page.
- Enter employee details.
- Validate required-field messages.
- Verify employee details after creation.

## Project Structure

- `BaseTest.java` - WebDriver setup and test configuration.
- `LoginPage.java` - Login page elements and actions.
- `LoginTest.java` - Login test scenarios.
- `PIMPage.java` - Employee management page elements and actions.
- `PIMTest.java` - PIM test scenarios.
- `pom.xml` - Maven dependencies and configuration.

## How to Run

1. Clone or download this repository.
2. Open the project in Eclipse as a Maven project.
3. Ensure Java and Maven are configured.
4. Allow Maven to download the required dependencies.
5. Run the TestNG test classes.

## Application Under Test

[OrangeHRM Demo](https://opensource-demo.orangehrmlive.com/)

## Purpose

This project is part of my ongoing QA learning journey, where I am developing practical automation skills alongside my manual testing experience.

