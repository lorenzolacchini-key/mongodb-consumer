node {
	def buildInfo
    stage('SCM Checkout') {
        git url: 'https://github.com/lorenzolacchini-key/mongodb-consumer'
    }
    stage('Maven build') {
        sh "package -DskipTests=true"
    }
}
