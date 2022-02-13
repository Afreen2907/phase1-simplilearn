package demo;

public class ContainsAnalyser extends StringAnalyser {

	@Override
	public boolean analyse(String target, String searchStr) {
		// TODO Auto-generated method stub
		return target.contains(searchStr);
	}

	
}
