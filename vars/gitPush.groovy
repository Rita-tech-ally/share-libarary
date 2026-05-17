def call(String branch) {
    sh """
        git config user.name "jenkins"
        git config user.email "jenkins@example.com"

        git add .
        git commit -m "Automated build commit" || true
        git push origin ${branch} || true
    """
}
