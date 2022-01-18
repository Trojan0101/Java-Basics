import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();

    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact) >= 0) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println(newContact.getName() + " is already present in the contact list.");
            return false;
        } else {
            myContacts.set(oldContactIndex, newContact);
            System.out.println(oldContact.getName() + " is replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if (contactIndex >= 0) {
            System.out.println(contact.getName() + " was found at position " + contactIndex);
            myContacts.remove(contact);
            System.out.println(contact.getName() + " was removed from the contact list.");
            return true;
        } else {
            System.out.println(contact.getName() + " was not found in the contact list.");
            return false;
        }
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex >= 0) {
            return this.myContacts.get(contactIndex);
        } else {
            return null;
        }
    }

    public void printContacts() {
        for (Contact myContact : this.myContacts) {
            System.out.println(myContact.getName() + " -> " + myContact.getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

}
