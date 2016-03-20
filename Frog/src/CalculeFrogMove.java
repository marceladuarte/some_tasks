import java.util.ArrayList;
import java.util.List;

public class CalculeFrogMove {
	
	static Integer qtdMoves = 0;
	public static void main(String[] args) {
		calcMoves(3);
		System.out.println(qtdMoves);
	}
	

	private static void calcMoves(int moves) {
		List<String> results = new ArrayList<String>();
	    if (moves == 0) {
	        results.add("move");
	    } else if (moves > 0){
	        calcMoves(moves - 1);
	        calcMoves(moves - 2);
	    }
	    
	    if(!results.isEmpty()){
	    	qtdMoves++;
	    }
	}
	
	
}
