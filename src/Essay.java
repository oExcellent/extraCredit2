

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
	
		public void setGrammer(double g){
		grammer = g/30;
		}
		public void getSpelling(double s){
		spelling = s/20;	
		}
		public void getCorrectLength(double c){
		correctLength = c/20;
		}
		public void getContent(double c){
		content = c/30;
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
