package maths;

public class Euclid {
    protected double a;
    protected double b;
    protected double pgcd;
    protected double u;
    protected double v;
    public void start(){
        double[] reste = new double[3];
        double[] u_al = new double[3];
        double[] v_al = new double[3];
        double quotient;
        double pgcd;

        reste[2] = this.a;
        reste[1] = this.b;
        reste[0] = this.a % this.b;
        
        quotient = ((reste[2] - reste[0]) / reste[1]);

        u_al[2] = 1; 
        u_al[1] = 0;
        u_al[0] = u_al[2] - (quotient * u_al[1]);

        v_al[2] = 0; 
        v_al[1] = 1;
        v_al[0] = v_al[2] - (quotient * v_al[1]);
        
        while(reste[0] != 0){
            reste[2] = reste[1];
            reste[1] = reste[0];
            reste[0] = reste[2] % reste[1];

            quotient = ((reste[2] - reste[0]) / reste[1]);

            u_al[2] = u_al[1];
            u_al[1] = u_al[0];
            u_al[0] = u_al[2] - (quotient * u_al[1]);

            v_al[2] = v_al[1];
            v_al[1] = v_al[0];
            v_al[0] = v_al[2] - (quotient * v_al[1]);
        }
        this.pgcd = reste[1];
        this.u = u_al[1];
        this.v = v_al[1];
    }
    public Euclid(double a, double b){
        this.a = a;
        this.b = b;
        this.start();
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getPgcd() {
        return pgcd;
    }
    public double getU() {
        return u;
    }
    public double getV() {
        return v;
    }
    public double getPPCM(){
        return ((this.a * this.b) / this.pgcd);
    }
}