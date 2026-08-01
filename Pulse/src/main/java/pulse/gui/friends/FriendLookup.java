package pulse.gui.friends;

import ru.pulse.Pulse;
import pulse.gui.core.PulseClickGuiScreen;

public final class FriendLookup {
    private FriendLookup() {
    }

    public static boolean isFriendName(String str) {
        FriendsTab friendsTabH;
        if ((Pulse.getInstance().getClickGui() instanceof PulseClickGuiScreen) && (friendsTabH = ((PulseClickGuiScreen) Pulse.getInstance().getClickGui()).h()) != null) {
            return friendsTabH.e().a().stream().anyMatch(historyEntry -> {
                return historyEntry.a().equalsIgnoreCase(str);
            });
        }
        return false;
    }

    public static boolean a(String str) {
        return isFriendName(str);
    }
}
