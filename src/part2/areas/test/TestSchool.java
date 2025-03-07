package part2.areas.test;

import part2.areas.model.*;

public class TestSchool {
    public static void main(String[] args) {

        // Create Space
        Space space1 = new Office(1,20.0f, true, 2.1f);
        Space space2 = new Laboratory(2,2.3f,true,2.3f,3, true,4,true,3);
        Space space3 = new GymRoom(3, 2.0f, true,2.3f, 4, true, 1, true, true, 3);
        Space space4 = new ComputerRoom(4,3.0f,true, 1.2f, 3, true, 2, true, 10);

        // Get Electricity Consumption By Surface
        System.out.println(space1.getElectricityConsumptionBySurface());
        System.out.println(space2.getElectricityConsumptionBySurface());
        System.out.println(space3.getElectricityConsumptionBySurface());
        System.out.println(space4.getElectricityConsumptionBySurface());

        //Get Space by Student
        ClassRoom classRoom = new GymRoom(4, 2.0f, true,2.3f, 4, true, 1, true, true, 3);
        System.out.println( classRoom.getSurfaceAreaByStudent());
    }
}
