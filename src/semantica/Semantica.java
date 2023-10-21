package semantica;

public class Semantica {
    private int rule,line,ambito;
    private String realValue, topStack;
    private boolean state; // true = aceptado false = error

    public Semantica(int rule, int line, int ambito, String realValue, String topStack, boolean state) {
        this.rule = rule;
        this.line = line;
        this.ambito = ambito;
        this.realValue = realValue;
        this.topStack = topStack;
        this.state = state;
    }
    @Override
    public String toString() {
        return String.format("%15d%15s%15s%15s%15d%15d",this.getRule(),this.getRealValue(),this.getTopStack(),this.isState() ? "ACEPTA" : "ERROR",this.getLine(),this.getAmbito());
    }
    public int getRule() {
        return rule;
    }

    public void setRule(int rule) {
        this.rule = rule;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getAmbito() {
        return ambito;
    }

    public void setAmbito(int ambito) {
        this.ambito = ambito;
    }

    public String getRealValue() {
        return realValue;
    }

    public void setRealValue(String realValue) {
        this.realValue = realValue;
    }

    public String getTopStack() {
        return topStack;
    }

    public void setTopStack(String topStack) {
        this.topStack = topStack;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
