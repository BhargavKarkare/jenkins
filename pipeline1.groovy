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
               sh '/opt/apache-maven-3.9.5/bin/mvn clean package'
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
