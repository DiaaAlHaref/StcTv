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
      } 
    }
    stage("test"){
      steps{
        echo 'test successful'
        bat "mvn -D clean test"
      } 
    }
    stage("deploy"){
      steps{
         echo 'deploy successful'
      } 
    }
  }   
}
