package ru.tustik.googleplay.vo;

import java.util.Objects;

public class AppInfo {
    private String appId;
    private String appCategory;
    private String developer;
    private String appName;

    public AppInfo(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppInfo appInfo = (AppInfo) o;
        return Objects.equals(appId, appInfo.appId) &&
                Objects.equals(appCategory, appInfo.appCategory) &&
                Objects.equals(developer, appInfo.developer) &&
                Objects.equals(appName, appInfo.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appCategory, developer, appName);
    }
}
