package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Parameter;

public class MyQueryMojo extends AbstractMojo {

    @Parameter(property = "url")
    private String _url;

    @Parameter(property = "timeout")
    private int _timeout;

    @Parameter(property = "options")
    private String[] _options;

    public void setUrl(String url) {
        _url = url;
    }

    public void setTimeout(int timeout) {
        _timeout = timeout;
    }

    public void setOptions(String[] options) {
        _options = options;
    }

    public void execute()
            throws MojoExecutionException {
        getLog().info("Hello, world.");
    }
}
