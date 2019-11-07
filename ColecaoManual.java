
public class ColecaoManual {
	String[] collection = new String[200];
		
	public void push(String item) {
		for(int i = 0; i<=this.collection.length; i++) {
			if (this.collection[i] == null) {
				this.collection[i] = item;
				return;
			}
		}
	}
	
	public String[] getCollection() {
		return collection;
	}

}
