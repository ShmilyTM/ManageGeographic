package controller;

import java.util.ArrayList;
import model.Country;
import model.EastAsiaCountries;
import view.Validation;

public class Controller {
    private ArrayList<Country> ctList = new ArrayList<>();
    private Validation val = new Validation();
    
    public ArrayList<Country> getCurrentCtList(){
        return ctList;
    }
    
    public void addCountry() {
        String id = val.getString("Enter code of country: ");
        String name = val.getString("Enter name of country: ");
        double area = val.getDouble("Enter total area: ");
        String terrain = val.getString("Enter terrain of country: ");
        
        Country newCt = new EastAsiaCountries(id, name, area, terrain);
        ctList.add(newCt);
    }
    
    public void autoCreateCountry(){
        Country vn = new EastAsiaCountries("VN", "Vietnam", 331698.0, "Nice");
        Country us = new EastAsiaCountries("US", "USA", 831579.0, "Nice");
        Country cn = new EastAsiaCountries("CN", "China", 461875.0, "Bad");
        
        ctList.add(vn);
        ctList.add(us);
        ctList.add(cn);
        System.out.println(">>Done!!");
    }   
    
    
    public void displayCountry(ArrayList<Country> list) {
        System.out.println("ID      | Name          | Total Area      | Terrain");
        
        for (Country ct : list) {
            if(ct instanceof EastAsiaCountries) {
                System.out.printf("%-8s| %-14s| %-16.1f| %s\n", ct.getCountryCode(), ct.getCountryName(), ct.getTotalArea(), ((EastAsiaCountries) ct).getCountryTerrain());
            }
        }
    }

    public void searchInformationByName() {
        String name = val.getString("Enter name or ID country to find: ");
        
        ArrayList<Country> results = new ArrayList<>();

        for (Country c : ctList) {
            if (c.getCountryName().equalsIgnoreCase(name) || c.getCountryCode().equalsIgnoreCase(name)) {
                results.add(c);
            }
        }
        
        displayCountry(results);
    }

    public void sortInformationByAscendingOrder() {
        // Sắp xếp danh sách theo tên tăng dần
        ctList.sort((c1, c2) -> c1.getCountryName().compareTo(c2.getCountryName()));
        displayCountry(ctList);
    }
}
