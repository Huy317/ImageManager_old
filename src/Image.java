import java.util.*;
import  java.io.*;
/*
 * This class represents an image.
 * It has a path and a list of tags.
 * @author Huy
 */
public class Image implements Serializable {
    private String path;
    private ArrayList<String> tags = new ArrayList<String>();
    /**
     *
     * @param path url of the image i.e: "D:\\Images\example.jpg"
     */
    public Image(String path){
        this.path = path;
    }
    public Image(){
    }

    /**
     *
     * @return url of the image i.e: "D:\\Images\example.jpg"
     */
    public String getPath(){
        return path;
    }

    /**
     *
     * @return a List of tags this image has
     */
    public ArrayList<String> getTags() {
        return tags;
    }
    /**
     *
     * @return array of tags this image has
     */
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
    public void addTag(String[] tags){
        if (tags == null){
            return;
        }
        for (String tag : tags){
            addTag(tag);
        }
    }
}
