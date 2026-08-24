package oxxxde;

// $VF: Compiled from heavy
public class دن {
   private static final String separateLine = "-----------------------------------";

   public static void printAndExit(جأ exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("\n");
      stringBuilder.append("-----------------------------------".concat("\n"));
      stringBuilder.append("Renderer error occurred!\n");
      stringBuilder.append("-----------------------------------".concat("\n"));
      stringBuilder.append("Whats wrong?\n\n");
      stringBuilder.append(exception.getDescription().concat("\n"));
      stringBuilder.append("-----------------------------------".concat("\n"));
      stringBuilder.append("Details:\n\n");
      stringBuilder.append(exception.getDetails().concat("\n"));
      stringBuilder.append("-----------------------------------".concat("\n"));
      stringBuilder.append("Possible reasons:\n\n");

      for (int i = 0; i < exception.getReasons().length; i++) {
         stringBuilder.append(i + 1).append(".").append(exception.getReasons()[i]).append("\n");
      }

      stringBuilder.append("-----------------------------------".concat("\n"));
      stringBuilder.append("Possible solutions:\n\n");

      for (int var3 = 0; var3 < exception.getSolutions().length; var3++) {
         stringBuilder.append(var3 + 1).append(".").append(exception.getSolutions()[var3]).append("\n");
      }

      stringBuilder.append("-----------------------------------");
      ِ.getLogger().error(stringBuilder.toString());
      exception.printStackTrace();
      System.exit(-1);
   }
}
