
package contactapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    private Contact createContact() {
        return new Contact(
            "C001", "Laura", "Perez", "0123456789", "Calle 10"
        );
    }

    @Test
    void contactCanBeAdded() {
        service.addContact(createContact());

        assertEquals(1, service.getContactCount());
        assertEquals("Laura", service.getContact("C001").getFirstName());
    }

    @Test
    void duplicateContactIdIsRejected() {
        service.addContact(createContact());

        Contact duplicate = new Contact(
            "C001", "Mario", "Lopez", "1234567890", "Calle 20"
        );

        assertThrows(
            IllegalArgumentException.class,
            () -> service.addContact(duplicate)
        );

        assertEquals(1, service.getContactCount());
    }

    @Test
    void contactCanBeDeleted() {
        service.addContact(createContact());

        service.deleteContact("C001");

        assertEquals(0, service.getContactCount());
        assertThrows(
            IllegalArgumentException.class,
            () -> service.getContact("C001")
        );
    }

    @Test
    void firstNameCanBeUpdated() {
        service.addContact(createContact());

        service.updateFirstName("C001", "Maria");

        assertEquals("Maria", service.getContact("C001").getFirstName());
    }

    @Test
    void lastNameCanBeUpdated() {
        service.addContact(createContact());

        service.updateLastName("C001", "Gomez");

        assertEquals("Gomez", service.getContact("C001").getLastName());
    }

    @Test
    void phoneCanBeUpdated() {
        service.addContact(createContact());

        service.updatePhone("C001", "9876543210");

        assertEquals("9876543210", service.getContact("C001").getPhone());
    }

    @Test
    void addressCanBeUpdated() {
        service.addContact(createContact());

        service.updateAddress("C001", "Carrera 15");

        assertEquals("Carrera 15", service.getContact("C001").getAddress());
    }

    @Test
    void updatingContactWithInvalidPhoneIsRejected() {
        service.addContact(createContact());

        assertThrows(
            IllegalArgumentException.class,
            () -> service.updatePhone("C001", "123")
        );

        assertEquals("0123456789", service.getContact("C001").getPhone());
    }

    @Test
    void deletingUnknownContactIsRejected() {
        assertThrows(
            IllegalArgumentException.class,
            () -> service.deleteContact("NOEXISTE")
        );
    }

    @Test
    void updatingUnknownContactIsRejected() {
        assertThrows(
            IllegalArgumentException.class,
            () -> service.updateFirstName("NOEXISTE", "Maria")
        );
    }
}
