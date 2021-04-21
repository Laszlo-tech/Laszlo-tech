package Workshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private Date publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    try {
      this.publicationDate = new SimpleDateFormat("yyyy.MM.dd").parse(publicationDate);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public Date getPublicationDate() {
    return publicationDate;
  }
}
