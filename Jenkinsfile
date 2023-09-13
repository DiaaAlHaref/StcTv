pipeline{

  agent any 
  tools { 
        maven 'maven 3.9.4'
        jdk 'OpenJDK11'
    }

  stages{
    stage("build"){
      steps{
         echo 'build successful'
          sh 'java --version'
      } 
    }
    stage("test"){
      steps{
        echo 'test successful'
        sh "mvn -D clean test"
      } 
    }
    stage("deploy"){
      steps{
         echo 'deploy successful'
      } 
    }
  }   
}
