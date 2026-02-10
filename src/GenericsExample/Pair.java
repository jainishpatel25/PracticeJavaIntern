package GenericsExample;

import java.util.ArrayList;

//public class Pair<K,V> {
//
//	K message;
//	V code;
//	
//	Pair(K message,V code){
//		
//		this.message = message;
//		this.code = code;
//	}
//	
//	
//	public <T> void getStatus() {
//		System.out.println("Message is: " +message+ " code is: " +code);
//	}
//	
//	public static void main(String[] args) {
//		
//		Pair<Integer,String> p=new Pair<>(404,"NOT FOUND");
//		p.getStatus();
//		
//		Pair<String,Integer> p1=new Pair<>("Succes",400);
//		p1.getStatus();
//		
//		Pair<String,String> p2=new Pair<>("Succes","Resource Created");
//		p2.getStatus();
//		
//		
//	}
//}

public class Pair<K, V> {


    private K message;
    private V code;

  
    public Pair(K message, V code) {
        this.message = message;
        this.code = code;
    }

    
    public void getStatus() {
        System.out.println("Message is: " + message + " | Code is: " + code);
    }

    public static void main(String[] args) {
        
      
        Pair<Integer, String> p = new Pair<>(404, "NOT FOUND");
        p.getStatus();

        Pair<String, Integer> p1 = new Pair<>("Success", 200); 
        p1.getStatus();

        Pair<String, String> p2 = new Pair<>("Success", "Resource Created");
        p2.getStatus();
    }
}

//
//Message is: 404 code is: NOT FOUND
//Message is: Succes code is: 400
//Message is: Succes code is: Resource Created

