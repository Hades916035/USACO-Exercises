public class TeamPlusMinus {
    public int teamPlusMinus(int[][] games) {
        int homeTeamScore = 0;
        int awayTeamScore = 0;
        for(int i=0; i<games.length; i++) {
            homeTeamScore += games[i][0];
            awayTeamScore += games[i][1];
        }
        return homeTeamScore - awayTeamScore;
    }
}
