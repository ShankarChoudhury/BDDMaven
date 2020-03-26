cd C:\java-workspace\MavenProject

call mvn clean

call mvn compile

mvn test -DCucumber.options="-- t @oneHRM"
REM call mvn test

mvn allure:serve

pause