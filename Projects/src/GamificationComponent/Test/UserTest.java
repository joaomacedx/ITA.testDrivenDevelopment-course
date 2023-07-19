package GamificationComponent.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import GamificationComponent.Enum.PointType;
import GamificationComponent.Exception.PointValueCannotBeNegativeException;
import GamificationComponent.Exception.UserNameCannotBeNullException;
import GamificationComponent.Implementation.Point;
import GamificationComponent.Implementation.User;

public class UserTest {

    @Test(expected = UserNameCannotBeNullException.class)
    public void newUser_failure_WHEN_the_name_is_empty_THEN_throw_new_UserNameCannotBeNullException() {
         //Arrange
        String expectedName = "";
        User expectedUser = null;

        //Act
        User actualUser =  new User(expectedName);

        //Assert
        assertEquals(expectedUser,actualUser);
    }

    @Test
    public void newUser_failure_WHEN_the_name_is_not_empty_THEN_create_a_new_User_instance() {
         //Arrange
        String name = "Macedo";
        User expectedUser = new User(name);

        //Act
        User actualUser =  new User(name);

        //Assert
        assertEquals(expectedUser.name, actualUser.name);;
    }

    @Test(expected = PointValueCannotBeNegativeException.class)
    public void applyPoints_failure_WHEN_the_point_value_is_empty_THEN_throw_new_PointValueCannotBeNegativeException() {
         //Arrange
        String name = "Macedo";
        User actualUser = new User(name);
        List<Point> unexpectedListPoint = new ArrayList<Point>();
        Point validPoint = new Point(PointType.ESTRELA, 40);
        unexpectedListPoint.add(validPoint);        


        //Act
        actualUser.applyPoint(new Point(PointType.ESTRELA, 0));

        //Assert
        assertNotSame(unexpectedListPoint, actualUser.userPoints);
    }

    @Test
    public void applyPoints_suceedes_WHEN_the_point_value_is_valid_THEN_add_the_point_in_userPoints_list() {
         //Arrange
        String name = "Macedo";
        User actualUser = new User(name);
        List<Point> expectedListPoint = new ArrayList<Point>();
        Point validPoint = new Point(PointType.ESTRELA, 40);
        expectedListPoint.add(validPoint);        


        //Act
        actualUser.applyPoint(validPoint);

        //Assert
        assertEquals(expectedListPoint.size(), actualUser.userPoints.size());
        assertTrue(actualUser.userPoints.contains(validPoint));
    }
}
