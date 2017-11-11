package co.devcon.mynotes.model;

/**
 * Created by JameeDean on 11/11/2017.
 */

public class Note {

    private String title;
    private  String description;

    public  Note (String title, String description){
        this.title=title;
        this.description=description;
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



}
