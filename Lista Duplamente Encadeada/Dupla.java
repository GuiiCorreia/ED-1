public class Dupla {

    Dupla Prox;

    Dupla Ante;

    Object Elem;


    Dupla(Dupla Prox, Object Elem) {

        this.Prox = Prox;

        this.Ante = null;

        this.Elem = Elem;

    }


    Dupla(Object Elem) {

        this.Prox = null;

        this.Ante = null;

        this.Elem = Elem;

    }


    void setProx(Dupla Prox) {

        this.Prox = Prox;

    }
    public Dupla getProx() {

        return this.Prox;

    }


    void setAnte(Dupla Ante) {

        this.Ante = Ante;

    }
    public Dupla getAnte() {

        return this.Ante;

    }


    public Object getElem() {

        return this.Elem;

    }

}
