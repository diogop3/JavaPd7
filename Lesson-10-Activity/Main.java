
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		/*Chanllenge1*/
		public static double gpa(double gpaValue) {
    		if (gpaValue > 90) {
        		return gpaValue * 1.1;
    		} else {
        		return gpaValue;
    		}
		}
		/*Chanllenge2*/
		function isGraduating(gradeLevel, credits) {
  			return gradeLevel === "Senior" && credits >= 44;
		}
		/*Challenge3*/
		public static String BMI(double weightInPounds, double heightInInches) {
    		double bmi = (weightInPounds / (heightInInches * heightInInches)) * 703;

    		if (bmi <= 18.4) {
        		return "Underweight";
    		} else if (bmi >= 18.5 && bmi <= 24.9) {
        		return "Normal";
    		} else if (bmi >= 25.0 && bmi <= 39.9) {
        		return "Overweight";
    		} else {
        		return "Obese";
			}
    	}
		/*Challenge4*/
		public static double shippingCost(double weight) {
    		if (weight <= 10) {
        		return 0.00;
    		} else if (weight <= 15) {
        		return 5.00;
    		} else if (weight <= 25) {
        		return 10.00;
    		} else {
        		return 10.00 + (weight - 25) * 0.02;
    		}
		}	
		/*Challenge5*/
		public static boolean blueOrViolet(double frequency) {
    		return (frequency >= 600 && frequency <= 670) || (frequency >= 700 && frequency <= 750);
		}


	}

}

}

  
   

  }

 
  
}