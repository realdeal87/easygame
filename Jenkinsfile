pipeline {
  agent any
  stages {
    stage('Source') {
      steps {
        git 'https://github.com/realdeal87/easygame.git'
      }
    }

    stage('Say Hello') {
      steps {
        echo 'Hello!'
        sh 'hostname -i'
      }
    }

  }
  environment {
    COMPLETED_MSG = 'Build done!'
  }
}