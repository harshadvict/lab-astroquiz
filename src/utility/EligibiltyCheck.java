package utility;

import model.User;

public class  EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		if(18<=user.getAge() && user.getAge()<=35 && user.getHeight()>=155 && user.getHeight()<=170 && user.getWeight()>=55 && user.getWeight()<=90 && user.getCountry().equals("ProGrad") )
		{
			return true;
		}
		else
		{return false;}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int marks=Integer.parseInt(points);
		if(marks>80) {
			return true;
		}
		else 
		{
		return false;
		}
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		
		boolean goingOrNot =checkUser(user);
		return goingOrNot;
	}
	
}







