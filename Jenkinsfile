pipeline {
    agent any;
    stages {
        stage ('compile Stage'){
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Unit Test Stage'){
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deploy Stage'){
            steps {
                withMaven(maven : 'maven_3.6.0') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
