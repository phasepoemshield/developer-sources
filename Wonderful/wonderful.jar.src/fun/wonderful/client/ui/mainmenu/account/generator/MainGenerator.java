package fun.wonderful.client.ui.mainmenu.account.generator;

import java.util.List;
import java.util.Random;

public final class MainGenerator {
    private static final Random RANDOM = new Random();
    private static final List<String> NICKS = List.of("utonem_", "nfkvi", "avamiss", "fozix1337", "MADE1337", "fanatik11", "kare_towerz", "xatyykov", "Bosikomoe", "abs0lutikov", "andry338", "sigam1", "UwUdate", "OmerPenka1", "energy_noboost", "elenmay", "macc", "javlin", "zxcrep", "Arderos", "Andeck__", "Melisahvh", "lemotzz", "Pupsek777", "Alderston", "KageNew", "cruelkid_", "ridiska1234", "GlimmerStar", "nolvpvp", "Agrest0", "BillyBoss", "Kelss", "verovski", "quix1e", "Demeda", "stormguss", "Reaqwem", "maYshifer", "bebra461", "W1lddFlame", "Tyngar", "SanyaHF", "Woltreks", "CATAC", "AsikK1", "Emill1999", "wwesher1", "DAN90D", "NoMercyEzz", "Gorgonich", "prof1i", "NeRL1X_XS", "Starusty");

    private MainGenerator() {
    }

    public static String generate() {
        Object base = NICKS.get(RANDOM.nextInt(NICKS.size()));
        if (RANDOM.nextBoolean()) {
            base = (String)base + RANDOM.nextInt(10, 999);
        }
        return ((String)base).length() > 16 ? ((String)base).substring(0, 16) : base;
    }
}