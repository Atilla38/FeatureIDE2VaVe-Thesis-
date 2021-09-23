public  class HelloWorld {
	/*@ 
	 requires message != null;
	ensures \result.contains("Hello"); @*/
	 private String  print__wrappee__Hello  (String message){
		return message.concat("Hello");
	}

	/*@ 
	 requires ( message != null );
	ensures ( \result.contains("Hello") ) && \result.contains("beautiful"); @*/
	 private String  print__wrappee__Beautiful  (String message){
		return print__wrappee__Hello(message).concat(" beautiful");
	}

	/*@ 
	 requires ( ( message != null ) );
	ensures ( ( \result.contains("Hello") ) && \result.contains("beautiful") ) && \result.contains("world"); @*/
	protected String print(String message){
		return print__wrappee__Beautiful(message).concat(" world");
	}


	public static void main(String[] args){
		System.out.println(new HelloWorld().print(""));
	}


}
