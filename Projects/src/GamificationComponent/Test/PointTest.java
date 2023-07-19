package GamificationComponent.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import GamificationComponent.Enum.PointType;
import GamificationComponent.Exception.PointValueCannotBeNegativeException;
import GamificationComponent.Implementation.Point;

public class PointTest {
    
    @Test(expected = PointValueCannotBeNegativeException.class)
    public void newPoint_failure_WHEN_the_point_value_is_negative_THEN_throw_new_PointValueCannotBeNegativeException() {
         //Arrange
        int expectedPointValue = -1;
        PointType expectedPointType = PointType.ESTRELA;
        Point expectedPoint = null;

        //Act
        Point actualPoint =  new Point(expectedPointType, expectedPointValue);

        //Assert
        assertEquals(expectedPoint,actualPoint);
    }

    @Test
    public void newPoint_suceedes_WHEN_the_point_value_is_positive_and_not_equal_zero_THEN_create_a_new_Point_instance_and_and_the_id_must_be_unique_for_each_instance() {
         //Arrange
        int expectedPointValue = 10;
        PointType expectedPointType = PointType.ESTRELA;
        Point expectedPoint = new Point(expectedPointType, expectedPointValue);

        //Act
        Point actualPoint =  new Point(expectedPointType, expectedPointValue);

        //Assert
        assertEquals(expectedPoint.value,actualPoint.value);
        assertNotEquals(expectedPoint.Id, actualPoint.Id);
    }

    @Test 
    public void getPointType_suceedes_WHEN_the_point_already_exists_THEN_return_the_correct_type_of_the_point() {
         //Arrange
        int expectedPointValue = 40;
        PointType expectedPointType = PointType.ESTRELA;
        Point point = new Point(expectedPointType, expectedPointValue);

        //Act
        PointType actualPointType = point.getPointType();

        //Assert
        assertEquals(expectedPointType,actualPointType);
    }
}
