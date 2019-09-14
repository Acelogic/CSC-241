package csc241hw01;

import java.util.ArrayList;
import java.util.Arrays;

public class Vehicle {

    private String type;
    private ArrayList<Package> packages;
    private String ID;

    public Vehicle(String type, Package[] packages, String ID){
        this.type = type;
        this.ID = ID;
        this.packages = new ArrayList<>(Arrays.asList(packages));



    }


    public String getType(){

        return type;
    }

    public Package[] getPackages(){
        Package[] packageArr = packages.toArray(new Package[packages.size()]);
        return packageArr;
    }

    public String getID(){
        return ID;
    }

    public void addPackage(Package p){
       packages.add(p);

    }
}
