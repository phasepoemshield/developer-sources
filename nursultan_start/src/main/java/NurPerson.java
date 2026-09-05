/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.metadata.ContactInformation
 *  net.fabricmc.loader.api.metadata.Person
 */
import net.fabricmc.loader.api.metadata.ContactInformation;
import net.fabricmc.loader.api.metadata.Person;

final class NurPerson
implements Person {
    private final String name;

    NurPerson(String string) {
        this.name = string;
    }

    public String getName() {
        return this.name;
    }

    public ContactInformation getContact() {
        return ContactInformation.EMPTY;
    }
}

