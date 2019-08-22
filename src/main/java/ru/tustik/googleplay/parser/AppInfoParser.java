package ru.tustik.googleplay.parser;

import ru.tustik.googleplay.vo.AppInfo;

public interface AppInfoParser {
    AppInfo parceCategory(String appId);
    AppInfo parceCategory(String appId, String lang);
}
