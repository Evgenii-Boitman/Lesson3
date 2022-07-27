package Radyga;

public class Radyga {
    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "жЄлтый";
    public static final String GREEN = "зеленый";
    public static final String BLUE = "синий";
    public static final String INDIGO = "индиго";
    public static final String VIOLET = "фиолетовый";
    public static final String KRASNII = "красно";
    public static final String ORANGEVII = "оранжево";
    public static final String JELTII = "жЄлто";
    public static final String ZELENII = "зелено";
    public static final String SINII = "сине";
    public static final String INDIGOVII = "индиго";
    public static final String VIOLETOVII = "фиолетово";
    private static String color;
    int x;
    int y;

    public String getColor() {
        int x = 1;
        int y = 7;
        if (x == 1 && y == 0) {
            getRed(RED);
        } else if (x == 1 && y == 1) {
            getKrasnii(KRASNII);
        } else if (x == 1 && y == 2) {
            getKrasnii(ORANGEVII);
        } else if (x == 1 && y == 3) {
            getKrasnii(JELTII);
        } else if (x == 1 && y == 4) {
            getKrasnii(ZELENII);
        } else if (x == 1 && y == 5) {
            getKrasnii(SINII);
        } else if (x == 1 && y == 6) {
            getKrasnii(INDIGOVII);
        } else if (x == 1 && y == 7) {
            getKrasnii(VIOLETOVII);
        } else if (x == 2 && y == 0) {
            getRed(ORANGE);
        } else if (x == 2 && y == 1) {
            getOrangevii(KRASNII);
        } else if (x == 2 && y == 2) {
            getOrangevii(ORANGEVII);
        } else if (x == 2 && y == 3) {
            getOrangevii(JELTII);
        } else if (x == 2 && y == 4) {
            getOrangevii(ZELENII);
        } else if (x == 2 && y == 5) {
            getOrangevii(SINII);
        } else if (x == 2 && y == 6) {
            getOrangevii(INDIGOVII);
        } else if (x == 2 && y == 7) {
            getOrangevii(VIOLETOVII);
        } else if (x == 3 && y == 0) {
            getRed(YELLOW);
        } else if (x == 3 && y == 1) {
            getJeltii(KRASNII);
        } else if (x == 3 && y == 2) {
            getJeltii(ORANGEVII);
        } else if (x == 3 && y == 3) {
            getJeltii(JELTII);
        } else if (x == 3 && y == 4) {
            getJeltii(ZELENII);
        } else if (x == 3 && y == 5) {
            getJeltii(SINII);
        } else if (x == 3 && y == 6) {
            getJeltii(INDIGOVII);
        } else if (x == 3 && y == 7) {
            getJeltii(VIOLETOVII);
        } else if (x == 4 && y == 0) {
            getRed(GREEN);
        } else if (x == 4 && y == 1) {
            getZelenii(KRASNII);
        } else if (x == 4 && y == 2) {
            getZelenii(ORANGEVII);
        } else if (x == 4 && y == 3) {
            getZelenii(JELTII);
        } else if (x == 4 && y == 4) {
            getZelenii(ZELENII);
        } else if (x == 4 && y == 5) {
            getZelenii(SINII);
        } else if (x == 4 && y == 6) {
            getZelenii(INDIGOVII);
        } else if (x == 4 && y == 7) {
            getZelenii(VIOLETOVII);
        } else if (x == 5 && y == 0) {
            getRed(BLUE);
        } else if (x == 5 && y == 1) {
            getSinii(KRASNII);
        } else if (x == 5 && y == 2) {
            getSinii(ORANGEVII);
        } else if (x == 5 && y == 3) {
            getSinii(JELTII);
        } else if (x == 5 && y == 4) {
            getSinii(ZELENII);
        } else if (x == 5 && y == 5) {
            getSinii(SINII);
        } else if (x == 5 && y == 6) {
            getSinii(INDIGOVII);
        } else if (x == 5 && y == 7) {
            getSinii(VIOLETOVII);
        } else if (x == 6 && y == 0) {
            getRed(INDIGO);
        } else if (x == 6 && y == 1) {
            getIndigovii(KRASNII);
        } else if (x == 6 && y == 2) {
            getIndigovii(ORANGEVII);
        } else if (x == 6 && y == 3) {
            getIndigovii(JELTII);
        } else if (x == 6 && y == 4) {
            getIndigovii(ZELENII);
        } else if (x == 6 && y == 5) {
            getIndigovii(SINII);
        } else if (x == 6 && y == 6) {
            getIndigovii(INDIGOVII);
        } else if (x == 6 && y == 7) {
            getIndigovii(VIOLETOVII);
        } else if (x == 7 && y == 0) {
            getRed(VIOLET);
        } else if (x == 7 && y == 1) {
            getVioletovii(KRASNII);
        } else if (x == 7 && y == 2) {
            getVioletovii(ORANGEVII);
        } else if (x == 7 && y == 3) {
            getVioletovii(JELTII);
        } else if (x == 7 && y == 4) {
            getVioletovii(ZELENII);
        } else if (x == 7 && y == 5) {
            getVioletovii(SINII);
        } else if (x == 7 && y == 6) {
            getVioletovii(INDIGOVII);
        } else if (x == 7 && y == 7) {
            getVioletovii(VIOLETOVII);
        } else if (x > 7 || x == 0 || x < 0 || y > 7 || y == 0 || y < 0) {
            System.out.println("÷ветов не найдено");
        }

        return color;
    }

    public static void getRed(String color) {
        switch (color) {
            case RED:
                System.out.println("красный");
                break;
            case ORANGE:
                System.out.println("оранжевый");
                break;
            case YELLOW:
                System.out.println("жЄлтый");
                break;
            case GREEN:
                System.out.println("зеленый");
                break;
            case BLUE:
                System.out.println("синий");
                break;
            case INDIGO:
                System.out.println("индиго");
                break;
            case VIOLET:
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getKrasnii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("красно" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("красно" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("красно" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("красно" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("красно" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("красно" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("красно" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getOrangevii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("оранжево" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("оранжево" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("оранжево" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("оранжево" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("оранжево" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("оранжево" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("оранжево" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getJeltii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("жЄлто" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("жЄлто" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("жЄлто" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("жЄлто" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("жЄлто" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("жЄлто" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("жЄлто" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getZelenii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("зелЄно" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("зелЄно" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("зелЄно" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("зелЄно" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("зелЄно" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("зелЄно" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("зелЄно" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getSinii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("сине" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("сине" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("сине" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("сине" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("сине" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("сине" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("сине" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getIndigovii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("индиго" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("индиго" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("индиго" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("индиго" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("индиго" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("индиго" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("индиго" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }

    public static void getVioletovii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("фиолетово" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("фиолетово" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("фиолетово" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("фиолетово" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("фиолетово" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("фиолетово" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("фиолетово" + "-" + VIOLET);
                break;
            default:
                System.out.println("÷ветов не найдено");

        }
    }
}
