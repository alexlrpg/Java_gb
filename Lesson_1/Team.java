package Lesson_1;

public class Team {

    private String teamName;
    TeamPerson[] teamPerson;

    public Team(String teamName, TeamPerson ... teamPerson) {
        this.teamName = teamName;
        this.teamPerson = teamPerson;
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamPerson[] getTeamPerson() {
        return teamPerson;
    }

    public void showResults(){
        for(TeamPerson teamPerson: teamPerson){
            if(teamPerson.isDone()) {
                System.out.println(teamPerson.getName() + " " + "из команды" + " "
                        + getTeamName() + " " + "преодолел все препятствия");
            }
        }
    }
}
