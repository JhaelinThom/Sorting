
public class Student {
private String name;
private int score;

public Student (String n, int s) {
	name = n;
	score = s;
	
}

//A getter will fetch the current information 
public String getName() {
	return name;
}
public int getScore() {
	return score;
}

//A setter will change the information 
public void setName(String n, int s) {
	name = n;
	score = s;
}

}
