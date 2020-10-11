package sample;



public class Tournament {
    private SportTypeAthleteANDReferee sportTypeOfTournament;
    private TypeOfTournament typeOfTournament;
    private Stadium stadium;
    private State state1;
    private State state2;
    private State state3;
    public enum TypeOfTournament {
        Personal,
        Team
    }
    public Tournament(SportTypeAthleteANDReferee sportTypeOfTournament,  TypeOfTournament typeOfTournament, Stadium stadium, State state1, State state2, State state3){
        this.sportTypeOfTournament = sportTypeOfTournament;
        this.typeOfTournament = typeOfTournament;
        this.stadium = stadium;
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
    }



}
