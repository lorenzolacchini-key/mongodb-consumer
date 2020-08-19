node {
    stage('SCM Checkout') {
        git url: 'https://github.com/lorenzolacchini-key/mongodb-consumer.git'
    }
    stage('Compile-Package') {
		def mvnHome = tool name: 'maven-3', type: 'maven'
			sh "${mvnHome}/bin/mvn package
    }
}