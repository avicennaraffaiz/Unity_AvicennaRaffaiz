public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        BorrowerRegistry borrowerRegistry = new BorrowerRegistry();

        Book book1 = new Book("The Shattering: The War of the Demigods", "Queen Marika",
                1095);
        Book book2 = new Book("Rennala and the Moon: Secrets of Caria", "Rennala, Queen " +
                "of the Full Moon", 1008);
        Book book3 = new Book("Godrick's Rise: The Story of Grafted Demigods", "Godrick " +
                "the Grafted", 1008);
        bookCollection.addItem(book1);
        bookCollection.addItem(book2);
        bookCollection.addItem(book3);

        User tarnished1 = new User("The Tarnished", "T001");
        User tarnished2 = new User("Melina", "T002");
        borrowerRegistry.addItem(tarnished1);
        borrowerRegistry.addItem(tarnished2);

        System.out.println("Cari buku dengan judul 'Shattering':");
        for (Book book : bookCollection.findByTitle("Shattering")) {
            System.out.println(book);
        }

        System.out.println("\nCari buku yang diterbitkan pada tahun 1008:");
        for (Book book : bookCollection.findByYear(1008)) {
            System.out.println(book);
        }

        System.out.println("\nCari user dengan ID 'T002':");
        User foundUser = borrowerRegistry.findByUserId("T002");

        if (foundUser != null) {
            System.out.println(foundUser);
        } else {
            System.out.println("User tidak ditemukan. ");
        }
    }
}