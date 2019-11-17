
public class SingletonDesing {

	private static volatile SingletonDesing _singletoninstance;
	
	private SingletonDesing() {}
	
	public static SingletonDesing getInstance() {
		
		if(_singletoninstance==null) {
			
			synchronized(SingletonDesing.class) {
				if(_singletoninstance==null) {
					_singletoninstance = new SingletonDesing();
				}
			}
		}
		return _singletoninstance;
		
	}
		
		
}

