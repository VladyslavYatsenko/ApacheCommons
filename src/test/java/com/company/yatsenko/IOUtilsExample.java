package com.company.yatsenko;

import javafx.beans.binding.BooleanExpression;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class IOUtilsExample {
    @Test
    public void whenCalledtoString_thenCorrect() {
        String[] array = {"a", "b", "c"};
        MatcherAssert.assertThat(ArrayUtils.toString(array), ArrayUtils.toString(array).equals("{a,b,c}"));
    }

    @Test
    public void whenCalledtoStringIfArrayisNull_thenCorrect() {
        MatcherAssert.assertThat(ArrayUtils.toString(null, "Array is null"), ArrayUtils.toString(null, "Array is null").equals("Array is null"));

    }

    //    @Test
//    public void whenCalledhashCode_thenCorrect() {
//        String[] array = {"a", "b", "c"};
//        assertThat(ArrayUtils.hashCode(array))
//                .isEqualTo(997619);
//    }
//    @Test
//    public void whenCalledtoMap_thenCorrect() {
//        String[][] array = {{"1", "one", }, {"2", "two", }, {"3", "three"}};
//        Map map = new HashMap();
//        map.put("1", "one");
//        map.put("2", "two");
//        map.put("3", "three");
//        assertThat(ArrayUtils.toMap(array))
//                .isEqualTo(map);
//    }
    @Test
    public void whenCalledisSameLength_thenCorrect() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assert (ArrayUtils.isSameLength(array1, array2));
    }

    //    @Test
//    public void whenCalledIndexOf_thenCorrect() {
//        int[] array = {1, 2, 3};
//        assertThat(ArrayUtils.indexOf(array, 1, 0))
//                .isEqualTo(0);
//    }


}
