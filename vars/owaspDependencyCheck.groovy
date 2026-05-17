def call() {
    sh '''
        mvn org.owasp:dependency-check-maven:check \
        -Dformat=HTML \
        -DfailBuildOnCVSS=7 || true
    '''
}
