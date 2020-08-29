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
	
	//stage('Email Build Status') {
            //steps {
		//mail body: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}\n\nCheck console output at ${env.BUILD_URL} to view the results", from: 'raghu2478@gmail.com', subject: 'Declarative Pipeline Status', to: 'raghu2478@gmail.com'
		//}
	//}    
    }
}
