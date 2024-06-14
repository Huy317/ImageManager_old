import  java.util.*;
import  java.io.*;
public class Manager {
    private ArrayList<Image> list = new ArrayList<Image>();
    


    public void add(Image im){
        list.add(im);
    }
    public void writeTo(String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Image im : list){
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
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
