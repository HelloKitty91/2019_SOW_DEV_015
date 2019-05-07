User Story:
-----------

As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.

Acceptance Criteria:
--------------------

1.All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
2.All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
3.All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
4.All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).

Note: The Gregorian Calendar is quite accurate, but could be made more accurate by adding an additional rule that eliminates years divisible by 4000 as leap years.

GIVEN any year e.g. 2000
WHEN its a leap year
THEN result should be true

GIVEN any year e.g. 2019
WHEN its a leap year
THEN result should be false

Steps to run the project:
-------------------------

1. Check out the maven project from GitHub

2. Build the project.

3. Run the TestRunner.java, 

4. To view the coverage results, then click on "Run with test coverage". 

Note: each test method follows below naming convention,
        test_methodName_withCertainState_shouldDoSomething