import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe=new FootBallPlayer("Joe");
        SoccerPlayer dean=new SoccerPlayer("Dean");
        BaseBallPlayer tim=new BaseBallPlayer("Tim");


        Team yankees=new Team("Yankees");
        yankees.addMembers(joe);
        yankees.addMembers(dean);
        yankees.addMembers(tim);

        System.out.println(yankees.getNumOfPlayers());



    }


}




//=====================================NOTE===================


//1.Any player regardless of the sport they are playing can be added to a team this is not realistic
