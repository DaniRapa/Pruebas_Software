package contactapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void validContactCanBeCreated() {
        Contact contact = new Contact(
            "C001", "Laura", "Perez", "0123456789", "Calle 10"
        );

        assertEquals("C001", contact.getContactId());
        assertEquals("Laura", contact.getFirstName());
    }

    @Test
    void contactIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact(null, "Laura", "Perez", "0123456789", "Calle 10")
        );
    }

    @Test
    void phoneMustContainExactlyTenDigits() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("C001", "Laura", "Perez", "12345", "Calle 10")
        );
    }

    @Test
    void firstNameCanBeUpdated() {
        Contact contact = new Contact(
            "C001", "Laura", "Perez", "0123456789", "Calle 10"
        );

        contact.setFirstName("Maria");

        assertEquals("Maria", contact.getFirstName());
    }
    @Test
    void firstNameCannotBeEmpty() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("C001", "", "Perez", "0123456789", "Calle 10")
        );
    }

    @Test
    void lastNameCannotExceedTenCharacters() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("C001", "Laura", "ApellidoMuyLargo",
                        "0123456789", "Calle 10")
        );
    }

    @Test
    void addressCannotExceedThirtyCharacters() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("C001", "Laura", "Perez", "0123456789",
                        "Esta direccion tiene mas de treinta caracteres")
        );
    }
}