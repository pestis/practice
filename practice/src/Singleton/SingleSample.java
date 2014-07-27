package Singleton;

public class SingleSample {

	  //create an object of SingleObject

	  private static SingleSample instance = new SingleSample();

	  //make the constructor private so that this class cannot be
	  //instantiated
	  private SingleSample(){}

	  //Get the only object available
	  public static SingleSample getInstance(){
	  
	      return instance;
	  }

	  public void showMessage(){
	      System.out.println("Hello World!");
	  }
	  
	  
	  
	  public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleSample object = SingleSample.getInstance();
	      
	      //show the message
	      object.showMessage();
	  }
	  
	}