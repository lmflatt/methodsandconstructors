/**
 * Created by lee on 8/29/16.
 *
 * Properties for studying, programming, and performing classical pieces
 */
public class MusicPiece {
    private String title;
    private String composer;
    private int year;
    private String genre;
    private boolean hasText = false;
    private boolean needsConductor = false;
    private String[] bestRecordings;


    ///// Constructors

    public MusicPiece() {

    }

    public MusicPiece(String t, String c, int y) {
        title = t;
        validateComposer(c);
        year = y;
    }

    public MusicPiece(String t, String c, int y, String g, String[] br) {
        title = t;
        validateComposer(c);
        year = y;
        genre = g;
        bestRecordings = br;
    }


    //// Setters
     public void setTitle(String t) {
         title = t;
     }

     public void setComposer(String c) {
         validateComposer(c);
     }

     public void setYear(int y) {
         year = y;
     }

     public void setGenre(String g) {
         genre = g;
     }

      public void setBestRecordings(String[] br) {
          bestRecordings = br;
      }

      ///// Validation and Simple activation for boolean properties

      private void validateComposer(String c) {
          if(c.contains(" ")) {
              composer = c;
          }
      }

      public void activateHasText() {
          hasText = true;
      }

      public void activateNeedsConductor() {
          needsConductor = true;
      }

      ////  Getters

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String[] getBestRecordings() {
        return bestRecordings;
    }

    public boolean isHasText() {
        return hasText;
    }

    public boolean isNeedsConductor() {
        return needsConductor;
    }
}
