package ru.tustik.googleplay.parser.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import ru.tustik.googleplay.parser.AppInfoParser;
import ru.tustik.googleplay.vo.AppInfo;

import java.io.IOException;

public class JSoupAppInfoParser implements AppInfoParser {
    @Override
    public AppInfo parceCategory(String appId) {
        try {
            AppInfo appInfo = new AppInfo();
            Document doc = Jsoup.connect("https://play.google.com/store/apps/details?id=" + appId)
                    .header("Content-Type","text/html")
                    .header("Upgrade-Insecure-Requests","1")
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Accept-Language", "en-US,en;q=0.9,en-US;q=0.8,en;q=0.7")
                    .header("Cache-control", "max-age=0")
                    .header("Host", "www.openaip.net")
                    .header("Connection", "keep-alive")
                    .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36")
                    .referrer("http://www.google.com")
                    .timeout(12000)
                    .followRedirects(true)
                    .get();
            Element category = doc.select("span.T32cc.UAO9ie").last().select("a").first();
            appInfo.setAppCategory(category.text());
            return appInfo;

        } catch (IOException e) {
            throw new RuntimeException("Failed to get appInfo from Google Play", e);
        }
    }
}
