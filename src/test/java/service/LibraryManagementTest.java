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
        //        - Create a function that retrieves all books written by a certain author.
        List<LibraryItems> books = List.of(booksOne,booksTwo, booksThree);
        LocalDate birthday = LocalDate.of(2022, 12,1);
        Creative author = new Creative(1,"Frank",birthday );
        List<LibraryItems> actual = libraryManagement.allBooksByCertainAuthor(books, author);
        List<LibraryItems> expected = List.of(booksOne,booksThree);

        Assertions.assertEquals(expected,actual);
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
        //        - Create a function that retrieves all authors and artists who were born in the 90’s

        LocalDate birthday = LocalDate.of(2022, 12,1);
        LocalDate birthdayTwo = LocalDate.of(1990, 12,1);
        Creative author = new Creative(1,"Frank",birthday );
        Creative authorTwo = new Creative(1,"Daniel",birthdayTwo );
        List<Creative> creatives = List.of(author, authorTwo);
        List<Creative> actual = libraryManagement.allauthorsAndArtistsHowWhereBornInACertainDecade(creatives);
        List<Creative> expected = List.of(authorTwo);
        Assertions.assertEquals(expected, actual);
    }
}