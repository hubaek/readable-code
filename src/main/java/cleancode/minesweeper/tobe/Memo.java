package cleancode.minesweeper.tobe;

import java.time.LocalDate;

public class Memo {


    public String createDailyShopKey(String shoId, String localDateString) {
        return String.format("%s_%s", shoId, localDateString);
    }

    public String createDailyShopKey(String shoId, LocalDate sellingDate) {
        return String.format("%s_%s", shoId, sellingDate);
    }



}

