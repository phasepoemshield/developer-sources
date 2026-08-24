package oxxxde;

// $VF: Compiled from heavy
public final class رغ {
   public static final String DEBUG_USERNAME = "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
   public static final boolean debugMode = true;
   public static final String DEBUG_AVATAR = "";
   public static final int DEBUG_UID = 753;
   public static final boolean buildMode = true;
   private static final String DEBUG_UID_PROPERTY = "rain.debug.uid";
   public static final String DEBUG_ROLE = "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
   public static final String DEBUG_SUBSCRIPTION_TILL = "Lifetime";
   private static final String DEBUG_USERNAME_PROPERTY = "rain.debug.usernamY";

   private static String getDebugUsername() {
      String configured = System.getProperty("rain.debug.usernamY", "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami").trim();
      return configured.isEmpty() ? "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami" : configured;
   }

   public static String getDisplayName() {
      return getDebugUsername() + " (#" + getDebugUid() + ")";
   }

   public static boolean isValid() {
      return (boolean)Integer.signum(Math.max(getDebugUid(), 0));
   }

   public static void initializeUserProfile() {
   }

   public static String getSubscriptionTill() {
      return "Lifetime";
   }

   public static void refreshUserProfile() {
   }

   private رغ() {
   }

   public static String getUsername() {
      return getDebugUsername();
   }

   private static int getDebugUid() {
      return Integer.getInteger("rain.debug.uid", 753);
   }

   public static String getRole() {
      return "Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami";
   }

   public static int getUid() {
      return getDebugUid();
   }

   public static boolean isAdmin() {
      return "admin".equalsIgnoreCase("Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami");
   }

   public static String getAvatar() {
      return "";
   }
}
