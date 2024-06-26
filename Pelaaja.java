package harjoitustyo;

/**
 * Luokka, joka kuvaa pelaajaa
 */
public class Pelaaja {

    // Muuttujat mitkä vaikuttavat mailan jäykkyyteen, pituuteen ja kätisyyteen.

    /** Pelaajan pituus metreinä. Mailan pituus=omapituus-25cm */
    private double pituus;

    /** Pelaajan paino kilogrammoina. Mailan jäykkyys=omapaino*1.07 */
    private double paino;

    /** Pelaajan kätisyys, eli leftin vai rightin maila. oikekätisille lefti ja vasenkätisille righti */
    private String katisyys;

    /**
     * Pelaajan voimataso (1-3)
     * <p>
     * Voimataso 1 on heikoin, 2 on neutraali ja 3 vahva. Vaikutukset mailan jäykkyyteen: 1=-5, 2=0, 3=+5
     */
    private int voimataso;

    /**
     * Luo uuden pelaajaolion annetuilla parametreillä.
     *
     * @param pituus    Pelaajan pituus metreinä.
     * @param paino     Pelaajan paino kilogrammoina.
     * @param katisyys  Pelaajan kätisyys, "left" tai "right".
     * @param voimataso Pelaajan voimataso, kokonaisluku välillä 1-3.
     * @throws IllegalArgumentException jos annettu voimataso ei ole välillä 1-3.
     */
    public Pelaaja(double pituus, double paino, String katisyys, int voimataso) {
        this.pituus = pituus;
        this.paino = paino;
        this.katisyys = katisyys;
        // Tarkistetaan, että voimataso on välillä 1-3
        if (voimataso < 1 || voimataso > 3) {
            throw new IllegalArgumentException("Voimataso tulee olla välillä 1-3");
        }
        this.voimataso = voimataso;
    }

    /**
     * Tulostaa pelaajan tiedot.
     */
    public void tulostaTiedot() {
        System.out.println("Pelaajan pituus: " + pituus + " metriä");
        System.out.println("Pelaajan paino: " + paino + " kilogrammaa");
        System.out.println("Pelaajan kätisyys: " + katisyys);
        System.out.println("Pelaajan voimataso: " + voimataso);
    }

    // Getterit ja setterit muuttujille

    /**
     * Palauttaa pelaajan pituuden.
     *
     * @return pelaajan pituus metreinä.
     */
    public double getPituus() {
        return pituus;
    }

    /**
     * Asettaa pelaajan pituuden.
     *
     * @param pituus pelaajan uusi pituus metreinä.
     */
    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    /**
     * Palauttaa pelaajan painon.
     *
     * @return pelaajan paino kilogrammoina.
     */
    public double getPaino() {
        return paino;
    }

    /**
     * Asettaa pelaajan painon.
     *
     * @param paino pelaajan uusi paino kilogrammoina.
     */
    public void setPaino(double paino) {
        this.paino = paino;
    }

    /**
     * Palauttaa pelaajan kätisyyden.
     *
     * @return pelaajan kätisyys, "left" tai "right".
     */
    public String getKatisyys() {
        return katisyys;
    }

    /**
     * Asettaa pelaajan kätisyyden.
     *
     * @param katisyys pelaajan uusi kätisyys, "left" tai "right".
     */
    public void setKatisyys(String katisyys) {
        this.katisyys = katisyys;
    }

    /**
     * Palauttaa pelaajan voimatason.
     *
     * @return pelaajan voimataso (1-3).
     */
    public int getVoimataso() {
        return voimataso;
    }

    /**
     * Asettaa pelaajan voimatason.
     *
     * @param voimataso pelaajan uusi voimataso: kokonaisluku (1-3).
     * @throws IllegalArgumentException jos annettu voimataso ei ole välillä 1-3.
     */
    public void setVoimataso(int voimataso) {
        // Tarkistetaan, että voimataso on välillä 1-3
        if (voimataso < 1 || voimataso > 3) {
            throw new IllegalArgumentException("Voimataso tulee olla välillä 1-3");
        }
        this.voimataso = voimataso;
    }
}
