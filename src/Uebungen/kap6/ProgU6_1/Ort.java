package Uebungen.kap6.ProgU6_1;

public class Ort<E> {

    private E element = null;
    private final int ortsId;

    public Ort (int ortsId){
        this.ortsId = ortsId;
    }

    public E entnehmen(){
        E ret = element;
        element = null;
        return ret;
    }

    public void hinzufügen(E e){
        if (!istBelegt()){
            element = e;
        }
    }

    public E getEingelagertesElement (){
        return element;
    }

    public boolean istBelegt(){
        return element != null;
    }

    public int getOrtsId() {
        return ortsId;
    }

    @Override
    public String toString() {
        return "OrtID:" + ortsId + " " + element.toString();
    }
}
