package fun.nexisdlc.ui.hud;

public final class ChatOverlayState {
    public static String hoveredElementName = null;

    private ChatOverlayState() {}

    public static boolean hideChatInfo = false;
    public static int hideBtnX, hideBtnY, hideBtnW, hideBtnH;
    public static int resetBtnX, resetBtnY, resetBtnW, resetBtnH;
    public static int ircBtnX, ircBtnY, ircBtnW, ircBtnH;
    public static boolean draggingAny = false;
    public static boolean barVisible = false;
    public static int barX, barY, barW, barH;
}
