package com.company.yatsenko;


import org.apache.commons.lang3.StringUtils;
import org.junit.*;


public class App01 {
    @Test
    public void whenCalledisBlank_thenCorrect() {
        assert(StringUtils.isBlank(" "));
    }
    @Test
    public void whenCalledisMixedCase_thenCorrect() {
        assert(StringUtils.isMixedCase("abC"));
    }
    @Test
    public void whenCalledisAllLowerCase_thenCorrect() {
        assert(StringUtils.isAllLowerCase("abd"));
    }
    @Test
    public void whenCalledisEmpty_thenCorrect() {
        assert(StringUtils.isEmpty(""));
    }
    @Test
    public void whenCalledisAllUpperCase_thenCorrect() {
        assert(StringUtils.isAllUpperCase("ABC"));
    }
    @Test
    public void whenCalledisAlpha_thenCorrect() {
        assert(StringUtils.isAlpha("abc"));
    }
    @Test
    public void whenCalledisAlphanumeric_thenCorrect() {
        assert(StringUtils.isAlphanumeric("abc123"));
    }

}
