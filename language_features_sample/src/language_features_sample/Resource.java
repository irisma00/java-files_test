package language_features_sample;

public class Resource implements AutoCloseable{
	private String r;
	public Resource(String name) {
		r = name;
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
