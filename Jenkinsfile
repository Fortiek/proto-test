pipeline {
    agent { docker { image 'openjdk:21-slim-buster' } }
    stages {
        stage('checkout') {
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'archer_personal', url: 'https://github.com/Fortiek/proto-test']])
        }
        stage('build') {
            steps {
                sh 'java --version'
                sh 'javac --version'
                echo "Now we're cooking with oil."

                sh "javac ./*.java"
            }
        }
    }
}