public enum Currency {
    RON("Romania", "RO"),
    USD("Statele Unite ale Americii", "USA"),
    GBP("Marea Britanie", "UK"),
    TRY("Turcia", "TR"),
    EUR("Uniunea Europeana", "UE");

    private final String numeTara;
    private final String simbolTara;

    private Currency(String numeTara, String simbolTara) {
        this.numeTara = numeTara;
        this.simbolTara = simbolTara;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public String getSimbolTara() {
        return simbolTara;
    }
}
