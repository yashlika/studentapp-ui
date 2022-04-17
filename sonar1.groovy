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
               echo 'build successful'
            }
        }
       
    }
}