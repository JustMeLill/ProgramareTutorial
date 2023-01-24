package OOPAbstractizareInterfete;

public class Restaurante {

    private String denumire;
    private String felPrincipal;
    private Integer numerStele;

    public Restaurante(String denumire, String felPrincipal, Integer numerStele) {
        this.denumire = denumire;
        this.felPrincipal = felPrincipal;
        this.numerStele = numerStele;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getFelPrincipal() {
        return felPrincipal;
    }

    public void setFelPrincipal(String felPrincipal) {
        this.felPrincipal = felPrincipal;
    }

    public Integer getNumerStele() {
        return numerStele;
    }

    public void setNumerStele(Integer numerStele) {
        this.numerStele = numerStele;
    }

}
