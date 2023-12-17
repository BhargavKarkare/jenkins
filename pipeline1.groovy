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
               mvn sonar:sonar \
               -Dsonar.projectKey=MYproject \
               -Dsonar.host.url=http://3.110.114.218:9000 \   
               -Dsonar.login=301a54f1fadddcf2b2f7cb03320146041555b9f3

            }
         }
          stage ('deploy') {
            steps {
               echo 'deploy completed'
            }
         }
    }
}
