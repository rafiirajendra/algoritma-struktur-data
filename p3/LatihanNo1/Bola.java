public class Bola {
    public double jaribola;

    public Bola(double jaribola){
        this.jaribola = jaribola;
    }

    public double hitungVolumeBola() {
        return (4/3) * Math.PI * Math.pow(jaribola, 3);
    }

    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * Math.pow(jaribola, 2);
    }
}