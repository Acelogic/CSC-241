package csc241hw01;

import java.util.ArrayList;

public class Vehicle {

    private String type;
    private ArrayList<Package> packages;
    private String ID;

    public Vehicle(String type,  String ID){
        this.type = type;
        this.ID = ID;
        this.packages = new ArrayList<Package>();
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
