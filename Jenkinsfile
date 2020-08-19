node {
	def buildInfo
    stage('SCM Checkout') {
        git url: 'https://github.com/lorenzolacchini-key/mongodb-consumer'
    }
    stage('Maven build') {
        buildInfo = rtMaven.run pom: '/pom.xml', goals: 'package -DskipTests=true'
    }
}
