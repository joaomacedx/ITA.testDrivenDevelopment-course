package GamificationComponent.Implementation;

import java.util.UUID;

import GamificationComponent.Enum.PointType;
import GamificationComponent.Helpers.IntegerCheckHelper;
import GamificationComponent.Exception.PointValueCannotBeNegativeException;

public class Point {

    public UUID Id;

    private PointType type;

    public int value;

    public Point(PointType pointType, int pointsValue) {
        if(IntegerCheckHelper.isEmpty(pointsValue))
            throw new PointValueCannotBeNegativeException("This point has a point value negative, please try again");
        this.Id = UUID.randomUUID();
        this.type = pointType;
        this.value = pointsValue;
    }

    public PointType getPointType() {
        return this.type;
    }

}
