public class Team{
   public int id;
   public String abbreviation, city, conference, division, full_name, name;
   
   public Team() { }
   
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