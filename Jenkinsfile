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
                sh "cp target/mongodb-consumer-0.0.1-SNAPSHOT.jar $JENKINS_HOME/jars"
            }
        }
        
    }
}
