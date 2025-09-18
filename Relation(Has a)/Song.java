class Song{
public String songName;
public int songTime;
public Singer singer;
public Song(String songName,int songTime,Singer singer){
this.songName=songName;
this.songTime=songTime;
this.singer=singer;

}
public void songDetails(){
System.out.println("Song is "+songName);
System.out.println("Song Written by "+singer.writerName);
System.out.println("Music by "+singer.music);

}


}