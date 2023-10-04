To test the application in the terminal within the IDE:
#For unit testing
./gradlew test

#For integration tests
./gradlew integrationTest

You may also right-click the test classes within the IDE and choose test/integrationTest.

RULES
- For each feature, make your own branch
- When merging into master, unit-tests and integration-tests in jobs.yml need to go green

Running the application:
- Within the IDE, click "Run 'SinglaSlantGitHubActionsApplication'"
- Open http://localhost:8080/ in your browser
- Choose heads/tails and click the 'Flip'-button
- Keep trying to beat the computer! :)
