def call() {
    withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR_TOKEN')]) {
        sh '''
            mvn sonar:sonar \
            -Dsonar.projectKey=secretsanta \
            -Dsonar.host.url=http://localhost:9000 \
            -Dsonar.login=$SONAR_TOKEN
        '''
    }
}
