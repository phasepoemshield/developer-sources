package fun.nexisdlc;

import lombok.Getter;
import lombok.Setter;

public class ClientContainer {
    private static final Nexis nexis = new Nexis();

    public static Nexis getNexisInstance() {
        return nexis;
    }

    @Getter
    private static final String name = "Nexis";
    @Getter
    private static final String buildDate = "18.06.2026";
    @Setter
    public static boolean hide = false;
    @Getter
    @Setter
    public static boolean started = false;
    @Getter
    @Setter
    public static String uid;
    @Getter
    @Setter
    public static String user;
    @Getter
    @Setter
    public static String role;
    @Getter
    @Setter
    public static String hwid;
    @Getter
    @Setter
    public static String subscription;
    @Getter
    @Setter
    public static long premium = 22;
    @Getter
    @Setter
    public static String ircLease;
    @Getter
    @Setter
    public static String globalsLease;

    public static boolean isHide() {
        return hide;
    }
}
