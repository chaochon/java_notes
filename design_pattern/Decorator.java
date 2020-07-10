package design_pattern;

public abstract class Decorator extends Birg {
    Birg birg;
    public Decorator(){
    }
    public Decorator(Birg birg){
        this.birg = birg;
    }
    public abstract int eleFly();
}
