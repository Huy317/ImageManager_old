import java.util.*;
public class Image {
    private String path;
    private ArrayList<String> tags;
    public Image(String path){
        this.path = path;
    }
    public Image(){
    }
    public String getPath(){
        return path;
    }
    public ArrayList<String> getTags(){
        return tags;
    }
    public String[] getTagsArray(){
        return tags.toArray(new String[tags.size()]);
    }
}
