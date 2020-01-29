pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                withMaven(maven : 'myMaven') {
                    bat 'mvn compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven : 'myMaven') {
                    bat 'mvn test -DCucumber.options="-t @oneHRM"'
                }
            }
        }
         
    }
}
