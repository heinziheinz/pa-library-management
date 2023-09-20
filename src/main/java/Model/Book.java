package Model;

public record Book (String ISBN, String name) implements LibraryItems{
}

//    A book has an ISBN and a referenced Author.
