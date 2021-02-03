package homework1;

//import linkedList.LinkedNode; (do I need something like this?)

public class Playlist extends Object {
	//instance variable
	Song head;
	
	//constructor
	public Playlist() {
		
	}
	
	
	
	//all following are methods
	public void clearPlaylist() { 
		if (this.head != null) {
			Song currentSong = this.head;
			while (currentSong.next != null) {
				currentSong = currentSong.next;
				currentSong.prev = null;
			}	
			if (currentSong != null & currentSong.next == null) {
				currentSong = null;
			}
		}
		
		/**
		 * Start by making sure this.head is not null
		 * loop through all songs and replace each with null
		 */
		//if there are any songs in play list, it get's rid of all songs 
		
		//TODO DOES NOT WORK, fix
	}
	
	public int size() {
		int count = 0; 
		Song currentSong = this.head; //1. initialization; 
		while (currentSong != null) {//2. test condition; 
			count ++;
			currentSong = currentSong.next;//3. change variable
		}
		return count;
	}
	public boolean insertSong(String name) {
		//adds a song with specified name to the end of the play list
		Song newSong = new Song(name);
		
		if (this.head == null) {
			this.head = newSong;
			return true;
		} 
		else if (this.head != null) {
			Song currentSong = this.head;
			
			while (currentSong.next != null) {
				currentSong = currentSong.next;
			}
			currentSong.next = newSong;
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean insertSong(String name, int pos) {
		//what happens in this method if pos > length of list?
		Song newSong = new Song(name);
		
		if (pos > 1){
			Song currentSong = this.head;
			int currentPosition = 1;
		
			while (currentSong.next != null && currentPosition < pos) {
				currentSong = currentSong.next;
				currentPosition ++;
				}
			currentSong.next = newSong;
			return true;
		}
		else {
			throw new IndexOutOfBoundsException(); 
			//I can't return false??
		}	
		
		/**
		 * if pos < 1 throw exception
		 * if pos is outside bounds throw exception (idk how to find this)
		 * 
		 * Keep track of current position (starts at beginning)
		 * Loop through list one song at a time and update Current position 
		 * until current position = pos - 1
		 * then the next song = new Song
		 */
		
		//adds a song with specified name to specified position in playlist
		//Throws IndexOutOfBoundsException if pos is out of bounds
		
		//TODO this does not work correctly
	}
	public boolean contains (String name) {
		Song currentSong = this.head;
		while (currentSong.next != null) {
			if (currentSong.name != name) {
				currentSong = currentSong.next;
			}
			else if (currentSong.name == name) {
				return true;
			}
		}
		return false;//will this return false every time? No!
	}	
		/**
		 * I'm going to loop through songs and compare currentSong name to name
		 * 	if currentSong.name != name
		 * 		move to next song
		 * 	if currentSong.name == name
		 * 		return true
		 * 		break?
		 * return false outside of loop if gets to end??
		 */
		//returns true if play list contains at least 1 specified song with the name
		//otherwise false

	public Song getSong(int pos) {
		Song currentSong = this.head;
		int currentPosition = 1;
		

		while (currentSong.next != null & currentPosition < pos) {
			currentSong = currentSong.next; 
			currentPosition ++;
			}
		return currentSong;
		} 
	//TODO how and where do I throw exception
		
		/**
		 * initialize currentPosition and currentSong to the head (pos 1)
		 * loop through until currentSong and currentPoisition is pos
		 * return the name of current song
		 */
		
		//returns the song at the specified position in the play list
		//Throws NullPointerException if unable to get song at specified position 
	
	
	
	//TODO public integer getSong(String name) 
		//returns the index of the first song with specified name from play list
		//return -1 if play list does not have any songs with specified name
	//}
	
	public boolean removeSong(int pos) {
		Song currentSong = this.head;
		int currentPosition = 1; 
		
		if (pos != 1) {
			while (currentPosition < pos) {
				currentPosition ++;
				currentSong = currentSong.next;
				}
			currentSong.next = currentSong.next.next;
			currentSong.next.next.prev  = currentSong; // this seems wrong
			return true;
		}
		else {
			this.head = this.head.next; 
			return false;
		}
		//TODO need to thow excpetion, also it removes one adter what I want to remove 

		//dereferencing the node with the value from the list
		
				//special cases/ base cases/ edge cases 
				//1. what if I remove the head?
				//	reassign head to point to head.next
				
				//2. What if I remove the tail?
				//	Find second to last node, assign that node.next = null
				
				//3. What if I remove something in between?
				//	Find the node before the one you want to delete
				// reassign the reference so that currentNode.next = currentNode.next.next
				
				//case 2 and 3 can be combined
				
				//1 edge case -> removing the head
				// general case -> find the node before the one you want to delete (while loop)
				// 					currentNode.next = currentNode.next.next
				
		//removes song at specified position from play list. Shifts any subsequent songs to the left
		// Throws IndexOutOfBoundsException if specified position is out of bounds
	}
	
	
	//TODO public boolean removeSong(String name) {
		
		//Removes song with specified name from play list
		// if multiple, remove the first occurrence
		//return true if removed successfully, otherwise false
	//}
	
	
	public String toString() {
		//returns a string representation of play list
		//returns empty string if play list is empty
		String str = "";
		Song currentSong = this.head;
		
		while(currentSong != null) {
			if(currentSong.next != null) {
				str += currentSong.name + "->";
			}
			else {
				str += currentSong.name;
				}
			currentSong = currentSong.next;
		}
		return str;
	}
	public String toHTMLString() {
		String str = "";
		String HTMLstr = "<html>" + str + "</html>";
		Song currentSong = this.head;
		
		while(currentSong != null) {
			if(currentSong.next != null) {
				str += currentSong.name + "<br/>";
			}
			else {
				str += currentSong.name;
				}
			currentSong = currentSong.next;
		}
		return HTMLstr; // is this supposed to print?
		
		//Return a String that starts with <html> ends with </html> 
		//uses the line breaks, <br/> in replacement of ->
		//prints out all the names of all the songs in the list. 
		//The purpose of this method is to display songs in the Applet.
		//TODO does not work, only returns "<html> </html>"
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
