pipeline {
    agent { dockerfile true }

    tools {
        maven "Maven 3.6.3" // You need to add a maven with name "3.6.0" in the Global Tools Configuration page
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn package -DskipTests=true"
            }
        }
    }
}
node {
    checkout scm
    def testImage = docker.build("test-image", "./dockerfiles/test") 

    testImage.inside {
        sh 'make test'
    }
}
