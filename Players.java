public class Players {

   // private static int nextAvailableNumber = 0;

   // Data members.
   private String player_name;
   private String player_id;
   private int tries_scored;
   private String team_name;
   private String team_id;
   private String home_stadium_name;
   private String home_stadium_street;
   private String home_stadium_town;
   private String home_stadium_postcode;

   public Players(String inPlayer_name, String inPlayer_id) {
	   // number = nextAvailableNumber++;
	   player_name = inPlayer_name;
	   player_id = inPlayer_id;
      System.out.println(player_name, player_id);
   }

   public String getName() {
      return player_name;
   }

   public String getPlayer_id() {
      return player_id;
   }

   public int getTries() {
      return tries_scored;
   }

   public String getTeam_name() {
      return team_name;
   }

   public String getTeam_id() {
      return team_id;
   }

   public String getStadium_name() {
      return home_stadium_name;
   }

   public String getStadium_street() {
      return home_stadium_street;
   }

   public String getStadium_town() {
      return home_stadium_town;
   }

   public String getStadium_postcode() {
      return home_stadium_postcode;
   }

   public String toString() {
      String s =  player_id + ", " + player_name + " (" +tries_scored+ ")";
      // s += ": mean = " + averageMark;
      return s;
   }
   public static void main(String[] args){
      players(args[0], args[1]);
   }
   }
