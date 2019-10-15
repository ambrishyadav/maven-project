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

      stage ('Deploy to Staging'){
        steps{
          build job: 'deploy-to-staging'
          echo "Code deployed to staging . . ."
        }
      }

      stage ('Deploy to Production'){
        steps{
          timeout(time:5, unit:'DAYS'){
            input message:'Approve PRODUCTION deployment?'
          }
          post{
            success{
              echo 'Code deployed to production'
            }
            failure{
              echo 'SHIT ! Failed deployment'
            }
          }
        }
      }

    }
}
