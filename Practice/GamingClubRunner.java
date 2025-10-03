class GamingClubRunner{

public static void main(String [] args){

Xbox xbo = new Xbox("Xbox S",50000);
PlayStation playStatio = new PlayStation("Sony",60000);
Wolfpack wolfpack = new Wolfpack("Valvorant",35,playStatio,xbo);

Xbox xbx = new Xbox("Xbox X",50500);
PlayStation playSation = new PlayStation("Sony",60000);
Thunder thunder = new Thunder("Theja","Free Fire",playSation,xbx);

wolfpack.displayWolfpackDetails();
System.out.println("--------------");
thunder.thunderDetails();

}
}