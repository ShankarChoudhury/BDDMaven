pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
				withMaven(maven : 'Maven_3.5.2')
                sh 'mvn clean compile'
            }
        }
        
    }
}