package uk.co.dantwining;

import org.apache.maven.doxia.sink.Sink;

/**
 * Created with IntelliJ IDEA.
 * User: dantwining
 * Date: 19/04/2013
 * Time: 06:27
 * To change this template use File | Settings | File Templates.
 */
public class JavadocSink extends SinkWrapper {
    public JavadocSink(Sink sink) {
        super(sink);
    }

    public void text(String s) {
        s = processJavadoc(s);
        super.text(s);
    }

    public void rawText(String s) {
        s = processJavadoc(s);
        super.rawText(s);
    }

    private String processJavadoc(String s) {
        System.out.println("PreMunged String:" + s + ":");
        s = s.replaceAll("^/*\\*\\*","");
        s = s.replaceAll("\\n\\s\\*/","\n");
        s = s.replaceAll("\\n\\s\\*","\n");
        s = s.trim();
        System.out.println("Munged String:" + s + ":");
        return s;
    }
}
