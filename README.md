To test the application in the terminal within the IDE:

For unit testing
./gradlew test

For integration tests
./gradlew integrationTest

You may also right-click the test classes within the IDE and choose test/integrationTest.

RULES
- For each feature, make your own branch
- When merging into master, unit-tests and integration-tests in jobs.yml need to go green (these conditions are already set and merging is not possible without green tests)

Running the application:
- Within the IDE, click "Run 'SinglaSlantGitHubActionsApplication'"
- Open http://localhost:8080/ in your browser
- Choose heads/tails and click the 'Flip'-button
- Keep trying to beat the computer! :)

JaCoCo test report:
Open the gradle build folder in the project -> jacocoHtml -> (copy absolute path of) index.html -> paste in browser. You should now see the coverage of the unit tests, preferably a number of atleast 90%
