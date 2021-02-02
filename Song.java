package homework1;

//my concerns: where is Object? Do I need to put it somewhere, does java know what object is?
public class Song extends Object {
	String name = "";
	Song next;
	Song prev;

	//Default constructor
	public Song() {
	
	}
	
	//Constructor with specific name
	public Song(String name) {
		this.name = name;
	}
	
	//Constructor with name, next song, previous song
	public Song(String name, Song next, Song prev) {
		this.name = name;
		this.next = next;
		this.prev = prev;
	
	}
	
	public String toString() {
		return this.name;
	}
	
	//my concerns: what does this do and why do I need it? And where does it go?
	public static void main(String[] args) {
	
	}

}
