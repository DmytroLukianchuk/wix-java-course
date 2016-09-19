package homework4;
/**
 * Enum
 * Create a BEER enum which represents types of beer and holds the following info per each beer: type, alcohol content as described in below table
 * Create a program the will print all the beer types and its full information
 */
public enum Beer {
    HEINEKEN(5.0, "Lager"),
    GUINESS(4.2, "Stout"),
    BUDWEISER(5.0, "Lager"),
    CORONA(4.6, "Lager");

    private final double alcoholContent;
    private final String type;

    Beer(double alcoholContent, String type) {
        this.alcoholContent = alcoholContent;
        this.type = type;
    }

    @Override
    public String toString() {
        return name() + " Beer info {" +
                " alcoholContent = " + alcoholContent + "% " +
                ", type = " + type + " }";
    }

    public static void main(String[] args) {
        for (Beer b : Beer.values()) {
            System.out.println(b);
        }
    }
}
