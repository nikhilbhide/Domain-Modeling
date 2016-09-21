

object MusicAlbum {
case class Album(volumes:Seq[Volume],name:String)
case class Volume(authors:Seq[Author], name:String)
case class Author(tracks:Seq[Track], name:String, country:String)
case class Track(songs:Seq[Song], name:String)
case class Song(name:String, length:Integer)

def main(args:Array[String]) {
	var album = getAlbum();
	//get all volumes from volume
	var volumeNames:Seq[String] = album.volumes.map(v=>v.name);
	println(volumeNames)

	//get all artists from volume and volumes from album
	var artistNames:Seq[String] = album.volumes.flatMap(
			volume=>volume.authors.map(
					author=>author.name
					)
			)
	println(artistNames);

	//above can be derived using for also
	artistNames = for {
		volume <- album.volumes
		author <- volume.authors
	}yield author.name
	println(artistNames)	
	
	//using filters inside for
	artistNames = for {
		volume <- album.volumes
		author <- volume.authors if author.country=="India"
	}yield author.name
	println(artistNames)	
	
	
}

def getAlbum():Album = {
		val songsList1 = Seq (Song("Test1",10),Song("Test2",10))
				val songsList2 = Seq (Song("Test3",10),Song("Test4",10))
				val songsList3 = Seq (Song("Test5",10),Song("Test6",10))
				val songsList4 = Seq (Song("Test7",10),Song("Test8",10))
				val songsList5 = Seq (Song("Test9",10),Song("Test10",10))
				val songsList6 = Seq (Song("Test11",10),Song("Test12",10))
				val songsList7 = Seq (Song("Test13",10),Song("Test14",10))
				val songsList8 = Seq (Song("Test15",10),Song("Test16",10))
				val songsList9 = Seq (Song("Test17",20),Song("Test18",10))
				val songsList10 = Seq (Song("Test19",20),Song("Test20",20))
				val songsList11 = Seq (Song("Test21",20),Song("Test22",20))
				val songsList12 = Seq (Song("Test23",20),Song("Test24",20))
				val songsList13 = Seq (Song("Test25",20),Song("Test26",20))
				val songsList14 = Seq (Song("Test27",20),Song("Test28",20))
				val songsList15 = Seq (Song("Test29",20),Song("Test30",20))
				val songsList16 = Seq (Song("Test31",20),Song("Test32",20))
				val trackList1= Seq(Track(songsList1,"Track1"),Track(songsList2,"Track2"))
				val trackList2= Seq(Track(songsList3,"Track3"),Track(songsList4,"Track4"))
				val trackList3= Seq(Track(songsList5,"Track5"),Track(songsList6,"Track6"))
				val trackList4= Seq(Track(songsList7,"Track7"),Track(songsList8,"Track8"))
				val trackList5= Seq(Track(songsList9,"Track9"),Track(songsList10,"Track10"))
				val trackList6= Seq(Track(songsList11,"Track11"),Track(songsList12,"Track2"))
				val trackList7= Seq(Track(songsList13,"Track3"),Track(songsList14,"Track4"))
				val trackList8= Seq(Track(songsList15,"Track5"),Track(songsList16,"Track6"))
				val authorList1=Seq(Author(trackList1,"Author1","India"),Author(trackList2,"Author2","Israel"))
				val authorList2=Seq(Author(trackList3,"Author3","USA"),Author(trackList4,"Author4","India"))
				val authorList3=Seq(Author(trackList5,"Author5","Israel"),Author(trackList2,"Author6","Thailand"))
				val authorList4=Seq(Author(trackList7,"Author7","India"),Author(trackList2,"Author8","Indonesia"))
				val album = Album(Seq(Volume(authorList1,"Volume1"),Volume(authorList2,"Volume2"),Volume(authorList3,"Volume3"),Volume(authorList4,"Volume4")),"TestAlbum")
				return album
}
}