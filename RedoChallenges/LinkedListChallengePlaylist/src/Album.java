import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            System.out.println(title + " : Not added. Already available. (addSong)");
            return false;
        } else {
            this.songs.add(new Song(title, duration));
            System.out.println(title + " : " + duration + " : Added. (addSong)");
            return true;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        trackNumber -= 1; //To change to start from index 0
        if ((trackNumber >= 0) && (trackNumber <= this.songs.size())) {
            playList.add(this.songs.get(trackNumber));
            return true;
        } else {
            System.out.println("This tracknumber: " + trackNumber + " is not available.");
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        } else {
            System.out.println("The song: " + title + " is not available.");
            return false;
        }
    }

    public Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

}
