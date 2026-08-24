package oxxxde

// $VF: Compiled from heavy
public object صب : دِ("ScoreBoard", ظن.getRENDER(), "Настройки скорборда") {
   public final val noNumber: خذ = دِ.boolean$default(صب.INSTANCE, "Убрать числа", true, null, 4, null)
   public final val scoreboardScale: طُ = دِ.slider$default(صب.INSTANCE, "Размер", 1.0F, 0.1F, 3.0F, 0.01F, null, 32, null)
   public final val noScoreboard: خذ = دِ.boolean$default(صب.INSTANCE, "Убрать скорборд", false, null, 4, null)

   fun getScoreboardScale(): طُ {
      scoreboardScale
   }

   fun getNoScoreboard(): خذ {
      noScoreboard
   }

   fun getNoNumber(): خذ {
      noNumber
   }
}
