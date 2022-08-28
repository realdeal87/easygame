pipeline {
  agent any
  stages {
    stage('Source') {
      steps {
        git 'https://github.com/realdeal87/easygame.git'
      }
    }

  }
  environment {
    COMPLETED_MSG = '"Build done!"'
  }
}