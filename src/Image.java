import java.io.Serializable;
import java.util.ArrayList;

/*
 * This class represents an image.
 * It has a path and a list of tags.
 * @author Huy
 */
public class Image implements Serializable {
    private String path;
    private final ArrayList<Tag> tags = new ArrayList<Tag>();
    private final TagManager tagManager = TagManager.getInstance();

    /**
     * @param path url of the image i.e: "D:\\Images\example.jpg"
     */
    public Image(String path) {
        this.path = path;
    }

    public Image() {
    }

    /**
     * @return the name of the image i.e: "example.jpg"
     */
    public String getName() {
        return path.substring(path.lastIndexOf("\\") + 1);
    }

    /**
     * @return the name of the image without the extension i.e: "example"
     */
    public String getNameWithoutExtension() {
        return path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf("."));
    }

    /**
     * @return url of the image i.e: "D:\\Images\example.jpg"
     */
    public String getPath() {
        return path;
    }

    /**
     * @return a List of tags this image has
     */
    public ArrayList<Tag> getTags() {
        return tags;
    }

    /**
     * @return array of tags this image has
     */
    public Tag[] getTagsArray() {
        Tag[] array = new Tag[tags.size()];
        return tags.toArray(array);
    }

    public boolean hasTag(Tag tag) {
        return tags.contains(tag);
    }
    public boolean hasTag(String tag) {
        Tag tagToCheck = tagManager.getTag(tag);
        return tags.contains(tagToCheck);
    }
    public boolean addTag(Tag tag) {
        if (hasTag(tag)) {
            return false;
        }
        tags.add(tag);
        return true;
    }

    public void addTag(Tag[] tags) {
        if (tags == null) {
            return;
        }
        for (Tag tag : tags) {
            addTag(tag);
        }
    }
}
