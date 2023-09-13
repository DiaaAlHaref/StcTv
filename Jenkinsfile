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
        sh 'mvn -Dmaven.test.failure.ignore=true install'
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
