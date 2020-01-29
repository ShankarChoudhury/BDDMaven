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
          stage('Report') {
            steps {
                 step([$class: 'CukedoctorPublisher', target/: '', format: 'HTML', hideFeaturesSection: false, hideScenarioKeyword: false, hideStepTime: false, hideSummary: false, hideTags: false, numbered: true, sectAnchors: true, title: 'Living Documentation', toc: 'RIGHT'])
            }
        }
    }
}
