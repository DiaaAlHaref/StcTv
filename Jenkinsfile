pipeline{

  agent { 
        docker { 
            image  'windows10'
                }
        }
  tools { 
        maven 'maven 3.9.4'  
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
