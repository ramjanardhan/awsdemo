pipeline {
  environment {
    registry = "foundational/liberty1"
    registryCredential = 'docker-details'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Git Checkout') {
      checkout scm
    }
    
    	stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
        
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}
