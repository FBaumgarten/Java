package AE.tag06.nachmittag;

public class GrundFunktionenZahl extends GrundFunktionen {

    private int iValue;

    protected int getIValue() {
        return iValue;
    }

    protected void setIValue(int iValue) {
        this.iValue = iValue;
    }

    @Override
    public void eingabe() {
        super.eingabe();
        setIValue(convertToInt(this.getValue()));
    }

    @Override
    public void ausgabe() {
        if (getIValue() >= 0) System.out.println(getIValue());
        else System.out.println("Unzulässiger Wert");
    }

    protected boolean isZahl(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    int convertToInt(String string) {
        if (isZahl(string)) return Integer.valueOf(string);
        else return -1;
    }
}

