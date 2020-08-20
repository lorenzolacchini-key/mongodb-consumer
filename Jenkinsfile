pipeline {
    agent any

    tools {
        maven "Maven 3.6.3" // You need to add a maven with name "3.6.0" in the Global Tools Configuration page
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn package -DskipTests=true"
                sh "cp target/BuiltJar.jar $JENKINS_HOME/jars/"
            }
        }
        stage("Deploy") {
            steps {
                build job: 'docker-images'
            }
        }
        
    }
}
