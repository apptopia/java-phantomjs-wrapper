package com.moodysalem.phantomjs.wrapper;

import org.apache.commons.exec.CommandLine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PhantomJSOptions {
    public File getLocalStoragePath() {
        return localStoragePath;
    }

    public void setLocalStoragePath(File localStoragePath) {
        this.localStoragePath = localStoragePath;
    }

    public enum YesNo {
        yes, no
    }

    public enum SSLProtocol {
        sslv3, sslv2, tlsv1, any
    }

    private boolean help;
    private boolean version;
    private File cookiesFile;
    private Boolean diskCache;
    private Boolean ignoreSslErrors;
    private Boolean loadImages;
    private File localStoragePath;
    private Long localStorageQuota;
    private Boolean localToRemoteUrlAccess;
    private Long maxDiskCacheSize;
    private String outputEncoding;

    private Short remoteDebuggerPort;
    private YesNo remoteDebuggerAutorun;

    private String proxy;
    private String proxyType;
    private String proxyAuth;

    private String scriptEncoding;

    private SSLProtocol sslProtocol;
    private String sslCertificatesPath;
    private Boolean webSecurity;

    private Boolean webdriver;
    private String webdriverSeleniumGridHub;

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isVersion() {
        return version;
    }

    public void setVersion(boolean version) {
        this.version = version;
    }

    public File getCookiesFile() {
        return cookiesFile;
    }

    public void setCookiesFile(File cookiesFile) {
        this.cookiesFile = cookiesFile;
    }

    public Boolean getDiskCache() {
        return diskCache;
    }

    public void setDiskCache(Boolean diskCache) {
        this.diskCache = diskCache;
    }

    public Boolean getIgnoreSslErrors() {
        return ignoreSslErrors;
    }

    public void setIgnoreSslErrors(Boolean ignoreSslErrors) {
        this.ignoreSslErrors = ignoreSslErrors;
    }

    public Boolean getLoadImages() {
        return loadImages;
    }

    public void setLoadImages(Boolean loadImages) {
        this.loadImages = loadImages;
    }

    public Long getLocalStorageQuota() {
        return localStorageQuota;
    }

    public void setLocalStorageQuota(Long localStorageQuota) {
        this.localStorageQuota = localStorageQuota;
    }

    public Boolean getLocalToRemoteUrlAccess() {
        return localToRemoteUrlAccess;
    }

    public void setLocalToRemoteUrlAccess(Boolean localToRemoteUrlAccess) {
        this.localToRemoteUrlAccess = localToRemoteUrlAccess;
    }

    public Long getMaxDiskCacheSize() {
        return maxDiskCacheSize;
    }

    public void setMaxDiskCacheSize(Long maxDiskCacheSize) {
        this.maxDiskCacheSize = maxDiskCacheSize;
    }

    public String getOutputEncoding() {
        return outputEncoding;
    }

    public void setOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
    }

    public Short getRemoteDebuggerPort() {
        return remoteDebuggerPort;
    }

    public void setRemoteDebuggerPort(Short remoteDebuggerPort) {
        this.remoteDebuggerPort = remoteDebuggerPort;
    }

    public YesNo getRemoteDebuggerAutorun() {
        return remoteDebuggerAutorun;
    }

    public void setRemoteDebuggerAutorun(YesNo remoteDebuggerAutorun) {
        this.remoteDebuggerAutorun = remoteDebuggerAutorun;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getProxyType() {
        return proxyType;
    }

    public void setProxyType(String proxyType) {
        this.proxyType = proxyType;
    }

    public String getProxyAuth() {
        return proxyAuth;
    }

    public void setProxyAuth(String proxyAuth) {
        this.proxyAuth = proxyAuth;
    }

    public String getScriptEncoding() {
        return scriptEncoding;
    }

    public void setScriptEncoding(String scriptEncoding) {
        this.scriptEncoding = scriptEncoding;
    }

    public SSLProtocol getSslProtocol() {
        return sslProtocol;
    }

    public void setSslProtocol(SSLProtocol sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    public String getSslCertificatesPath() {
        return sslCertificatesPath;
    }

    public void setSslCertificatesPath(String sslCertificatesPath) {
        this.sslCertificatesPath = sslCertificatesPath;
    }

    public Boolean getWebSecurity() {
        return webSecurity;
    }

    public void setWebSecurity(Boolean webSecurity) {
        this.webSecurity = webSecurity;
    }

    public Boolean getWebdriver() {
        return webdriver;
    }

    public void setWebdriver(Boolean webdriver) {
        this.webdriver = webdriver;
    }

    public String getWebdriverSeleniumGridHub() {
        return webdriverSeleniumGridHub;
    }

    public void setWebdriverSeleniumGridHub(String webdriverSeleniumGridHub) {
        this.webdriverSeleniumGridHub = webdriverSeleniumGridHub;
    }

    public void apply(CommandLine cmd, Map<String, Object> args) {
        List<CommandLineArgument> arguments = new ArrayList<>();

        if (isHelp()) {
            arguments.add(new CommandLineArgument("--help"));
        }
        if (isVersion()) {
            arguments.add(new CommandLineArgument("--version"));
        }

        if (getCookiesFile() != null) {
            arguments.add(new CommandLineArgument("--cookies-file=${cookies-file}", "cookies-file", getCookiesFile()));
        }

        if (getDiskCache() != null) {
            arguments.add(new CommandLineArgument("--disk-cache=${disk-cache}", "disk-cache", getDiskCache()));
        }

        if (getIgnoreSslErrors() != null) {
            arguments.add(new CommandLineArgument("--ignore-ssl-errors=${ignore-ssl-errors}", "ignore-ssl-errors",
                    getIgnoreSslErrors()));
        }

        if (getLoadImages() != null) {
            arguments.add(new CommandLineArgument("--load-images=${load-images}", "load-images", getLoadImages()));
        }

        if (getLocalStoragePath() != null) {
            arguments.add(new CommandLineArgument("--local-storage-path=${local-storage-path}", "local-storage-path",
                    getLocalStoragePath()));
        }

        if (getLocalToRemoteUrlAccess() != null) {
            arguments.add(new CommandLineArgument("--local-to-remote-url-access=${local-remote-url-access}", "local-remote-url-access",
                    getLocalToRemoteUrlAccess()));
        }

        if (getMaxDiskCacheSize() != null) {
            arguments.add(new CommandLineArgument("--max-disk-cache-size=${max-disk-cache-size}", "max-disk-cache-size",
                    getMaxDiskCacheSize()));
        }
        if (getOutputEncoding() != null) {
            arguments.add(new CommandLineArgument("--output-encoding=${output-encoding}", "output-encoding",
                    getOutputEncoding()));
        }
        if (getRemoteDebuggerPort() != null) {
            arguments.add(new CommandLineArgument("--remote-debugger-port=${remote-debugger-port}", "remote-debugger-port",
                    getRemoteDebuggerPort()));
        }
        if (getRemoteDebuggerAutorun() != null) {
            arguments.add(new CommandLineArgument("--remote-debugger-autorun=${remote-debugger-autorun}", "remote-debugger-autorun",
                    getRemoteDebuggerAutorun().name()));
        }

        if (getProxy() != null) {
            arguments.add(new CommandLineArgument("--proxy=${proxy}", "proxy", getProxy()));
        }
        if (getProxyType() != null) {
            arguments.add(new CommandLineArgument("--proxy-type=${proxy-type}", "proxy-type", getProxyType()));
        }

        if (getProxyAuth() != null) {
            arguments.add(new CommandLineArgument("--proxy-auth=${proxy-auth}", "proxy-auth", getProxyAuth()));
        }

        if (getScriptEncoding() != null) {
            arguments.add(new CommandLineArgument("--script-encoding=${script-encoding}", "script-encoding",
                    getScriptEncoding()));
        }
        if (getSslProtocol() != null) {
            arguments.add(new CommandLineArgument("--ssl-protocol=${ssl-protocol}", "ssl-protocol", getSslProtocol().name()));
        }

        if (getSslCertificatesPath() != null) {
            arguments.add(new CommandLineArgument("--ssl-certificates-path=${ssl-cert-path}", "ssl-cert-path",
                    getSslCertificatesPath()));
        }
        if (getWebSecurity() != null) {
            arguments.add(new CommandLineArgument("--web-security=${web-security}", "web-security", getWebSecurity()));
        }

        if (getWebdriver() != null) {
            arguments.add(new CommandLineArgument("--webdriver"));
            if (getWebdriverSeleniumGridHub() != null) {
                arguments.add(new CommandLineArgument("--webdriver-selenium-grid-hub=${webdriver-selenium-grid-hub}",
                        "webdriver-selenium-grid-hub", getWebdriverSeleniumGridHub()));
            }
        }

        for (CommandLineArgument cla : arguments) {
            cla.apply(cmd, args);
        }
    }

    @Override
    public String toString() {
        List<String> args = new ArrayList<>();

        if (isHelp()) {
            args.add("--help");
        }
        if (isVersion()) {
            args.add("--version");
        }

        if (getCookiesFile() != null) {
            args.add("--cookies-file=" + getCookiesFile());
        }

        if (getDiskCache()) {
            args.add("--disk-cache=" + getDiskCache());
        }

        if (getIgnoreSslErrors()) {
            args.add("--ignore-ssl-errors=" + getIgnoreSslErrors());
        }

        if (getLoadImages()) {
            args.add("--load-images=" + getLoadImages());
        }

        if (getLocalStoragePath() != null) {
            args.add("--local-storage-path=" + getLocalStoragePath());
        }

        if (getLocalToRemoteUrlAccess() != null) {
            args.add("--local-to-remote-url-access=" + getLocalToRemoteUrlAccess());
        }
        if (getMaxDiskCacheSize() != null) {
            args.add("--max-disk-cache-size=" + getMaxDiskCacheSize());
        }
        if (getOutputEncoding() != null) {
            args.add("--output-encoding=" + getOutputEncoding());
        }
        if (getRemoteDebuggerPort() != null) {
            args.add("--remote-debugger-port=" + getRemoteDebuggerPort());
        }
        if (getRemoteDebuggerAutorun() != null) {
            args.add("--remote-debugger-autorun=" + getRemoteDebuggerAutorun().name());
        }

        if (getProxy() != null) {
            args.add("--proxy=" + getProxy());
        }
        if (getProxyType() != null) {
            args.add("--proxy-type=" + getProxyType());
        }

        if (getProxyAuth() != null) {
            args.add("--proxy-auth=" + getProxyAuth());
        }

        if (getScriptEncoding() != null) {
            args.add("--script-encoding=" + getScriptEncoding());
        }
        if (getSslProtocol() != null) {
            args.add("--ssl-protocol=" + getSslProtocol().name());
        }

        if (getSslCertificatesPath() != null) {
            args.add("--ssl-certificates-path=" + getSslCertificatesPath());
        }
        if (getWebSecurity() != null) {
            args.add("--web-security=" + getWebSecurity());
        }

        if (getWebdriver() != null) {
            args.add("--webdriver");
            if (getWebdriverSeleniumGridHub() != null) {
                args.add("--webdriver-selenium-grid-hub=" + getWebdriverSeleniumGridHub());
            }
        }

        return args.size() > 0 ? args.stream().collect(Collectors.joining(" ")) : "";
    }

}
