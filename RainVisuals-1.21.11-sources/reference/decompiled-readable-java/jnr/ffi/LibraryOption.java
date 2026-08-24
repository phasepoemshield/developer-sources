/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

public final class LibraryOption
extends Enum<LibraryOption> {
    public static final /* enum */ LibraryOption FunctionMapper;
    public static final /* enum */ LibraryOption CallingConvention;
    public static final /* enum */ LibraryOption PreferCustomPaths;
    public static final /* enum */ LibraryOption SaveError;
    private static final /* synthetic */ LibraryOption[] $VALUES;
    public static final /* enum */ LibraryOption IgnoreError;
    public static final /* enum */ LibraryOption TypeMapper;
    public static final /* enum */ LibraryOption LoadNow;

    public static LibraryOption valueOf(String name) {
        return Enum.valueOf(LibraryOption.class, name);
    }

    static {
        SaveError = new LibraryOption();
        IgnoreError = new LibraryOption();
        TypeMapper = new LibraryOption();
        FunctionMapper = new LibraryOption();
        CallingConvention = new LibraryOption();
        LoadNow = new LibraryOption();
        PreferCustomPaths = new LibraryOption();
        $VALUES = LibraryOption.$values();
    }

    private static /* synthetic */ LibraryOption[] $values() {
        LibraryOption[] libraryOptionArray = new LibraryOption[7];
        libraryOptionArray[0] = SaveError;
        libraryOptionArray[1] = IgnoreError;
        libraryOptionArray[2] = TypeMapper;
        libraryOptionArray[3] = FunctionMapper;
        libraryOptionArray[4] = CallingConvention;
        libraryOptionArray[5] = LoadNow;
        libraryOptionArray[6] = PreferCustomPaths;
        return libraryOptionArray;
    }

    public static LibraryOption[] values() {
        return (LibraryOption[])$VALUES.clone();
    }
}

