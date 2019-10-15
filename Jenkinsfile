pipeline {
  agent any
    stages {

      stage('Build'){
        steps {
          echo "Building . . ."
          sh 'mvn clean pacakge'
        }
        post {
          success {
            echo "Now Archiving . . ."
            archiveArtifacts artifacts: '**/target/*.war'
          }
        }
      }
/**
      stage('Build'){
        steps {
          echo "Building . . ."
        }
      }

      stage ('Deploy'){
        steps{
          echo "Code deployed . . ."
        }
      }
**/
    }
}
