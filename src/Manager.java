import java.io.*;
import java.util.HashMap;
//TODO: implement add tags to images
//TODO: implement search functions
public class Manager {
    private static Manager instance;
    private final HashMap<String, Image> map = new HashMap<String, Image>();

    public Manager(){
    }
    public static synchronized Manager getInstance(){
        if (instance == null){
            instance = new Manager();
        }
        return instance;
    }
    public boolean add(Image im) {
        if (im == null) return false;
        if (map.get(im.getPath()) == null) {
            map.put(im.getPath(), im);
            return true;
        }
        return false;
    }

    public boolean add(String path) {
        Image im = new Image(path);
        return this.add(im);
    }


    /**
     * Scan for ALL images inside a folder/subfolders
     * uses Recrusions
     *
     * @param path the path/url to the folder
     */
    public void scanAll(String path) {
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        scanAll(file.getAbsolutePath()); // Recursively scan subfolders
                    } else {
                        String fileName = file.getName().toLowerCase();
                        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
                            this.add(file.toURI().toString());
                        }
                    }
                }
            }
        }
    }

    /**
     * Scan for images in selected folder ONLY
     * Does not use recursion
     *
     * @param path the path/url to the folder
     */
    public void scanOneFolder(String path) {
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (!file.isDirectory()) {
                        String fileName = file.getName().toLowerCase();
                        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
                            this.add(file.toURI().toString());
                        }
                    }
                }
            }
        }
    }

    public int getSize(){
        return map.size();
    }

    public void writeTo(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Image im : map.values()) {
                oos.writeObject(im);
            }
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFrom(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Image im = null;
            while ((im = (Image) ois.readObject()) != null) {
                this.add(im);
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
