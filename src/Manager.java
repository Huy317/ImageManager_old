import  java.util.*;
import  java.io.*;
public class Manager {
    private HashMap<String,Image> map = new HashMap<String, Image>();

    public boolean add(Image im){
        if (map.get(im.getPath())==null){
            map.put(im.getPath(),im);
            return true;
        }
        return false;
    }
    //TODO: scan folder for images .png,.jpg,... -> create Image class with url -> add to list
    public void scanFolder(String path){
        
    }
    public void writeTo(String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Image im : map.values()){
                oos.writeObject(im);
            }
            oos.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void readFrom(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Image im = null;
            while ((im =(Image) ois.readObject()) != null){
                this.add(im);
            }
            ois.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
