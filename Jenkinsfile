node {
    stage('SCM Checkout') {
        git url: 'https://github.com/lorenzolacchini-key/mongodb-consumer'
    }
        stage('Build') {
                sh 'mvn -B -DskipTests package'
        }
}
