package outlets.java;

public class JamaicanOutlet implements NorthAmericanOutlet{
    private static final double WORKING_VOLTAGE = 110.00;

    @Override
    public Double provide110Volts(){
        System.out.println("Jamaican Outlet providing " + WORKING_VOLTAGE + " of power!");
        return WORKING_VOLTAGE;
    }

    @Override
    public Boolean isFunctioning(){
        System.out.println("Jamaican Outlet is working.");
        if(WORKING_VOLTAGE >= (WORKING_VOLTAGE * 0.90)){
            return Boolean.TRUE;
        } else{
            return Boolean.FALSE;
        }
    }
}
