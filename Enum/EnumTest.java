package Enum;

public class EnumTest {

    public Ball ball = Ball.FOOTBALL;

    public static void main(String[] args){

        EnumTest enum_obj = new EnumTest();

        if(enum_obj.ball == Ball.FOOTBALL)
            System.out.print("Ball in EnumTest is FootBall");
    }

}
