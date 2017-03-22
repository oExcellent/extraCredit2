

public class CourseGrades {

	public static void main(String[] args) {
		GradedActivity[] grades = new GradedActivity[4];
		
		grades[0] = new GradedActivity();
		grades[0].setScore(95);
		grades[1] = new PassFailExam(10, 1, 70);
		grades[2] = new Essay(30,20,20,30);
		grades[3] = new FinalExam(50, 7);
		
	  // Display the grades.
	  for (int i = 0; i < grades.length; i++)
	  {
	     System.out.println("Grades " + (i + 1) + ": " +
	                "score " + grades[i].getScore() +
	                ", grade " + grades[i].getGrade());
	  }
	}
  /*
	public void setLab(){}
	public void setPassFailExam(){}
	public void setEssay(){}
	public void setFinalExam(){}
	// Method toString()
	public String toString(){
		return grades[0].getScore() + grades[0].getGrade() +"\n"+
	         grades[1].getScore() + grades[1].getGrade() +"\n"+
	         grades[2].getScore() + grades[2].getGrade() +"\n"+
	         grades[3].getScore() + grades[3].getGrade() +"\n";
	}
}
	*/


}
