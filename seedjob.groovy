pipeline{
    agent any
    stages {
        stage('pull') {
            steps1 {
                git 'https://github.com/Ashmirasheikh/demo.git'
            }
        }
        stage('test') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}