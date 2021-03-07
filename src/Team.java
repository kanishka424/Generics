import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{//how to restrict comparable interfce to compare same sport teams
    private  final String name;
    int played;
    int tied;
    int lost;
    int won;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Team<T> o) {//how to implement parameterizes compareTo with Generics
        if(this.ranking()>o.ranking()){
            return 1;
        }else if(this.ranking()<o.ranking()){
            return -1;
        }
        return 0;
    }

    public String getName(){
        return name;
    }

    List<T> members=new ArrayList<>();

    public Boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on team");//
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

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);//intresting way to stop the loop
        }
    }


    public int numPlayers(){
        return this.members.size();
    }

    public int ranking(){
        return (won*2)+tied;
    }
}



//======================NOTE=======================
//1.Java allows multiple bound types but general rule apply only one class you can extend others must be interfaces
//here alo specify the clas first
// e.g-Team<T extend player & Manager & Coach >
//player is the only class Manager and Coach must be interfaces