pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
               git 'https://github.com/BhargavKarkare/studentapp.ui.git'
               echo 'pull sucessful'
            }
         }
         stage ('build') {
            steps {
               
               echo 'build sucessful'
            }
         }
          stage ('test') {
            steps {
               echo 'test completed'
            }
         }
          stage ('deploy') {
            steps {
               echo 'deploy completed'
            }
         }
    }
}
