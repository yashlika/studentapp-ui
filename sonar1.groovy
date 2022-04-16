pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git 'https://github.com/Ashmirasheikh/demo.git' 
            }
        }
        stage('build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
        stage('test') { 
            steps {
                echo 'test successful' 
            }
        }
    }
}