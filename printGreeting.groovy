def call(String name, String date) {
    def day = date.split("-")[2]

    println "Hi '${name}', today is '${day}'"
}
