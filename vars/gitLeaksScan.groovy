def call() {
    sh 'gitleaks detect --source . || true'
}
