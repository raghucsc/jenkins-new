pipeline {
    agent any

    stages {
        stage('Preparation') {
            steps {
                git 'https://github.com/raghucsc/jenkins-new.git'
				}
        }
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
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
			}
        }
    }
}
