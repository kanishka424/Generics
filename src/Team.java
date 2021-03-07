import java.util.ArrayList;
import java.util.List;

public class Team {
    private  final String name;
    int played;
    int tied;
    int lost;
    int won;

    public Team(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    List<Player> members=new ArrayList<>();

    public Boolean addMembers(Player player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on team");
            return false;
        }else{
            System.out.println(player.getName()+" is added to team "+ this.name);
           return  members.add(player);

        }
//        for (Player p:members){
//            if(p.equals(player)){
//                System.out.println("player already in team");
//                return false;
//            }
//        }
//        return members.add(player);


    }

    public void matchResultRecord(Team opponent,int ourScore,int theirScore){
        played++;
        if(ourScore>theirScore){
            won++;
        }else if(ourScore==theirScore){
            tied++;
        }else if(ourScore<theirScore){
            lost++;
        }

        if(opponent!=null){//intresting code to stop infinity loop
            opponent.matchResultRecord(null,theirScore,ourScore);
        };


    }


    public int getNumOfPlayers(){
        return this.members.size();
    }

    public int ranking(){
        return (won*2)+tied;
    }
}
