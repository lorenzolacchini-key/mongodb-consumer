node {
	def buildInfo
    stage('SCM Checkout') {
        git url: 'https://github.com/lorenzolacchini-key/mongodb-consumer'
    }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests package'
            }
        }
}
