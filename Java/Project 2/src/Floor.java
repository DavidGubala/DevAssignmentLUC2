public class Floor {
    public Room[] rooms;
    // private ArrayList<Room> roomChange;
    public int numSpaces; //array Room[] size current count
    public int level;  // floor level
    public int size;   //number of rooms
    FloorLayout number = new FloorLayout();


    public Floor(int size, int level) {
        this.size = size;
        rooms = new Room[size];
        numSpaces = 0;
        this.level = level;
    	createEmptyRooms();
    }

    public void createEmptyRooms() {
    	
    	for (int i = 1; i < size; i++) {
    		rooms[i] = new Room(i, 0, 0, 3, " ");
    		System.out.println(rooms[i].getRoomNum());
    		numSpaces ++;
    	}
    }

    public void addRoom(Room r) {
        if (numSpaces < size) {
            rooms[numSpaces] = r;
            numSpaces++;
        }
    }
	/*
	public void removeRoom(Room r, int index) {
		if(numSpaces > 1 && index < rooms.length - 1) {
		roomChange = new ArrayList<Room>(Arrays.asList(rooms));
		roomChange.remove(index);
		roomChange.toArray(rooms);

		}
	}
	*/

    public int getLevel() {
        return level;
    }

    public Room getRoom(int n) {
        return rooms[n + 1];
    }


}
