package data_structures_and_algos_java.word_problems;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileFilter {
    FileFilter(String path){
        this.namePath = new File(path);
        this.files = Arrays.asList(namePath.listFiles()); 
    }

    File namePath;
    List<File> files;


    //filter greater than
    public void filterGreaterThan(long fileSize){
        List<File> temp = new ArrayList<File>();
        for(int i = 0; i < files.size(); i++){
            temp.add(files.get(i));
            if(temp.get(i).length() < fileSize){
                temp.remove(i);
            }
        }
        files = temp;

    }


    //filter less than
    public void filterLessThan(long fileSize){
        List<File> temp = new ArrayList<File>();
        for(int i = 0; i < files.size(); i++){
            temp.add(files.get(i));
            if(temp.get(i).length() > fileSize){
                temp.remove(i);
            }
        }
        files = temp;
    }

    //filter by name
    public void filterByName(String stringArg){
        List<File> temp = new ArrayList<File>();
        for(int i = 0; i < files.size(); i++){
            temp.add(files.get(i));
            if(!temp.get(i).getName().contains(stringArg)){
                temp.remove(i);
            }
        }
        files = temp;
    }

    //return
    public List<File> displayFiles(){
        return files;
    }
    
}
