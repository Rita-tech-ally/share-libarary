def call() {
    sh 'mvn clean compile -Dcheckstyle.skip=true'
}
