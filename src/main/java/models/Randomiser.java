package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Randomiser
{

    private final ArrayList<String> nameList;

    public Randomiser() {
        this.nameList = new ArrayList<>(Arrays.asList("Angus", "Malcolm", "Steph", "Mike", "Sarah", "John"));
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
}
