package eu.brickfire.bauerntinder.mapper;

import eu.brickfire.bauerntinder.type.Field;
import eu.brickfire.bauerntinder.type.Helper;
import eu.brickfire.bauerntinder.type.Square;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FieldMapper {
    Field selectFieldById(@Param("id") String id);
    List<Square> selectAllSquaresByFieldId(@Param("id") String id);
    List<Helper> selectAllHelperByFieldId(@Param("id") String id);
    int selectHelperCountByFieldId(@Param("id") String id);

}
