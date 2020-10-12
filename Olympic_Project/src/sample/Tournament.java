package sample;
import java.util.Objects;

public class Tournament {
    private SportTypeAthleteANDReferee sportTypeOfTournament;
    private TypeOfTournament typeOfTournament;
    private Stadium stadium;
    private Referee referee;
    private State state1;
    private State state2;
    public enum TypeOfTournament {
        Personal,
        Team
    }
    public Tournament(SportTypeAthleteANDReferee sportTypeOfTournament,  TypeOfTournament typeOfTournament, Stadium stadium, Referee referee, State state1, State state2){
        this.sportTypeOfTournament = sportTypeOfTournament;
        this.typeOfTournament = typeOfTournament;
        this.stadium = stadium;
        this.referee = referee;
        this.state1 = state1;
        this.state2 = state2;
    }

    public SportTypeAthleteANDReferee getSportTypeOfTournament() {
        return sportTypeOfTournament;
    }

    public TypeOfTournament getTypeOfTournament() {
        return typeOfTournament;
    }

    public Stadium getStadium() {
        return stadium;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Tournament))
            return false;

        Tournament temp = (Tournament) other;
        return stadium.equals(temp.stadium) && referee.equals(temp.referee);
    }
}
