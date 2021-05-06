pipeline {
    agent any
    
    environment {
        PROJECT_NAME = "Some Project"
        OWNER_NAME = "Some Owner"
    }

    stages {
        stage('1-Buid') {
            steps {
                echo 'Start of Stage Buid'
                echo 'Building...'
                echo 'End of Stage Build'
            }
        }
        stage('2-Test') {
            steps {
                echo 'Start of Stage Test'
                echo 'Testing...'
                // sh 'cat lol.text'
                sh 'ls -la'
                echo "Owner name is ${OWNER_NAME}"
                echo "Project name is ${PROJECT_NAME}"
                echo 'End of Stage Test'
            }
        }
        stage('3-Deploy') {
            steps {
                echo 'Start of Stage Deploy'
                echo 'Deploing...'
                sh '''
                    echo "line 1"
                    echo "line 2"
                '''
                echo 'End of Stage Deploy'
            }
        }
    }
}
