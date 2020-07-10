package design_pattern;

public class SparrowDecorator extends Decorator {

    public SparrowDecorator(Birg birg){
        super(birg);
    }
    @Override
    public int eleFly(){
        return 50;
    }
    @Override
    public int fly(){
        return this.birg.fly()+this.eleFly();
    }

    public static void main(String[] arg){

        Sparrow sparrow = new Sparrow();
        int distance_sparrow = sparrow.fly();
        SparrowDecorator sparrowDecorator = new SparrowDecorator(sparrow);
        int distance_sparrowDecorator = sparrowDecorator.fly();
        System.out.printf("sparrow:%d, sparrowDecorator:%d", distance_sparrow, distance_sparrowDecorator);

    }

}
