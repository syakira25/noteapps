package co.devcon.mynotes.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

/**
 * Created by root on 28/10/2017.
 */
@IgnoreExtraProperties
public class NoteModel {

    private String title;
    private String description;
    private Date createdDate;

    public NoteModel() { }

    public NoteModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
