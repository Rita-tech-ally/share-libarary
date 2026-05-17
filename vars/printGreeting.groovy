def call(String name, String todayDate) {
    // Extract day if full date is provided (e.g., 17-05-2026 or 2026-05-17)
    def day = todayDate.tokenize('-')[-1]

    echo " Hi '${name}', today is '${day}'"
}
