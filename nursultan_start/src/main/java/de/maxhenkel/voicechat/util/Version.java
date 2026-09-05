/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public class Version
implements Comparable<Version> {
    public static Pattern ALSOFT_PATTERN = Pattern.compile("^.* ALSOFT (?<major>\\d+)(?:\\.(?<minor>\\d+)(?:\\.(?<patch>\\d+))?)?$");
    public static Pattern PATTERN = Pattern.compile("^(?<major>\\d+)(?:\\.(?<minor>\\d+)(?:\\.(?<patch>\\d+))?)?$");
    public final int major;
    public final int minor;
    public final int patch;

    public Version(int n, int n2, int n3) {
        this.major = n;
        this.minor = n2;
        this.patch = n3;
    }

    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }

    @Override
    public int compareTo(Version version) {
        int n = Integer.compare(this.major, version.major);
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(this.minor, version.minor);
        if (n2 != 0) {
            return n2;
        }
        return Integer.compare(this.patch, version.patch);
    }

    @Nullable
    public static Version fromVersionString(String string) {
        return Version.fromRegex(PATTERN, string);
    }

    @Nullable
    public static Version fromOpenALVersion(String string) {
        return Version.fromRegex(ALSOFT_PATTERN, string);
    }

    @Nullable
    private static Version fromRegex(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string2 = matcher.group("major");
        String string3 = matcher.group("minor");
        String string4 = matcher.group("patch");
        int n = string2 == null ? 0 : Integer.parseInt(string2);
        int n2 = string3 == null ? 0 : Integer.parseInt(string3);
        int n3 = string4 == null ? 0 : Integer.parseInt(string4);
        return new Version(n, n2, n3);
    }
}

