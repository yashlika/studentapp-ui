pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/Ashmirasheikh/studentapp-ui.git'
            }
        }
         stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('test') {
            steps { withSonarQubeEnv(credentialsId: '1') {
                sh 'mvn sonar:sonar'
        
                
                
            }
        }
    }
}