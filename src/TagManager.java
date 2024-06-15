import java.util.*;
import java.io.*;
/*
   this class is to keep count of all the tags
   it will create and load files that contains all tags created
*/
public class TagManager {
    private HashMap<String,Tag> map = new HashMap<>();

    public void add(Tag tag){
        map.putIfAbsent(tag.getName(),tag);
    }
    public void remove(Tag tag){
        map.remove(tag.getName());
    }
    public ArrayList<Tag> getTagList(){
        return new ArrayList<Tag>(map.values());
    }

}
