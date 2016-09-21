package com.org.music;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MusicPlayer {
	public static void main(String [] args) {
		Album album = createMusicAlbum();

		List<String> listOfSongsExample1 = album.getVolume()
				.stream()
				.map(al->al.getAuthors())				     
				.flatMap(au->au.stream())
				.map(au->au.getTracks())
				.flatMap(t->t.stream())
				.map(t->t.getSongs())
				.flatMap(s->s.stream())
				.map(p->p.getName())
				.collect(Collectors.toList());
		listOfSongsExample1.forEach(System.out::println);
	}

	private static Album createMusicAlbum() {
		List<Song> songList1 = getItemList(new Song("Test1"),new Song("Test2"));
		List<Song> songList2 = getItemList(new Song("Test3"),new Song("Test4"));
		List<Song> songList3 = getItemList(new Song("Test5"),new Song("Test6"));
		List<Song> songList4 = getItemList(new Song("Test7"),new Song("Test8"));
		List<Song> songList5 = getItemList(new Song("Test9"),new Song("Test10"));
		List<Song> songList6 = getItemList(new Song("Test11"),new Song("Test12"));
		List<Song> songList7 = getItemList(new Song("Test13"),new Song("Test14"));
		List<Song> songList8 = getItemList(new Song("Test15"),new Song("Test16"));
		List<Song> songList9 = getItemList(new Song("Test17"),new Song("Test18"));
		List<Song> songList10 = getItemList(new Song("Test19"),new Song("Test20"));
		List<Song> songList11 = getItemList(new Song("Test21"),new Song("Test22"));
		List<Song> songList12 = getItemList(new Song("Test23"),new Song("Test24"));
		List<Song> songList13 = getItemList(new Song("Test25"),new Song("Test26"));
		List<Song> songList14 = getItemList(new Song("Test27"),new Song("Test28"));
		List<Song> songList15 = getItemList(new Song("Test29"),new Song("Test30"));
		List<Song> songList16 = getItemList(new Song("Test31"),new Song("Test32"));			
		List<Track> trackList1 = getItemList(new Track(songList1), new Track(songList2));
		List<Track> trackList2 = getItemList(new Track(songList3), new Track(songList4));
		List<Track> trackList3 = getItemList(new Track(songList5), new Track(songList6));
		List<Track> trackList4 = getItemList(new Track(songList7), new Track(songList8));
		List<Track> trackList5 = getItemList(new Track(songList9), new Track(songList10));
		List<Track> trackList6 = getItemList(new Track(songList11), new Track(songList12));
		List<Track> trackList7 = getItemList(new Track(songList13), new Track(songList13));
		List<Track> trackList8 = getItemList(new Track(songList15), new Track(songList16));
		List<Author> authorList1 = getItemList(new Author(trackList1), new Author(trackList2));
		List<Author> authorList2 = getItemList(new Author(trackList3), new Author(trackList4));
		List<Author> authorList3 = getItemList(new Author(trackList5), new Author(trackList6));
		List<Author> authorList4 = getItemList(new Author(trackList7), new Author(trackList8));
		Album album =  new Album(getItemList(new Volume(authorList1), new Volume(authorList2),new Volume(authorList3), new Volume(authorList4)));
		return album;
	}

	private static <T> List<T> getItemList(T... items) {
		return Arrays.asList(items);
	}	
}
