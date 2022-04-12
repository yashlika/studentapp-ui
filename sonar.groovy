pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/Ashmirasheikh/studentapp-ui.git'
            }
        }
    }
}