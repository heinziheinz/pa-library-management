package service;

import Model.LibraryItems;
import Model.Member;

import java.util.List;

public class MemberManagement {

    public void setItem(LibraryItems item, List<LibraryItems> items){
        if(items.size() < 4){
            items.add(item);
        }
    }

}
