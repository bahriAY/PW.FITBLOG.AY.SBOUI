package BlogSport;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

 /*   public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

    @Temporal(TemporalType.DATE)
    private Date myDate;


    public Date getDate() {
        this.myDate = null == myDate ? null : myDate.toDate();
    }*/



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Posts(long id) {
        this.id = id;
    }


    public Posts() {
    }

    public Long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
