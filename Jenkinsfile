pipeline {
    agent any 
    stages {
        stage('Example Build') {
            steps {
                echo 'Hello, Maven'
                withMaven(maven : 'myMaven') {
                    bat 'mvn test -DCucumber.options="-t @oneHRM"'
                }
            }
        }
        stage('Example Test') {
            steps {
                echo 'Hello, JDK'
               
            }
        }
    }
}
