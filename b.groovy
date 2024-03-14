pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building project B...'
                // Add your build commands here
            }
        }
        stage('Test') {
            steps {
                echo 'Testing project B...'
                // Add your test commands here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying project B...'
                // Add your deployment commands here
            }
        }
    }
}
