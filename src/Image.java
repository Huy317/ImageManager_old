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
        String[] array = new String[tags.size()];
        return tags.toArray(array);
    }
    public boolean hasTag(String tag){
        return tags.contains(tag);
    }
    public boolean addTag(String tag){
        if(hasTag(tag)){
            return false;
        }
        tags.add(tag);
        return true;
    }
}
