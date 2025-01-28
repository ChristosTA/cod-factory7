package gr.aueb.cf.ch14.immutable;

public class Point3Dimmutable  {
    private final ImmutablePoint immutablePoint;
    private  final int z;


    public Point3Dimmutable() {
        immutablePoint = new ImmutablePoint();
        z = 0;

    }

    public Point3Dimmutable(ImmutablePoint immutablePoint, int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }


    public int getZ() {
        return z;
    }


}
