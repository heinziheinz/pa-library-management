package Model;

import java.util.List;
import java.util.Objects;

public final class Member {
    private final int id;
    private final String address;
    private final int phoneNumber;

    private final List<LibraryItems> allBorrowedItems;

    public Member(int id, String address, int phoneNumber, List<LibraryItems> libraryItems) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.allBorrowedItems= libraryItems;
    }


    public int id() {
        return id;
    }

    public List<LibraryItems> allBorrowedItems(){
        return allBorrowedItems;
    }

    public String address() {
        return address;
    }

    public int phoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Member) obj;
        return this.id == that.id &&
                Objects.equals(this.address, that.address) &&
                this.phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Members[" +
                "id=" + id + ", " +
                "address=" + address + ", " +
                "phoneNumber=" + phoneNumber + ']';
    }

}

//        Members should have a name, address, and phone number.
