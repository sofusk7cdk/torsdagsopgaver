String[] musicalArtists = {"Benson Boone","Ed Sheeran","Travis Scott","Polo G","KESI"};
String[] artistSongs = {"Song1","Song2","Song3","Song4","Song5"};

int i = 1;

for(String x:musicalArtists){
  println(i + ". " + x);
  i = i + 1;
}

for (int x = 0; x < musicalArtists.length; x++) {
  System.out.println((x + 1) + ". " + musicalArtists[x] + " : " + artistSongs[x]);
}
