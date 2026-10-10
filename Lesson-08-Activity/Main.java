class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	void print(String s){
		Systen.out.println(s);
	}

	double FtoC(double F){
		return 5./9*(f-32);
	}

	double sphereVolume(double radius){
		return 4/3.*Math.PI*Math.pow(radius,3);
	}

	double coneVolume(double radius, double height){
		return 1/3.*Math.PI*Math.pow(radius,2)*height;
	}

	double distance(double x1,
					double x2,
					double y1,
					double y2){
		return Math.sqrt(Math.pow(x1-x2,2) +	
						 Math.pow(y1-y2,2) );			)
	}

	
  }

  
 
}