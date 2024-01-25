package maths;

public class Chinese_theo {
    protected int n, m , a , b , x, mn;
    protected Euclid uv;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setM(int m) {
        this.m = m;
    }
    public void setN(int n) {
        this.n = n;
    }
    private void setUv(Euclid uv) {
        this.uv = uv;
    }
    protected void setX(int xs) {
        xs = xs % mn;
        if(xs < 0){
            for(int i = 0; xs < 0; i++){
                xs = (mn * i) + xs;
            }
        }else{
            xs = xs % mn;
        }
        
        this.x = xs;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
    public Euclid getUv() {
        return uv;
    }
    public int getX() {
        return x;
    }
    protected void setMn(int mn) {
        this.mn = mn;
    }
    public Chinese_theo(int a, int b , int n, int m){
        this.setA(a);
        this.setB(b);
        this.setM(m);
        this.setN(n);
        this.setMn(this.m * this.n);
        this.setUv(new Euclid(m, n));
        if(this.uv.getPgcd() != 1){
            NullPointerException dException = new NullPointerException("the number " + this.n + " " + this.m + " isnt prime each over");
            dException.printStackTrace();
        }else{
            this.setX((int) ((this.b * this.uv.getV() * this.n) + (this.a * this.uv.getU() * this.getM())));
        }
    }
}
