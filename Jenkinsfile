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
         sh 'mvn -B -DskipTests clean package'
      } 
    }
    stage("test"){
      steps{
        echo 'test successful'
        sh "mvn clean test"
      } 
    }
    stage("deploy"){
      steps{
         echo 'deploy successful'
      } 
    }
  }   
}
