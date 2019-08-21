package ru.tustik.googleplay.parser;

import org.junit.Assert;
import org.junit.Test;
import ru.tustik.googleplay.parser.impl.JSoupAppInfoParser;
import ru.tustik.googleplay.vo.AppInfo;

public class JSoupAppInfoParserTest {

    @Test
    public void parserTest() {
        AppInfoParser parser = new JSoupAppInfoParser();
        AppInfo actual = parser.parceCategory("com.whaleapp.resorthotel");
        AppInfo expected = new AppInfo("com.whaleapp.resorthotel");
        expected.setAppName("Resort Hotel: Bay Story");
        expected.setDeveloper("WhaleApp LTD");
        expected.setAppCategory("Puzzle");
        Assert.assertEquals(expected, actual);
    }
}
