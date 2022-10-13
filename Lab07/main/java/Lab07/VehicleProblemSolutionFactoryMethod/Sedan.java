package Lab07.VehicleProblemSolutionFactoryMethod;

public class Sedan extends Vehicle{

    public Sedan(int numberOfPassengers,int distanceKM,int timeMinutes) {
        super(numberOfPassengers,distanceKM,timeMinutes);
    }

    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }

    @Override
    public int perHeadFare(){
        return (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
    }


}
