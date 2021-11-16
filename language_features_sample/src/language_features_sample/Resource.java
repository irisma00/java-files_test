package language_features_sample;

public class Resource implements AutoCloseable{
	private String resource;
	public Resource(String s) {
		resource = s;
		
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
