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

        stage ('Sonar Inspection'){
            steps {
                    sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar -Dsonar.host.url=https://sonarcloud.io/ -Dsonar.login=40e135c49c5f8de775c9cce4a8c92560c9ac7151'
            }
        }
    }
}