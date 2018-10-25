package Lab6;
import java.util.*;

//Defines a class Player to store player information

class Player

{

//Instance variables to store player information

private String name;

private int goals;

private String team;

//Default constructor to initialize instance variables

Player()

{

name = team = "";

goals = 0;

}// End of default constructor

//Parameterized constructor to assign parameter values to instance variables

Player(String name, int goal, String team)

{

this.name = name;

this.goals = goal;

this.team = team;

}// End of parameterized constructor

//Method to set name

void setName(String name)

{

this.name = name;

}// End of method

//Method to set team name

void setTeam(String team)

{

this.team = team;

}// End of method

//Method to set number of goals

void setGoals(int goals)

{

this.goals = goals;

}// End of method

//Method to return name

String getName()

{

return name;

}// End of method

//Method to return team name

String getTeam()

{

return team;

}// End of method

//Method to return goals

int getGoals()

{

return goals;

}// End of method

//Overrides toString() to return Player information

public String toString()

{

return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;

}// End of method

}// End of class Player

//Defines a class Goal to store player information

class Goal

{

//Instance variables to store player information

private int minute;

private Player player;

//Default constructor to initialize instance variables

Goal()

{

minute = 0;

player = null;

}// End of default constructor

//Parameterized constructor to assign parameter values to instance variables

Goal(int min, Player p)

{

minute = min;

player = p;

}// End of parameterized constructor

//Method to set minute

void setMinute(int minute)

{

this.minute = minute;

}// End of method

//Method to set Player

void setPlayer(Player player)

{

this.player = player;

}// End of method

//Method to return minute

int getMinute()

{

return minute;

}// End of method

//Method to return Player

Player getPlayer()

{

return player;

}// End of method

//Overrides toString() to return Goal information

public String toString()

{

return "\n Minute at which the goal is scored: " + minute +

"\n The player scored the goal: " + player.getName();

}// End of method

}// End of class Goal

//Defines driver class SoccerMatch

public class SoccerMatch

{

//Instance variables to store match information

Date startTime;

Date endTime;

String venue;

String home;

String visitor;

Player homePlayers[];

Player visitorPlayers[];

Goal homeGoals[];

Goal visitorGoals[];

int homePlayerCounter, visitPlayerCounter;

int homeGoalCounter, visitGoalCounter;

//Default constructor to initialize instance variables

SoccerMatch()

{

startTime = endTime = null;

venue = home = visitor = null;

//Defines size to the arrays

homePlayers = new Player[11];

visitorPlayers = new Player[11];

homeGoals = new Goal[10];

visitorGoals = new Goal[10];

homePlayerCounter = visitPlayerCounter = homeGoalCounter = visitGoalCounter = 0;

//Loops 11 times for players to create players

for(int x = 0; x < 11; x++)

{

homePlayers[x] = new Player();

visitorPlayers[x] = new Player();

}// End of for loop

//Loops 10 times for goals to create goals

for(int x = 0; x < 10; x++)

{

homeGoals[x] = new Goal();

visitorGoals[x] = new Goal();

}// End of for loop

}// End of default constructor

//Parameterized constructor to assign parameter values to instance variables

SoccerMatch(Date st, Date en, String ven, String ho, String vi)

{

//Calls above default constructor

this();

startTime = st;

endTime = en;

venue = ven;

home = ho;

visitor = vi;

}// End of parameterized constructor

//Method to add a Player object to home team

void addHomePlayer(Player p)

{

homePlayers[homePlayerCounter++] = p;

}// End of method

//Method to add a Player object to visitor team

void addVisitorPlayer(Player p)

{

visitorPlayers[visitPlayerCounter++] = p;

}// End of method

//Method to add a Goal object to home team

void addHomeGoal(Goal g)

{

homeGoals[homeGoalCounter++] = g;

}// End of method

//Method to add a Goal object to visitor team

void addVisitorGoal(Goal g)

{

visitorGoals[visitGoalCounter++] = g;

}// End of method

//Returns the array of goals made by home team

int [] getHomeGoals()

{

//Creates an array to store home team goals

int goals[] = new int[10];

//Loops 10 times to store home team goals

for(int x = 0; x < 10; x++)

goals[x] = homeGoals[x].getPlayer().getGoals();

//Returns the goals

return goals;

}// End of method

//Returns the array of goals made by visitor team

int [] getVisitorGoals()

{

//Creates an array to store visitor team goals

int goals[] = new int[10];

//Loops 10 times to store visitor team goals

for(int x = 0; x < 10; x++)

goals[x] = visitorGoals[x].getPlayer().getGoals();

//Returns the goals

return goals;

}// End of method

//Method to return game winning or tie status

String getWinner()

{

String winStatus = "";

int homeGoals[] = getHomeGoals();

int visitGoals[] = getVisitorGoals();

int totHome = 0, totVisit = 0;

//Loop 10 times to calculate total for home team goal and visitor team goals

for(int x = 0; x < 10; x++)

{

//Calculates total goals for home team

totHome += homeGoals[x];

//Calculates total goals for visitor team

totVisit += visitGoals[x];

}// End of for loop

//Concatenates each team total goals

winStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;

//Checks if home team total goals is greater than the visitor team total goals

//Then concatenates home team as winner

if(totHome > totVisit)

winStatus += "\n Winner: Home Team";

//Otherwise checks if visitor team total goals is greater than the home team total goals

//Then concatenates visitor team as winner

else if(totVisit > totHome)

winStatus += "\n Winner: Visitor Team";

//Otherwise concatenates tie

else

winStatus += "\n Tie";

//Returns game status

return winStatus;

}// End of method

//main method definition

public static void main(String[] args)

{

//Creates a Random class object

Random rand = new Random();

//Creates two Date class object for starting and ending time for game

@SuppressWarnings("deprecation")

Date d1 = new Date(2018, 11, 12, 10, 12, 30);

@SuppressWarnings("deprecation")

Date d2 = new Date(2018, 11, 12, 12, 40, 30);

//Creates an object of SoccerMatch class object using parameterized constructor

SoccerMatch sm = new SoccerMatch(d1, d2, "Barabati", "Dragen", "Panthor");

//Creates a String array for home player names

String homePlayerName [] = {"Pyari", "Ram", "Sunil", "Anil", "Rita", "Gita", "Ritu", "Tinu", "Binu", "Anju", "Manju"};

//Creates a String array for visiting player names

String visitPlayerName [] = {"Mohan", "Nitu", "Gunu", "Nila", "Rohan", "Sohan", "Bilu", "Arun", "Sagar", "Satya", "Honi"};

//Loops 11 times to add players

for(int x = 0; x < 11; x++)

{

//Calls the method to add home team players

//Dynamically creates a Player class object using parameterized constructor

sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Dragen"));

//Calls the method to add visiting team players

//Dynamically creates a Player class object using parameterized constructor

sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Panthor"));

}// End of for loop

//Loops 10 times to add goals

for(int x = 0; x < 10; x++)

{

//Calls the method to add home team goals

//Dynamically creates a Goal class object using parameterized constructor

sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));

//Calls the method to add visiting team goals

//Dynamically creates a Goal class object using parameterized constructor

sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));

}// End of for loop

//Loops 11 times to display home team players information

System.out.print("\n\n*************************** Home Team Players *************************** ");

for(int x = 0; x < 11; x++)

System.out.println(sm.homePlayers[x]);

//Loops 11 times to display visiting team players information

System.out.print("\n\n*************************** Visiting Team Players *************************** ");

for(int x = 0; x < 11; x++)

System.out.println(sm.visitorPlayers[x]);

//Loops 10 times to display home team goals information

System.out.print("\n\n*************************** Home Team Goals *************************** ");

for(int x = 0; x < 10; x++)

System.out.println(sm.homeGoals[x]);

//Loops 10 times to display visiting team goals information

System.out.print("\n\n*************************** Visiting Team Goals *************************** ");

for(int x = 0; x < 10; x++)

System.out.println(sm.visitorGoals[x]);

//Displays game status

System.out.print("\n\n*************************** GAME STATUS *************************** ");

System.out.println(sm.getWinner());

}// End of main method

}// End of class SoccerMatch
