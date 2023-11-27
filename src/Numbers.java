public class Numbers {
    int numar;

    public Numbers(int numar) {
        this.numar = numar;
    }
    public void divideBy (int d){
        if(d==0){
            throw new IllegalArgumentException("Nu se imparte");
        }
    }
}
