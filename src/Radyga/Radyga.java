package Radyga;

public class Radyga {
    public static final String RED = "�������";
    public static final String ORANGE = "���������";
    public static final String YELLOW = "�����";
    public static final String GREEN = "�������";
    public static final String BLUE = "�����";
    public static final String INDIGO = "������";
    public static final String VIOLET = "����������";
    public static final String KRASNII = "������";
    public static final String ORANGEVII = "��������";
    public static final String JELTII = "����";
    public static final String ZELENII = "������";
    public static final String SINII = "����";
    public static final String INDIGOVII = "������";
    public static final String VIOLETOVII = "���������";
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
            System.out.println("������ �� �������");
        }

        return color;
    }

    public static void getRed(String color) {
        switch (color) {
            case RED:
                System.out.println("�������");
                break;
            case ORANGE:
                System.out.println("���������");
                break;
            case YELLOW:
                System.out.println("�����");
                break;
            case GREEN:
                System.out.println("�������");
                break;
            case BLUE:
                System.out.println("�����");
                break;
            case INDIGO:
                System.out.println("������");
                break;
            case VIOLET:
                System.out.println("����������");
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getKrasnii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("������" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("������" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("������" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("������" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("������" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("������" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("������" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getOrangevii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("��������" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("��������" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("��������" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("��������" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("��������" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("��������" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("��������" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getJeltii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("����" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("����" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("����" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("����" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("����" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("����" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("����" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getZelenii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("�����" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("�����" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("�����" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("�����" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("�����" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("�����" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("�����" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getSinii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("����" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("����" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("����" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("����" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("����" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("����" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("����" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getIndigovii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("������" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("������" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("������" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("������" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("������" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("������" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("������" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }

    public static void getVioletovii(String color) {
        switch (color) {
            case KRASNII:
                System.out.println("���������" + "-" + RED);
                break;
            case ORANGEVII:
                System.out.println("���������" + "-" + ORANGE);
                break;
            case JELTII:
                System.out.println("���������" + "-" + YELLOW);
                break;
            case ZELENII:
                System.out.println("���������" + "-" + GREEN);
                break;
            case SINII:
                System.out.println("���������" + "-" + BLUE);
                break;
            case INDIGOVII:
                System.out.println("���������" + "-" + INDIGO);
                break;
            case VIOLETOVII:
                System.out.println("���������" + "-" + VIOLET);
                break;
            default:
                System.out.println("������ �� �������");

        }
    }
}
