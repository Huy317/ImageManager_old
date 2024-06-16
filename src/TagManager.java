import java.util.ArrayList;
import java.util.HashMap;

/*
   this class is to keep count of all the tags
   it will create and load files that contains all tags created
*/
//TODO: implement search functions
public class TagManager {
    private final HashMap<String, Tag> map = new HashMap<>();
    private static TagManager instance;
    public TagManager(){
    }
    // Using singleton pattern so there's only one instance of this class exists
    public static synchronized TagManager getInstance(){
        if (instance == null) {
            instance = new TagManager();
        }
        return instance;
    }

    public void add(Tag tag) {
        map.putIfAbsent(tag.getName(), tag);
    }

    public void remove(Tag tag) {
        map.remove(tag.getName());
    }
    public Tag getTag(String name) {
        return map.get(name);
    }
    public ArrayList<Tag> getTagList() {
        return new ArrayList<Tag>(map.values());
    }

}
