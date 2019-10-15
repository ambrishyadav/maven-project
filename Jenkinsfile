pipeline {
  agent any
    stages {

      stage('Build'){
        steps {
          echo "Building . . ."
          sh 'export MAVEN_HOME=/Users/Shared/apache-maven-3.6.2'
          sh 'export PATH=$PATH:$MAVEN_HOME/bin'
          sh 'mvn --version'
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
