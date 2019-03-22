package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Says "Hi" to the user.
 *
 */
@Mojo( name = "sayhi")
public class GreetingMojo extends AbstractMojo {

    /**
     * The greeting to display
     */
    @Parameter( property = "sayhi.greeting", defaultValue = "Hello World!")
    private String greeting;

    /**
     * My boolean.
     */
    @Parameter
    private boolean myBoolean;

    /**
     * My Integer.
     */
    @Parameter
    private Integer myInteger;

    /**
     * My Double.
     */
    @Parameter
    private Double myDouble;

    /**
     * My Date.
     */
    @Parameter
    private Date myDate;

    /**
     * My File.
     */
    @Parameter
    private File myFile;

    /**
     * My URL.
     */
    @Parameter
    private URL myURL;

    public enum Color {
        GREEN,
        RED,
        BLUE
    }

    /**
     * My Enum
     */
    @Parameter(defaultValue = "GREEN")
    private Color myColor;

    /**
     * My Array.
     */
    @Parameter
    private String[] myArray;

    /**
     * My List.
     */
    @Parameter
    private List myList;

    /**
     * My Map.
     */
    @Parameter
    private Map myMap;

    /**
     * My Properties.
     */
    @Parameter
    private Properties myProperties;



    /**
     * URL
     */
    @Parameter
    private String urlStr;

    /**
     * 保存的文件名
     */
    @Parameter
    private String fileName;

    /**
     * 保存的路径
     */
    @Parameter
    private String savePath;

    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, world." );
        try {
            FileUtils.downLoadFromUrl(urlStr,
                    fileName, savePath);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}