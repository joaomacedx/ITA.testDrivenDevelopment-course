package GamificationComponent.Implementation;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import GamificationComponent.Enum.PointType;
import GamificationComponent.Exception.PointValueCannotBeNegativeException;
import GamificationComponent.Exception.UserNameCannotBeNullException;
import GamificationComponent.Helpers.IntegerCheckHelper;
import GamificationComponent.Helpers.StringCheckHelper;

public class User {

    public UUID id;

    public String name;

    public List<Point> userPoints =  new ArrayList<Point>();

    public User(String name) {
        if(StringCheckHelper.isEmpty(name))
            throw new UserNameCannotBeNullException("User name cannot be null, try again");
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public void applyPoint(Point pointToApply) {
        if(IntegerCheckHelper.isEmpty(pointToApply.value))
            throw new PointValueCannotBeNegativeException("Your point has a point value negative, please try again");
        this.userPoints.add(pointToApply);
    }

    public int getUserPointsByType(PointType pointType) {
        int pointsByType = 0;
        if(this.userPoints.isEmpty())
            return pointsByType;
        for (Point point : this.userPoints) {
            if(point.getPointType() == pointType) {
                pointsByType+= point.value;
            }
        }
        return pointsByType;
    }
}
