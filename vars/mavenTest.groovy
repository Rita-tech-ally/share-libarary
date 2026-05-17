def call() {
    sh 'mvn test -Dmaven.test.failure.ignore=true'
}
