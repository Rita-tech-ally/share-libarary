def call() {
    sh '''
        mvn sonar:sonar \
        -Dsonar.projectKey=secretsanta \
        -Dsonar.host.url=http://localhost:9000 \
        -Dsonar.login=admin
    '''
}
