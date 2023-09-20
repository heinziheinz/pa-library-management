package service;

import Model.Book;
import Model.Creative;
import Model.LibraryItems;
import Model.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.List;

class LibraryManagementTest {

    LibraryItems booksOne;
    LibraryItems booksTwo;
    LibraryItems booksThree;
    LibraryManagement libraryManagement;

    @BeforeEach
    void setUp() {
        booksOne = new Book("1-2-3-4", "Frank");
        booksTwo = new Book("1-2-3-5", "John");
        booksThree = new Book("1-2-3-6", "Frank");
        libraryManagement = new LibraryManagement();
    }

    @org.junit.jupiter.api.Test
    void allBooksByCertainAuthor() {
        List<LibraryItems> books = List.of(booksOne,booksTwo, booksThree);
        LocalDate birthday = LocalDate.of(2022, 22,1);
        Creative author = new Creative(1,"Frank",birthday );
        libraryManagement.allBooksByCertainAuthor(books, author);
    }

    @org.junit.jupiter.api.Test
    void allMembersHowHaveBorrowedThreeItems() {
        //        - Create a function that retrieves all members who have borrowed 3 items
        List<LibraryItems> items = List.of(booksOne, booksTwo);
        List<LibraryItems> itemsTwo = List.of(booksOne, booksTwo, booksThree);
        Member member = new Member(1,"Karlegasse 3",439292,items);
        Member memberTwo = new Member(2,"Herr 3",439292, itemsTwo);
        List<Member> memersList = List.of(member, memberTwo);
        List<Member> actual= libraryManagement.allMembersHowHaveBorrowedThreeItems(memersList);
        List<Member> expected = List.of( memberTwo );
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void allauthorsAndArtistsHowWhereBornInACertainDecade() {
    }
}