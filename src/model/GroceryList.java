package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItems(String items){
        String[] splitItems = items.split(",");
        for(String item:splitItems){
            String trimmedItem=item.trim();
            if(checkItemsIsInList(trimmedItem)){
                System.out.println("listede mevcut");
            }else {
                this.items.add(item);
                sortItems();
            }
        }
    }

    public void removeItems(String items){
        String[] splitItems =items.split(",");
        for (String item:splitItems){
            String trimmedItem = item.trim();
            if(!checkItemsIsInList(trimmedItem)){
                System.out.println("zaten listede yok"+item);
            }else {
                this.items.remove(trimmedItem);
                sortItems();
            }
        }
    }
    public void printSorted(){
        for(String item:this.items){
            System.out.println(item);
        }
    }

    public boolean checkItemsIsInList (String item){
        return items.contains(item);
    }
    public void sortItems(){
        Collections.sort(this.items);
    }
}
