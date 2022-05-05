/** The NBAPlayer class creates an NBAPlayer object with variables including name, weight,
height, position, and their team.*/
public class NBAPlayer{
   public int id;
   public String first_name, last_name, position;
   public double height_feet, height_inches, height, weight_pounds;
   public Team team;
   /** Constructor with no parameters */
   public NBAPlayer() { }
   /** Constructor that uses info pulled from the API to fill parameters
   @param id holds the player id number that the API has listed
   @param first_name holds the player's first name that the API has listed
   @param last_name holds the player's last name that the API has listed
   @param height_feet holds the player's height in feet that the API has listed
   @param height_inches holds the player's remaining height in inches that the API has listed
   @param weight_pounds holds the player's weight in lbs that the API has listed
   @param team holds the player's team that the API has listed and create a Team object
          that may be used to pull further info.
   */
   public NBAPlayer(int id, String first_name, String last_name, double height_feet,
                    double height_inches, double weight_pounds, Team team){
      this.id = id;
      this.first_name = first_name;
      this.last_name = last_name;
      this.height_feet = height_feet;
      this.height_inches = height_inches;
      this.weight_pounds = weight_pounds;
      this.team = team;
   }
}