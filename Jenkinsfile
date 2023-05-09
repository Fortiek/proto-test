pipeline {
    agent { docker { image 'openjdk:21-slim-buster' } }
    stages {
        stage('build') {
            steps {
                sh 'java --version'
                sh 'javac --version'
                echo "Now we're cooking with oil."
            }
        }
    }
}