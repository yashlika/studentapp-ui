pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/Ashmirasheikh/demo.git'
            }
        }
        stage('') {
            steps {
                git 'https://github.com/Ashmirasheikh/demo.git'
            }
        }
    }
}