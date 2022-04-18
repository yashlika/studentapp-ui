pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
               git 'https://github.com/shubhamkalsait/studentapp-ui.git' 
            }
        }
        stage('build') { 
            steps {
               sh 'mvn clean package'
            }
        }
       stage('test') { 
            steps { withSonarQubeEnv ('sonar1') {
                sh 'mvn sonar:sonar'
            }
        }
    }
        stage('QualityCheck') { 
            steps { 
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate true
                }  
            }
        }
        stage('deploy') { 
            steps {
               deploy adapters: [tomcat8(credentialsId: 'ad', path: '', url: 'http://13.38.137.6:8080')], contextPath: '/', war: ' **/*.war'
            }
        }
    }
}