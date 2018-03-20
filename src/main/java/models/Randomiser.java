package models;

import java.util.ArrayList;
import java.util.Collections;

public class Randomiser
{

    private ArrayList<String> nameList;

    public Randomiser() {
        this.nameList = new ArrayList<>();
        nameList.add("Angus");
        nameList.add("Baylis");
        nameList.add("Chris");
        nameList.add("Jamie");
        nameList.add("Euan");
        nameList.add("Gordon");
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }

    public String shuffleNameListGetName(){
        Collections.shuffle(nameList);
        return nameList.get(0);
    }

    public ArrayList<String> getTwoRandomNames(){
        ArrayList<String> multiNames = new ArrayList<>();
        multiNames.add(shuffleNameListGetName());
        multiNames.add(shuffleNameListGetName());
        return multiNames;
    }

    public ArrayList<String> getThreeRandomNames(){
        ArrayList<String> multiNames = new ArrayList<>();
        multiNames.add(shuffleNameListGetName());
        multiNames.add(shuffleNameListGetName());
        multiNames.add(shuffleNameListGetName());
        return multiNames;
    }
}
