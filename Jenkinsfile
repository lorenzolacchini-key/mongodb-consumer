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
            }
        }
        stage("Deploy") {
            steps {
                build job: 'docker-images', 
                      parameters: [
                        string(name: 'passed_build_number_param', value: String.valueOf(BUILD_NUMBER)),
                        string(name: 'complex_param', value: 'prefix-' + String.valueOf(BUILD_NUMBER))
                     ]
            }
        }
        
    }
}
