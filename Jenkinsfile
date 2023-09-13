pipeline{

  agent any

  tools { 
        maven 'maven 3.9.4' 
        jdk 'OpenJDK17' 
    }

  stages{
    stage("build"){
      steps{
         echo 'build successful'
         sh "mvn clean test"
      } 
    }
    stage("test"){
      steps{
        echo 'test successful'
      } 
    }
    stage("deploy"){
      steps{
         echo 'deploy successful'
      } 
    }
  }   
}
