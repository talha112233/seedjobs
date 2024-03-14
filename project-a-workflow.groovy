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



//
pipelineJob('example') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/talha112233/seedjobs.git')
                    }
                    branches('*/master') // Optionally specify the branch to checkout
                }
            }
            scriptPath('project-a-workflow.groovy') // Specify the path to your script
        }
    }
}
