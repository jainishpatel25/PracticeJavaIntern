package Exception;

public class YoungAgeExcption extends RuntimeException{
	
	
public YoungAgeExcption( String msg) {
	super(msg);
}


class Voting{
public static void main(String[] args) {
	int a=16;	
	if(a<18) {
		throw new YoungAgeExcption("You Can Not Vote");
	}
	else{
		System.out.println("Vote Success");
	}
}

}
}