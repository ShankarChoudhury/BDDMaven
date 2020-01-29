cd C:\java-workspace\MavenProject

call mvn clean

call mvn compile

REM mvn test -DCucumber.options="- tags @test1"
call mvn test

mvn allure:serve

pause