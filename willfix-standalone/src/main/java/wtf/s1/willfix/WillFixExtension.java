package wtf.s1.willfix;

import java.util.List;

import wtf.s1.willfix.logging.LevelLog;

public class WillFixExtension {

    /**
     * 是否开启该插件
     */
    public boolean enable = true;

    public boolean enableInDebug = false;

    public boolean needVerify = true;

    /**
     * 需要用TryCatchBlock包住的方法
     */
    public List<String> methodList;

    public String separator = "#";

    public String exceptionHandler;

    private LevelLog.Level level = LevelLog.Level.INFO;

    public boolean isEnable() {
        return enable;
    }

    public void enable(boolean enable) {
        this.enable = enable;
    }

    public List<String> getMethodList() {
        return methodList;
    }

    public void setMethodList(List<String> methodList) {
        this.methodList = methodList;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public void logLevel(String level) {
        this.level = LevelLog.Level.valueOf(level);
    }

    public LevelLog.Level getLogLevel() {
        return level;
    }

    public boolean isEnableInDebug() {
        return enableInDebug;
    }

    public void enableInDebug(boolean enableInDebug) {
        this.enableInDebug = enableInDebug;
    }

    public boolean isNeedVerify() {
        return needVerify;
    }

    public void needVerify(boolean needVerify) {
        this.needVerify = needVerify;
    }

    public String getExceptionHandler() {
        return exceptionHandler;
    }

    public void exceptionHandler(String catchHandler) {
        this.exceptionHandler = catchHandler;
    }
}