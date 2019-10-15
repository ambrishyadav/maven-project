pipeline {
  agent any
    stages {

      stage('Build'){
        steps {
          echo "Building . . ."
          sh '/Users/Shared/apache-maven-3.6.2/bin/mvn clean package'
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
