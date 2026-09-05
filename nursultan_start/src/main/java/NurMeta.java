/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.SemanticVersion
 *  net.fabricmc.loader.api.Version
 *  net.fabricmc.loader.api.VersionParsingException
 *  net.fabricmc.loader.api.metadata.ContactInformation
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.ModDependency
 *  net.fabricmc.loader.api.metadata.ModEnvironment
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  net.fabricmc.loader.api.metadata.Person
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.loader.api.SemanticVersion;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;
import net.fabricmc.loader.api.metadata.ContactInformation;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModDependency;
import net.fabricmc.loader.api.metadata.ModEnvironment;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.Person;

final class NurMeta
implements ModMetadata {
    final String id;
    final String name;
    final String description;
    final Version version;
    final ModEnvironment env;
    final Map<String, CustomValue> custom;
    final Map<String, String> contact;
    final List<String> license;
    final List<String> provides;
    final List<String> authorNames;
    final String iconPath;

    NurMeta(String string, String string2, String string3, String string4, String string5, Map<String, CustomValue> map, Map<String, String> map2, List<String> list, List<String> list2, List<String> list3, String string6) {
        this.id = string;
        this.name = string2;
        this.description = string3;
        this.version = NurMeta.parseVersion(string4);
        this.env = "client".equals(string5) ? ModEnvironment.CLIENT : ("server".equals(string5) ? ModEnvironment.SERVER : ModEnvironment.UNIVERSAL);
        this.custom = map;
        this.contact = map2;
        this.license = list;
        this.provides = list2;
        this.authorNames = list3;
        this.iconPath = string6;
    }

    private static Version parseVersion(String string) {
        try {
            return SemanticVersion.parse((String)string);
        }
        catch (VersionParsingException versionParsingException) {
            return new NurVersion(string);
        }
    }

    public String getType() {
        return "fabric";
    }

    public String getId() {
        return this.id;
    }

    public Collection<String> getProvides() {
        return this.provides;
    }

    public Version getVersion() {
        return this.version;
    }

    public ModEnvironment getEnvironment() {
        return this.env;
    }

    public Collection<ModDependency> getDependencies() {
        return Collections.emptyList();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Collection<Person> getAuthors() {
        ArrayList<Person> arrayList = new ArrayList<Person>();
        for (String string : this.authorNames) {
            arrayList.add(new NurPerson(string));
        }
        return arrayList;
    }

    public Collection<Person> getContributors() {
        return Collections.emptyList();
    }

    public ContactInformation getContact() {
        return new NurContact(this.contact);
    }

    public Collection<String> getLicense() {
        return this.license;
    }

    public Optional<String> getIconPath(int n) {
        return Optional.ofNullable(this.iconPath);
    }

    public boolean containsCustomValue(String string) {
        return this.custom.containsKey(string);
    }

    public CustomValue getCustomValue(String string) {
        return this.custom.get(string);
    }

    public Map<String, CustomValue> getCustomValues() {
        return this.custom;
    }

    public boolean containsCustomElement(String string) {
        return this.custom.containsKey(string);
    }
}

