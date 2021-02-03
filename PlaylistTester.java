package homework1;


public class PlaylistTester {
	
	public static void main(String[] args) {
		Playlist test= new Playlist();
		
		test.insertSong("Song1");
		test.insertSong("Song2");
		test.insertSong("Song3");
		test.insertSong("NewSong");
		test.insertSong("Song4");
		test.insertSong("Song1");
		
		System.out.println(test.size());
		System.out.println(test.contains("Song1"));
		System.out.println(test.toString());
		
		test.removeSong(3);
		
		System.out.println(test.toString());
		
		System.out.println(test.toHTMLString());

		
		
		}
	

}
