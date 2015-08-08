package com.promegu.xlog.base;

import java.util.List;
import java.util.Set;

/**
 * Created by guyacong on 2015/7/12.
 */
public class XLogSetting {
    public Set<MethodToLog> methodToLogs;
    public Set<String> XLoggerMethodsClassNames;
    public List<String> xlogClassPrefixes;
    public List<String> xlogClassNames;

    public XLogSetting(Set<MethodToLog> methodToLogs,
            Set<String> XLoggerMethodsClassNames, List<String> xlogClassPrefixes,
            List<String> xlogClassNames) {
        this.methodToLogs = methodToLogs;
        this.XLoggerMethodsClassNames = XLoggerMethodsClassNames;
        this.xlogClassPrefixes = xlogClassPrefixes;
        this.xlogClassNames = xlogClassNames;
    }

    public void appendPrefixes(List<String> classPrefixes, List<String> classNames){
        if(classPrefixes == null || classNames == null){
            return;
        }
        if(xlogClassPrefixes == null){
            xlogClassPrefixes = classPrefixes;
        } else {
            for (String classP : classPrefixes) {
                if (!xlogClassPrefixes.contains(classP)) {
                    xlogClassPrefixes.add(classP);
                }
            }
        }

        if(xlogClassNames == null){
            xlogClassNames = classNames;
        } else {
            for (String classN : classNames) {
                if (!xlogClassNames.contains(classN)) {
                    xlogClassNames.add(classN);
                }
            }
        }
    }
}
