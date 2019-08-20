package ru.tustik.googleplay.parser;

import ru.tustik.googleplay.vo.AppInfo;

public interface AppInfoParser {
    AppInfo parceCategory(String appId);
}
