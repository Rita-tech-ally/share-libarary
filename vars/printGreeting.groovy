def call(String name, String date) {
    def day = date.split("-")[2]
    echo "Hi ${name}, today is ${day}"
}
