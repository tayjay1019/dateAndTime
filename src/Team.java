public enum Team {
    BULLS("Chicago", "Bulls"),
    CAVALIERS ("Cleveland", "Cavaliers"),
    PISTONS("Detroit", "Pistons"),
    PACERS("Indiana", "Pacers"),
    BUCKS("Milwaukee", "Bucks");

    private String teamName;
    private String city;
    Team (String city, String teamName) {
        this.city = city;
        this.teamName = teamName;
    }
    public String getCity () {
        return city;
    }
    public String getTeamName () {
        return teamName;
    }
}
