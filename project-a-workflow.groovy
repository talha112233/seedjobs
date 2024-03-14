pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building project A...'
                // Add your build commands here
            }
        }
        stage('Test') {
            steps {
                echo 'Testing project A...'
                // Add your test commands here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying project A...'
                // Add your deployment commands here
            }
        }
    }
}



pipeline {
    agent any
    stages {
        stage('Build nrere') {
            steps {
                echo 'Building project A...'
                // Add your build commands here
            }
        }
        stage('Testjkj') {
            steps {
                echo 'Testing project A...'
                // Add your test commands here
            }
        }
        stage('Deployklj') {
            steps {
                echo 'Deploying project A...'
                // Add your deployment commands here
            }
        }
    }
}
