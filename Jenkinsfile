pipeline {
    agent any;
    tools {
            maven 'maven_3.6.0'
        }

    stages {

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

        stage ('Package Stage'){
            steps {
                    sh 'mvn install'
            }
        }

    }
}