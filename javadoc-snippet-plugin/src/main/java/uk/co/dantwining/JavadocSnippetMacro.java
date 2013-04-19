package uk.co.dantwining;

import org.apache.maven.doxia.macro.AbstractMacro;

import org.apache.maven.doxia.macro.MacroExecutionException;
import org.apache.maven.doxia.macro.MacroRequest;
import org.apache.maven.doxia.macro.snippet.SnippetMacro;
import org.apache.maven.doxia.sink.Sink;

/**
 * @plexus.component role="org.apache.maven.doxia.macro.Macro" role-hint="javadoc-snippet"
 */
public class JavadocSnippetMacro
    extends SnippetMacro
{

    @Override
    public void execute( Sink sink, MacroRequest request )
        throws MacroExecutionException
    {
        Sink javadocSink = new JavadocSink(sink);

        super.execute(javadocSink, request);

    }

}
