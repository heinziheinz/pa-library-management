package service;

import Model.LibraryItems;
import Model.Member;

import java.util.List;

public class MemberService {
    public static Member createMember(int id, String address, int phoneNumber, List<LibraryItems> libraryItems) {
        validateAmountOfItems(libraryItems.size());
//        (int id, String address, int phoneNumber, List<LibraryItems> libraryItems)
        return new Member(id, address, phoneNumber, libraryItems);
    }

    private static void validateAmountOfItems(int amountOfItems) {
        if (amountOfItems < 0 || amountOfItems > 3) {
            throw new IllegalArgumentException("Amount is not within the valid range [0, 3].");
        }
    }
}