package homework5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ZodiacSigns
 * <p>
 * Create an Enum called "ZodiacSigns" which will contain all the signs by their name and in additions the following information. Make sure to declare relevant fields & methods, Use Enum for Element as well.
 * Declare a program that will print the info of the sign represented by todays run date (the relevant sign will be chosen according to the sysdate)
 */
public enum ZodiacSigns {
    ARIES("Ram", ZodiacElements.FIRE, "21/03", "20/04", ZodiacPlanets.MARS),
    TAURUS("Bull", ZodiacElements.EARTH, "21/04", "20/05", ZodiacPlanets.EARTH),
    GEMINI("Twins", ZodiacElements.AIR, "21/05", "20/06", ZodiacPlanets.MERCURY),
    CANCER("Crab", ZodiacElements.WATER, "21/06", "20/07", ZodiacPlanets.MOON),
    LEO("Lion", ZodiacElements.FIRE, "21/07", "20/08", ZodiacPlanets.SUN),
    VIRGO("Maiden", ZodiacElements.EARTH, "21/08", "20/09", ZodiacPlanets.MERCURY),
    LIBRA("Scales", ZodiacElements.AIR, "21/09", "20/10", ZodiacPlanets.VENUS),
    SCORPIO("Scorpion", ZodiacElements.WATER, "21/10", "20/11", ZodiacPlanets.PLUTO),
    SAGITTARIUS("Archer", ZodiacElements.FIRE, "21/11", "20/12", ZodiacPlanets.JUPITER),
    CAPRICORN("Goat Horn", ZodiacElements.EARTH, "21/12", "20/01", ZodiacPlanets.SATURN),
    AQUARIUS("Water Carrier", ZodiacElements.AIR, "21/01", "20/02", ZodiacPlanets.URANUS),
    PISCES("Fish", ZodiacElements.WATER, "21/02", "20/03", ZodiacPlanets.NEPTUNE);


    private String translation;
    private ZodiacElements element;
    private String dateStart;
    private String dateEnd;
    private ZodiacPlanets planet;

    public String getTranslation() {
        return translation;
    }

    public ZodiacElements getElement() {
        return element;
    }

    public String getDateStart() {
        return dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public ZodiacPlanets getPlanet() {
        return planet;
    }


    ZodiacSigns(String translation, ZodiacElements element, String dateStart, String dateEnd, ZodiacPlanets planet) {
        this.translation = translation;
        this.element = element;
        this.planet = planet;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;

    }

    @Override
    public String toString() {
        return name() + " {" + "translation='" + translation + '\'' +
                ", element=" + element +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", planet=" + planet +
                '}';
    }

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        for (ZodiacSigns zodiacSigns : ZodiacSigns.values()) {
            System.out.println(zodiacSigns);
        }
    }
}