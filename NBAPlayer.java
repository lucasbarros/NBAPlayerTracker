public class NBAPlayer{
   public int id;
   public String first_name, last_name, position;
   public double height_feet, height_inches, height, weight_pounds;
   public Team team;
   
   public NBAPlayer() { }
   
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