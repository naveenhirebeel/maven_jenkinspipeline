pipeline {
    agent any;
    tools {
            maven 'Maven 3.3.9'
        }
    stages {
        stage('Display Tool Details') {
            sh '''
                sh echo "PATH = ${PATH}"
                sh echo "M2_HOME=${M2_HOME}"
            '''
        }

        stage('Checkout code') {
            steps {
                checkout scm
            }
        }

        stage ('compile Stage'){
            steps {
                    sh 'mvn clean compile'
            }
        }

        stage ('Unit Test Stage'){
            steps {
                    sh 'mvn test'
            }
        }

        stage ('Install Stage'){
            steps {
                    sh 'mvn install'
            }
        }
    }
}
