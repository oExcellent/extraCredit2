

public class Essay extends GradedActivity {
	private double grammer, spelling, correctLength, content;
	private double essayScore;
	
	public Essay(double gr, double sp, double cL, double co){
		grammer=gr;
		spelling=sp;
		correctLength=cL;
		content=co;

//	grammer=30 & spelling=20 & correctLength=20 & content=30
		essayScore = grammer + spelling + correctLength + content;
		super.setScore(essayScore);
	}
	// Need check on this setScore
	@Override
	public void setScore(double s){
		essayScore = s;
		super.setScore(essayScore);
	}
  public double getGrammer(){
     return grammer;
  }
  public double getSpelling(){
    return spelling;
  }
  public double getCorrectLength(){
    return correctLength;
  }
  public double getContent(){
    return content;
  }

}
