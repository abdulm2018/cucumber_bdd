package runner;

import io.cucumber.core.cli.Main;

public class Runner {

	public static void main(String[] args) {
		//String features="src/main/resources/feature";
		//Main.main(new String[] {features ,"-p" ,"pretty" ,"-m" ,"--monochrome",
		//		"-g","com/abhishek/hooks" ,"-g","classpath:com/abhishek/stepDefinitions"});
		String features="src/main/resources/features";
		Main.main(new String[] {features ,"-p" ,"pretty" ,"-p","html:target/html-reports","-p","json:target/cucumberJsonreport.json","-m" ,"--monochrome",
				"-g","hooks" ,"-g","classpath:stepDefinitions" ,"-t" ,"@t1"});
	}

}
