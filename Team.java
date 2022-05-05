/** The Team class creates a Team object which holds values for an NBA team*/
public class Team{
   public int id;
   public String abbreviation, city, conference, division, full_name, name;
   /** Constructer with no parameters */
   public Team() { }
   /** Constructor for NBA team that holds info pulled from API
   @param id holds the teams id number that the API has listed
   @param abbreviation holds the teams abbreviated name that the API has listed
   @param city holds the teams city they play for
   @param conference holds the teams conference that they are in
   @param division holds the teams division that they are in
   @param full_name holds the teams full team name: city and team
   @param name holds just the team's name but not the city
   */
   public Team(int id, String abbreviation, String city, String conference,
                  String division, String full_name, String name){
      this.id = id;
      this.abbreviation = abbreviation;
      this.city = city;
      this.conference = conference;
      this.division = division;
      this.full_name = full_name;
      this.name = name;
   }
}