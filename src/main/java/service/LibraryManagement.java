package service;

import Model.Book;
import Model.Creative;
import Model.LibraryItems;
import Model.Member;

import java.time.LocalDate;
import java.util.List;

public class LibraryManagement {

    public List<LibraryItems> allBooksByCertainAuthor(List<LibraryItems> books, Creative author) {
        //        - Create a function that retrieves all books written by a certain author.
        return books.stream().filter(book->book.name().equals(author.name())).toList();
    }


    public List<Member> allMembersHowHaveBorrowedThreeItems(List<Member> members) {
        //        - Create a function that retrieves all members who have borrowed 3 items
        return members.stream().filter(member -> member.allBorrowedItems().size() == 3).toList();
    }

    public List<Creative> allauthorsAndArtistsHowWhereBornInACertainDecade(List<Creative> creatives){

        return creatives.stream().filter(creative -> {
//            int year = creative.birthDate().getYear();
//            int decadeDigit = Character.getNumericValue(Integer.toString(year).charAt(2));
//            return decadeDigit == 9;
            return creative.birthDate().isAfter(LocalDate.of(1989,12,31))  &&  creative.birthDate().isBefore(LocalDate.of(2000,1,1));
        }).toList();
    }
}


//        - Create a function that retrieves all books written by a certain author.
//        - Create a function that retrieves all members who have borrowed 3 items
//        - Create a function that retrieves all authors and artists who were born in the 90’s
