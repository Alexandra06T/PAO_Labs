public class ConversieCurrencyImpl implements ConversieCalcul {
    @Override
    public double conversieValutaToEur(double valuta, Currency currency) {
        switch (currency) {
            case EUR -> {
                return valuta;
            }
            case RON -> {
                return valuta * 0.2;
            }
            case GBP -> {
                return valuta * 1.17;
            }
            case USD -> {
                return valuta * 0.92;
            }
            case TRY -> {
                return valuta * 0.029;
            }
            default -> {
                return 0;
            }
        }
    }

    @Override
    public double calculRata() {
        return 0;
    }
}
