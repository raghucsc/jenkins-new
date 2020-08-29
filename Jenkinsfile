pipeline {
    agent any

    stages {
 
        stage('Build') {
            steps {
            bat "mvn clean test"
			}
        }
        stage('Package') {
            steps {
            bat "mvn package"
			}
        }
        stage('Results') {
            steps {
	    input("Do you want to capture results?")	
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
			}
        }
    }
}
