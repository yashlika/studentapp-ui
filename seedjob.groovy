pipeline{
    agent any
    stages {
        stage('build') {
            steps {
                git 'https://github.com/Ashmirasheikh/demo.git'
            }
        }
        stage('test') {
            steps {
                echo 'hi how are you'
            }
        }
    }
}