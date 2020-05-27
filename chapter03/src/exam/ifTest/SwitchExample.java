package exam.ifTest;

class SwitchExample {
 public static void main(String[] args) {
	    int total= 87;
	    switch(total/10) {
	    case 10 : 
	    	System.out.println("A+");
	    	break;
	    case 9 :
	    	System.out.println("A");
	    break;
	    default : 
	    	System.out.println("기본");
	    }
}
}
